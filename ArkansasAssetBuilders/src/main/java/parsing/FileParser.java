package parsing;

import model.ClientDAO;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.io.*;

public class FileParser {

    List<String> columnNames;
    Map<String, HashMap<String,String>> data;
    List<String> fileLines;


    /**
     * Constructor for FileParser Class.
     * @param clientFile File, file that contains the data in CSV format.
     * @throws IOException Exception from wrong file format or some other input issue.
     */
    FileParser(File clientFile) throws IOException{
        this.data = new HashMap<>();
        this.fileLines = Files.readAllLines(clientFile.toPath(), StandardCharsets.UTF_8);
        this.columnNames = getColumnNames();
        parseCSV();
    }

    void capitalizeNames(List<String> line){
        String firstNameUpper = line.get(getColumn("First Name")).toUpperCase();
        String lastNameUpper = line.get(getColumn("Last Name")).toUpperCase();
        line.set(getColumn("First Name"), firstNameUpper);
        line.set(getColumn("Last Name"), lastNameUpper);
    }

    String createKey(List<String> line){
        int lastNameColumn = getColumn("Last Name");
        int ssColumn = this.columnNames.contains("L4SSN")
                ? getColumn("L4SSN")
                : getColumn("Last 4");
        return line.get(lastNameColumn) + line.get(ssColumn);
    }

    int getColumn(String columnName){
        return this.columnNames.indexOf(columnName);
    }

    List<String> getColumnNames(){
        List<String> columnNames = Arrays.asList(this.fileLines.get(0).split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"));
        columnNames.replaceAll(String::trim);
        columnNames.replaceAll(s -> s.replaceAll("[^\\w\\s]", ""));
        return columnNames;
    }

    HashMap<String, String> getClient(String client){
        return data.get(client);
    }

    String getClientProperty(HashMap<String, String> clientProperties, String property){
        return clientProperties.get(property);
    }

    void updateClient(){
        for (String key: this.data.keySet()){
            HashMap<String, String> clientData = this.data.get(key);
        }
    }

    /**
     * Parses a CSV file and places each row within an ArrayList.
     * Each row is split by commas, making each row a list of Strings.
     * @throws IOException, Calling File.readAllLines may not work if
     *                      file path is invalid.
     */
    void parseCSV() throws IOException{
        for (int line = 0; line < this.fileLines.size() - 1; line++) {
            if (line > 0){
                List<String> splitLine = removeCommas(this.fileLines.get(line));
                splitLine.replaceAll(String::trim);
                capitalizeNames(splitLine);
                if (this.columnNames.contains("DOB") || this.columnNames.contains("Date of Birth")) {
                    reformatDOB(splitLine, splitLine.contains("DOB")
                            ? getColumn("DOB")
                            : getColumn("Date of Birth"));
                }
                reformatSS(splitLine, splitLine.contains("L4SSN")
                           ? getColumn("L4SSN")
                           : getColumn("Last 4"));
                String clientKey = createKey(splitLine);
                this.data.put(clientKey, new HashMap<>());
                for (int column = 0; column < splitLine.size(); column++){
                    String columnName = this.columnNames.get(column);
                    this.data.get(clientKey).put(columnName, splitLine.get(column));
                }
            }
        }
    }

     void reformatDOB(List<String> line, int dobColumn){
        String[] dob = line.get(dobColumn).split("/");
        for (int idx = 0; idx < dob.length - 1; idx++){
            if (dob[idx].length() < 2){
                dob[idx] = "0" + dob[idx];
            }
        }
        line.set(dobColumn, String.join("/", dob));
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

    List<String> removeCommas(String line){
        List<String> newLine = Arrays.asList(line.strip().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"));
        newLine.replaceAll(s -> s.replaceAll("[\",]", ""));
        for (int value = 0; value < newLine.size(); value ++){
            if (newLine.get(value).contains("Sum")){
                newLine.set(value, newLine.get(value).substring(6));
            }
        }
        return newLine;
    }


    String removeXChars(String ss){return ss.substring(ss.length()-4);}

}
