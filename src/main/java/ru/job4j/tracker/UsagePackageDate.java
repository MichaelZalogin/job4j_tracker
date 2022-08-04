package ru.job4j.tracker;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("������� ����: " + currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println("������� �����: " + currentTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("������� ���� � �����: " + currentDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("������� ���� � ����� ����� ��������������: " + currentDateTimeFormat);
    }
}
