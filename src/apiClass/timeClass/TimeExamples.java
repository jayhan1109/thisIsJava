package apiClass.timeClass;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeExamples {
    public static void main(String[] args) {
        int year = 2020;
        int month = 10;
        int dayOfMonth = 30;
        int hour = 11;
        int minute = 55;
        int second = 30;

        // LocalDate
        LocalDate currDate = LocalDate.now();
        LocalDate targetDate = LocalDate.of(year, month, dayOfMonth);

        // LocalTime
        LocalTime currTime = LocalTime.now();
        LocalTime targetTime = LocalTime.of(hour, minute, second);

        // LocalDateTime
        LocalDateTime currDateTime = LocalDateTime.now();
        LocalDateTime targetDateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute, second);

        // ZonedDateTime
        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime londonDateTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        // Instant (timestamp) - UTC time
        Instant i1 = Instant.now();
        Instant i2 = Instant.now();
        if (i1.isAfter(i2)) {
            System.out.println("i2 is earlier");
        } else if (i1.isBefore(i2)) {
            System.out.println("i1 is earlier");
        }

        // Parse to Date
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate localDate = LocalDate.parse("2024.05.21", formatter1);

        // Format to String
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/ MM/ dd a hh:mm");
        String nowString = now.format(formatter2);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
