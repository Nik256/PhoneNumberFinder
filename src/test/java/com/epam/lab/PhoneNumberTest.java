package com.epam.lab;

import com.epam.lab.finder.PhoneNumberFinder;
import com.epam.lab.formatter.PhoneNumberFormatter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneNumberTest {

    @Test
    void testFinder() {
        String text = "Phone number +1(431) 542 56 12 is unreachable.";
        assertEquals("+1(431) 542 56 12", PhoneNumberFinder.find(text).get(0));
    }

    @Test
    void testFormatter() {
        String phoneNumbers = "+1(431) 542 56 12";
        assertEquals("14315425612", PhoneNumberFormatter.format(List.of(phoneNumbers)).get(0));
    }
}
