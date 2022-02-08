import java.util.Scanner;

public class Interest_Calculator {
    public static void main(String[] args) {
        double money;
        int month;
        double rate;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        money = sc.nextDouble();
        System.out.println("Enter number of months: ");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        rate = sc.nextDouble();

        double total = 0;
        for (int i = 0; i < month ; i++) {
            total += money * (rate / 12) * month;
        }

        System.out.println("Total of interest: " + total);
    }
}
