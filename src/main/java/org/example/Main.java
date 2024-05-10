package org.example;

import java.util.List;

public class Main {
    public static final String DELIMITER = "----------";
    public static final String NAME = "Name = ";
    public static void main(String[] args) {

        DatabaseQueryService databaseQuery = new DatabaseQueryService();

        System.out.println(DELIMITER);
        List<MaxSalaryWorker> maxSalaryWorkers = databaseQuery.findMaxSalaryWorker();
        for (MaxSalaryWorker model : maxSalaryWorkers) {
            System.out.println(NAME + model.getName() + " Salary = " + model.getSalary());
        }

        System.out.println(DELIMITER);
        List<MaxProgectCountClient> maxProgectCountClients = databaseQuery.findMaxProgectClient();
        for (MaxProgectCountClient model : maxProgectCountClients) {
            System.out.println(NAME + model.getName() + " Progect Count = " + model.getProgectCount());
        }

        System.out.println(DELIMITER);
        List<LongestProgect> longestProgects = databaseQuery.findLongestProgect();
        for (LongestProgect model : longestProgects) {
            System.out.println(NAME + model.getName() + " Month Count = " + model.getMonthCount());
        }

        System.out.println(DELIMITER);
        List<YoungestEldestWorkers> youngestEldestWorkers = databaseQuery.findYoungestEldestWorkers();
        for (YoungestEldestWorkers model : youngestEldestWorkers) {
            System.out.println("Type = " + model.getType() + " Name = " + model.getName() + " DateOfBirth = " + model.getDateOfBirth());
        }

        System.out.println(DELIMITER);
        List<ProgectPrice> progectPrices = databaseQuery.printProgectPrices();
        for (ProgectPrice model : progectPrices) {
            System.out.println(NAME + model.getName() + " Price = " + model.getPrice());
        }
    }
}