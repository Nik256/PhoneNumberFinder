package com.epam.lab.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtil {
    private static final Logger logger = LogManager.getLogger(FileUtil.class.getName());

    public static List<String> readFile(String filePath) {
        Path path = Paths.get(filePath);
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            logger.error(e);
        }
        return lines;
    }

    public static void writeFile(List<String> data, String filePath) {
        Path path = Paths.get(filePath);
        try {
            Files.write(path, data);
        } catch (IOException e) {
            logger.error(e);
        }
    }
}
