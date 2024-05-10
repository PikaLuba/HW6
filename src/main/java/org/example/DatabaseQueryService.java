package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatabaseQueryService {

    public List<MaxSalaryWorker> findMaxSalaryWorker() {
        List<MaxSalaryWorker> result = new ArrayList<>();

        String input = "";
        input = readFile("find_max_salary_worker.sql");

        Database databaseConnection = Database.getInstance();
        Connection connection = databaseConnection.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(input);

            while (resultSet.next()) {
                result.add(new MaxSalaryWorker(
                        resultSet.getString("name"),
                        resultSet.getInt("salary")));
            }

            resultSet.close();
            statement.close();
            //  connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<MaxProgectCountClient> findMaxProgectClient() {
        List<MaxProgectCountClient> result = new ArrayList<>();

        String input = "";
        input = readFile("find_max_progects_client.sql");

        Database databaseConnection = Database.getInstance();
        Connection connection = databaseConnection.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(input);

            while (resultSet.next()) {
                result.add(new MaxProgectCountClient(
                        resultSet.getString("name"),
                        resultSet.getInt("progectCount")));
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<LongestProgect> findLongestProgect() {
        List<LongestProgect> result = new ArrayList<>();

        String input = "";
        input = readFile("find_longest_progect.sql");

        Database databaseConnection = Database.getInstance();
        Connection connection = databaseConnection.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(input);

            while (resultSet.next()) {
                result.add(new LongestProgect(
                        resultSet.getString("name"),
                        resultSet.getInt("month_count")));
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<YoungestEldestWorkers> findYoungestEldestWorkers() {
        List<YoungestEldestWorkers> result = new ArrayList<>();

        String input = "";
        input = readFile("find_youngest_eldest_workers.sql");

        Database databaseConnection = Database.getInstance();
        Connection connection = databaseConnection.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(input);

            while (resultSet.next()) {
                result.add(new YoungestEldestWorkers(
                        resultSet.getString("type"),
                        resultSet.getString("name"),
                        resultSet.getString("birhday")));
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<ProgectPrice> printProgectPrices() {
        List<ProgectPrice> result = new ArrayList<>();

        String input = "";
        input = readFile("print_project_prices.sql");

        Database databaseConnection = Database.getInstance();
        Connection connection = databaseConnection.getConnection();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(input);

            while (resultSet.next()) {
                result.add(new ProgectPrice(
                        resultSet.getString("name"),
                        resultSet.getInt("price")));
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String readFile(String fileName) {
        String input = "";

        File file = new File("src/main/resources/" + fileName);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                input += line + " ";
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName + " - not found");
        }
        return input;
    }

}

