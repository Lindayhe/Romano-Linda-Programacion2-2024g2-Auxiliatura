package Date;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la fecha en formato 'día de mes, año':");
        String input = scanner.nextLine();
        scanner.close();

        String result = DateFormatter.formatDate(input);
        System.out.println(result);
    }
}
