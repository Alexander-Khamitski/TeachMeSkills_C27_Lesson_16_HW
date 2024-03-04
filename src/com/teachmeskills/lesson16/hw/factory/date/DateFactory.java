package com.teachmeskills.lesson16.hw.factory.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class DateFactory {

    public static String generateRandomDate() {
        LocalDate now = LocalDate.now();
        Random random = new Random();
        LocalDate registrationDate = now.minusDays(random.nextInt(100));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(registrationDate);
    }

}
