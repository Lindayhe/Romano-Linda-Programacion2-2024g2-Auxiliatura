package Date;

import java.util.HashMap;

public class DateUtils {
    private static HashMap<String, Integer> daysInMonth = new HashMap<>();

    static {
        daysInMonth.put("enero", 31);
        daysInMonth.put("febrero", 28); 
        daysInMonth.put("marzo", 31);
        daysInMonth.put("abril", 30);
        daysInMonth.put("mayo", 31);
        daysInMonth.put("junio", 30);
        daysInMonth.put("julio", 31);
        daysInMonth.put("agosto", 31);
        daysInMonth.put("septiembre", 30);
        daysInMonth.put("octubre", 31);
        daysInMonth.put("noviembre", 30);
        daysInMonth.put("diciembre", 31);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getMonthNumber(String month) {
        switch (month.toLowerCase()) {
            case "enero": return 1;
            case "febrero": return 2;
            case "marzo": return 3;
            case "abril": return 4;
            case "mayo": return 5;
            case "junio": return 6;
            case "julio": return 7;
            case "agosto": return 8;
            case "septiembre": return 9;
            case "octubre": return 10;
            case "noviembre": return 11;
            case "diciembre": return 12;
            default: return -1;
        }
    }

    public static int getDaysInMonth(String month, int year) {
        if (month.equalsIgnoreCase("febrero") && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth.getOrDefault(month.toLowerCase(), -1);
    }
}
