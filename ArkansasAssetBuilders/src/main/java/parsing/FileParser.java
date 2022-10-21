package parsing;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.io.*;

public class FileParser {

    Map<String, HashMap<String,String>> data;
    File file;
    List<String> fileLines;
    List<String> columnNames;

    /**
     * Constructor for FileParser Class.
     * @param filePath String, file path that contains the data in CSV format.
     * @throws IOException Exception from wrong file format or some other input issue.
     */
    FileParser(String filePath) throws IOException{
        this.file = new File(filePath);
        this.fileLines = Files.readAllLines(this.file.toPath(), StandardCharsets.UTF_8);
        this.data = new HashMap<>();
        this.columnNames = getColumnNames();
        parseCSV();
    }

    void capitalizeNames(List<String> line){
        String firstNameUpper = line.get(getColumn(" First Name")).toUpperCase();
        String lastNameUpper = line.get(getColumn(" Last Name")).toUpperCase();
        line.set(getColumn(" First Name"), firstNameUpper);
        line.set(getColumn(" Last Name"), lastNameUpper);
    }

    String createKey(List<String> line){
        int lastNameColumn = getColumn(" Last Name");
        int ssColumn = this.columnNames.contains("L4SSN")
                ? getColumn(" L4SSN")
                : getColumn(" Last 4");
        return line.get(lastNameColumn) + line.get(ssColumn);
    }

    int getColumn(String columnName){
        return this.columnNames.indexOf(columnName);
    }
    List<String> getColumnNames(){
        List<String> columnNames = Arrays.asList(this.fileLines.get(0).split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"));
        columnNames.replaceAll(String::trim);
        return columnNames;
    }

    /**
     * Parses a CSV file and places each row within an ArrayList.
     * Each row is split by commas, making each row a list of Strings.
     * @throws IOException, Calling File.readAllLines may not work if
     *                      file path is invalid.
     */
    void parseCSV() throws IOException{
        for (int line = 0; line < columnNames.size(); line++) {
            if (line > 0){
                List<String> splitLine = removeCommas(fileLines.get(line));
                splitLine.replaceAll(String::trim);
                capitalizeNames(splitLine);
                reformatDOB(splitLine, splitLine.contains("DOB")
                            ? getColumn("DOB")
                            : getColumn("Date of Birth"));
                reformatSS(splitLine, splitLine.contains("L4SSN")
                           ? getColumn("L4SSN")
                           : getColumn("Last 4"));
                String clientKey = createKey(splitLine);
                this.data.put(clientKey, new HashMap<>());
                for (int column = 0; column < splitLine.size(); column++){
                    String columnName = columnNames.get(column);
                    this.data.get(clientKey).put(columnName, splitLine.get(column));
                }
            }
        }
    }

    List<String> removeCommas(String line){
        return Arrays.asList(line.strip().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"));
    }

     void reformatDOB(List<String> line, int dobColumn){
        String[] dob = line.get(dobColumn).split("/");
        for (int idx = 0; idx < dob.length - 1; idx++){
            if (dob[idx].length() < 2){
                dob[idx] = "0" + dob[idx];
            }
        }
        line.set(dobColumn, String.join(",", dob));
    }

    void reformatSS(List<String> line, int ssColumn){
        StringBuilder ss = new StringBuilder(line.get(ssColumn));
        if (ss.length() > 4){
            ss = new StringBuilder(removeXChars(ss.toString()));
        }else{
            while(ss.length() < 4){
                ss.insert(0, "0");
            }
        }
        line.set(ssColumn, ss.toString());
    }

    String removeXChars(String ss){return ss.substring(ss.length()-4);}

}
