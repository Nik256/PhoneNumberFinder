package com.epam.lab;

import com.epam.lab.finder.PhoneNumberFinder;
import com.epam.lab.formatter.PhoneNumberFormatter;
import com.epam.lab.utils.FileUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());
    private static final String INPUT_FILE_PATH = "src/main/resources/files/text.txt";
    private static final String OUTPUT_FILE_PATH = "src/main/resources/files/phone-numbers.txt";

    public static void main(String[] args) {
        List<String> lines = FileUtil.readFile(INPUT_FILE_PATH);
        List<String> phoneNumbers = new ArrayList<>();
        for (String str : lines) {
            phoneNumbers.addAll(PhoneNumberFormatter.format(
                    PhoneNumberFinder.find(str)));
        }
        logger.info(phoneNumbers);
        FileUtil.writeFile(phoneNumbers, OUTPUT_FILE_PATH);
    }
}
