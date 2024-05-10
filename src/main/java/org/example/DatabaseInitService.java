package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseInitService {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        String input = "";

        File file = new File("src/main/resources/init_db.sql");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line += ";";
                createTable(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("src/main/resources/init_db.sql file - not found");
        }
        System.out.println("Tables - created successfully..");
    }

    public static void createTable(String input) {
        Database databaseConnection = Database.getInstance();
        Connection connection = databaseConnection.getConnection();

        try {

            Statement statement = connection.createStatement();
            String createTableSQL = input;

            statement.execute(createTableSQL);
            statement.close();
            //connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
