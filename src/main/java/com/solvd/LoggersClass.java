package com.solvd;

import com.solvd.exceptions.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class LoggersClass {

    private static final Logger LOGGER = LogManager.getLogger(LoggersClass.class);

    public static void main(String[] args) throws AgeLessThanZeroException {

        try {
            checkFile("src/main/resources/text.tx", 1024);
        } catch (FileException e) {
            LOGGER.error(e.getMessage());
        }

        try {
            checkPassword("fff");
        } catch (PasswordTooShortException e) {
            LOGGER.error(e.getMessage());
        }

        tryWithResources();

        try {
            checkAge(-6);
        }catch (AgeLessThanZeroException e){
            LOGGER.error(e.getMessage());
        }

        countWords();

    }

    public static void countWords(){
        try {
            String content = FileUtils.readFileToString(new File("src/main/resources/text2.txt"), "UTF-8");
            Map<String, Integer> wordCounts = new HashMap<>();

            for (String word : StringUtils.split(content, " \n\r\t.,;!?()\"")) {
                word = word.toLowerCase();
                wordCounts.put(word, StringUtils.countMatches(content.toLowerCase(), word));
            }

            String result= StringUtils.join(wordCounts.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .toArray(), "\n");

            FileUtils.writeStringToFile(new File("src/main/resources/output.txt"), result, "UTF-8");

        } catch (IOException e) {
            System.err.println("Error processing the count file: " + e.getMessage());
        }

    }

    public static void checkAge(int age) throws AgeLessThanZeroException {
        if (age < 0) {
            throw new AgeLessThanZeroException("Age should be positive.");
        }
    }

    public static void checkFile(String fileName, long maxSize) throws FileException {
        File file = new File(fileName);

        if (!fileName.endsWith(".txt")) {
            throw new FileFormatException("Invalid file format. Only .txt format is available.");
        }

        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }
        if (file.length() > maxSize) {
            throw new FileTooLargeException("File exceeds maximum size of " + maxSize + "bytes.");
        }
        System.out.println("File is correct.");
    }

    public static void checkPassword(String password) throws PasswordTooShortException {
        if (password.length() < 8) {
            throw new PasswordTooShortException("Password is too short. Password should have more than 8 letters.");
        }
    }

    public static void tryWithResources() {
        String filePath = "src/main/resources/txt.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }


    }
}
