package com.pb.korol.hw9;

import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.FileAlreadyExistsException;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Random;

public class FileNumbers {
    public static void main(String[] args) {
        final String filePath1 = "numbers.txt";
        final String filePath2 = "odd-numbers.txt";
        final int rowCount = 10;
        final int colCount = 10;
        final int maxValue = 100;

        if (!createNumbersFile(filePath1, rowCount, colCount, maxValue)) return;
        if (!createOddNumbersFile(filePath1, filePath2)) return;

        System.out.println("Операции с файлами успешно выполнены.");
    }

    public static boolean createNumbersFile(String filePath, int rows, int cols, int max) {
        if (!createFile(filePath)) return false;

        Path path = Paths.get(filePath);

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < rows; i++) {
                if (i > 0) { writer.newLine(); }
                for (int j = 0; j < cols; j++) {
                    if (j > 0) { writer.write(" "); }
                    writer.write(randomStrNumber(max));
                }
            }
        } catch (IOException exWrite) {
            System.out.println("Ошибка записи в файл " + filePath + ": " + exWrite);
        }
        System.out.println("Данные записаны в файл " + filePath + ".");
        return true;
    }

    public static boolean createOddNumbersFile(String filePathFrom, String filePathTo) {
        if (!createFile(filePathTo)) return false;

        Path pathFrom = Paths.get(filePathFrom);
        Path pathTo = Paths.get(filePathTo);

        try (BufferedWriter writer = Files.newBufferedWriter(pathTo)) {
            try (BufferedReader reader = Files.newBufferedReader(pathFrom)) {
                String row;
                int i = 0;

                while ((row = reader.readLine()) != null) {
                    String[] strNumbers = row.split(" ");

                    if (i > 0) { writer.newLine(); }
                    for (int j = 0; j < strNumbers.length; j++) {
                        if (j > 0) { writer.write(" "); }
                        writer.write(replaceEven(strNumbers[j], "0"));
                    }
                    i++;
                }

            } catch (IOException exRead) {
                System.out.println("Ошибка чтения из файла " + filePathFrom + ": " + exRead);
                return false;
            }
        }
        catch (IOException exWrite) {
            System.out.println("Ошибка записи в файл " + pathTo + ": " + exWrite);
            return false;
        }
        System.out.println("Данные успешно записаны из файла " + filePathFrom + " в файл " + filePathTo + ".");
        return true;
    }

    private static boolean createFile(String filePath) {
        try {
            Files.createFile(Paths.get(filePath));
            System.out.println("Создан файл: " + filePath);
            return true;
        }
        catch (FileAlreadyExistsException ex) {
            System.out.println("Файл с таким именем уже существует: " + filePath);
            return true;
        }
        catch (IOException ex) {
            System.out.println("Ошибка создания файла: " + ex);
            return false;
        }
    }

    public static String randomStrNumber(int maxValue) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(maxValue + 1);
        return String.valueOf(randomInt);
    }

    public static String replaceEven(String strNumber, String replaceWith) {
        int intNumber = Integer.parseInt(strNumber);
        if (intNumber % 2 == 0) { return replaceWith; }
        else { return strNumber; }
    }
}
