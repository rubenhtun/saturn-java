import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateTimeApi {
    public static void main(String[] args) {
        // 1. Current Date and Time
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current DateTime: " + currentDateTime);

        // 2. Creating Specific Dates and Times
        LocalDate specificDate = LocalDate.of(2025, Month.MAY, 18);
        LocalTime specificTime = LocalTime.of(23, 18, 0);
        LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime);
        System.out.println("\nSpecific Date: " + specificDate);
        System.out.println("Specific Time: " + specificTime);
        System.out.println("Specific DateTime: " + specificDateTime);

        // 3. Working with Time Zones
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("\nCurrent DateTime in New York: " + zonedDateTime);

        // 4. Formatting Dates
        DateTimeFormatter formatter = DateTimeFormatter
            .ofPattern("dd MMMM yyyy, HH:mm:ss")
            .withLocale(Locale.US);
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("\nFormatted DateTime: " + formattedDateTime);

        // 5. Parsing Dates
        String dateString = "18 May 2025";
        DateTimeFormatter parseFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, parseFormatter);
        System.out.println("Parsed Date: " + parsedDate);

        // 6. Date Arithmetic
        LocalDate futureDate = currentDate.plus(10, ChronoUnit.DAYS);
        LocalDate pastDate = currentDate.minus(1, ChronoUnit.MONTHS);
        System.out.println("\nDate after 10 days: " + futureDate);
        System.out.println("Date before 1 month: " + pastDate);

        // 7. Duration and Period
        Duration duration = Duration.between(specificTime, LocalTime.of(23, 59, 59));
        System.out.println("\nDuration between times: " + duration.toMinutes() + " minutes");

        Period period = Period.between(currentDate, specificDate.plusYears(1));
        System.out.println("Period: " + period.getYears() + " years, " +
                          period.getMonths() + " months, " +
                          period.getDays() + " days");

        // 8. Checking Date Relationships
        boolean isBefore = currentDate.isBefore(specificDate);
        boolean isLeapYear = currentDate.isLeapYear();
        System.out.println("\nIs current date before specific date? " + isBefore);
        System.out.println("Is current year a leap year? " + isLeapYear);
    }
}