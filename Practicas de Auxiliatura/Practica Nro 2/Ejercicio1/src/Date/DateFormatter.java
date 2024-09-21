package Date;

import Date.DateUtils;

public class DateFormatter {

    public static String formatDate(String input) {
        String[] parts = input.split(" de |, ");
        if (parts.length != 3) {
            return "Formato inválido";
        }

        try {
            int day = Integer.parseInt(parts[0]);
            String month = parts[1].toLowerCase();
            int year = Integer.parseInt(parts[2]);

            int daysInMonth = DateUtils.getDaysInMonth(month, year);
            if (daysInMonth == -1) {
                return "Mes inválido, porfa intente de nuevo :).";
            }

            if (day < 1 || day > daysInMonth) {
                return "Fecha inválida. El mes " + month + " tiene " + daysInMonth + " días.";
            }

            String monthNumber = DateUtils.getMonthNumber(month) < 10
                ? "0" + DateUtils.getMonthNumber(month)
                : String.valueOf(DateUtils.getMonthNumber(month));

            return day + " / " + monthNumber + " / " + year;

        } catch (NumberFormatException e) {
            return "Error: No se puede convertir los valores de día o año en números.";
        }
    }
}

