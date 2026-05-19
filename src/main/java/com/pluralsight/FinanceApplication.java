package com.pluralsight;

import com.pluralsight.finance.*;

import java.util.Scanner;

public class FinanceApplication {

    private static final Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Portfolio name: ");
        String portfolioName = theScanner.nextLine().trim();

        System.out.print("Owner name: ");
        String ownerName = theScanner.nextLine().trim();

        Portfolio portfolio = new Portfolio(portfolioName, ownerName);

        boolean running = true;
        while (running) {
            printMenu();
            String choice = theScanner.nextLine().trim();

            switch (choice) {
                case "1":
                    addBankAccount(portfolio);
                    break;
                case "2":
                    addCreditCard(portfolio);
                    break;
                case "3":
                    addGold(portfolio);
                    break;
                case "4":
                    addJewelry(portfolio);
                    break;
                case "5":
                    addHouse(portfolio);
                    break;
                case "6":
                    printSummary(portfolio);
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown choice. Try again.");
            }
        }

        System.out.println();
        System.out.println("--- Final Portfolio ---");
        printSummary(portfolio);
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("Add an asset to your portfolio:");
        System.out.println("  1) Bank Account");
        System.out.println("  2) Credit Card");
        System.out.println("  3) Gold");
        System.out.println("  4) Jewelry");
        System.out.println("  5) House");
        System.out.println("  6) Show portfolio summary");
        System.out.println("  0) Done");
        System.out.print("Choice: ");
    }

    private static void addBankAccount(Portfolio portfolio) {
        int accountNumber = promptInt("  Account number: ");
        String owner       = promptString("  Owner name: ");
        double balance     = promptDouble("  Starting balance: ");
        portfolio.add(new BankAccount(accountNumber, owner, balance));
        System.out.println("  Added bank account.");
    }

    private static void addCreditCard(Portfolio portfolio) {
        String name          = promptString("  Card holder name: ");
        String accountNumber = promptString("  Account number: ");
        double balance       = promptDouble("  Current balance owed: ");
        portfolio.add(new Creditcard(name, accountNumber, balance));
        System.out.println("  Added credit card.");
    }

    private static void addGold(Portfolio portfolio) {
        double weight = promptDouble("  Weight (oz): ");
        portfolio.add(new Gold(weight));
        System.out.println("  Added gold.");
    }

    private static void addJewelry(Portfolio portfolio) {
        String name  = promptString("  Description (e.g. \"Wedding Ring\"): ");
        double karat = promptDouble("  Karat purity (1-24): ");
        portfolio.add(new Jewelry(name, karat));
        System.out.println("  Added jewelry.");
    }

    private static void addHouse(Portfolio portfolio) {
        int yearBuilt  = promptInt("  Year built: ");
        int squareFeet = promptInt("  Square feet: ");
        int bedrooms   = promptInt("  Bedrooms: ");
        portfolio.add(new House(yearBuilt, squareFeet, bedrooms));
        System.out.println("  Added house.");
    }

    private static void printSummary(Portfolio portfolio) {
        System.out.println();
        System.out.println(portfolio);
        System.out.printf("Net value:       $%.2f%n", portfolio.getValue());
        System.out.println("Most valuable:   " + portfolio.getMostValuable());
        System.out.println("Least valuable:  " + portfolio.getLeastValuable());
    }
    private static String promptString(String prompt) {
        System.out.print(prompt);
        return theScanner.nextLine().trim();
    }

    private static int promptInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = theScanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("  Please enter a whole number.");
            }
        }
    }

    private static double promptDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = theScanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("  Please enter a number.");
            }
        }
    }

}

