package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabasePopulateService {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        String input = "";

        File file = new File("src/main/resources/populate_db.sql");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line += ";";
                insertTable(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("src/main/resources/populate_db.sql file - not found");
        }
        System.out.println("Insertion into table was successful.");
    }

    public static void insertTable(String input) {
        Database databaseConnection = Database.getInstance();
        Connection connection = databaseConnection.getConnection();

        try {

            Statement statement = connection.createStatement();
            String insertTableSQL = input;

            statement.executeUpdate(insertTableSQL);
            statement.close();
            //connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
