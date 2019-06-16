package com.epam.lab.formatter;

import java.util.List;
import java.util.stream.Collectors;

public class PhoneNumberFormatter {

    public static List<String> format(List<String> phoneNumbers) {
        return phoneNumbers.stream()
                .map(s -> s.replaceAll("[^\\d]", ""))
                .collect(Collectors.toList());
    }
}
