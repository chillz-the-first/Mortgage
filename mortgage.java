import java.text.NumberFormat;
import java.util.Scanner;

/**
 * mortgage
 */
public class mortgage {
    public static void main(String[] args) {
        System.out.print("Principal: ");
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float r = ((scanner.nextFloat()) / 12) / 100;
        System.out.print("Period (Years): ");
        int n = (scanner.nextInt()) * 12;
        int power = (int) Math.exp(n);

        double numerator = r * (Math.pow((1 + r), n));
        double denometor = (Math.pow((1 + r), n)) - 1;
        double m = (double) p * (numerator / denometor);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String money = currency.format(m);

        System.out.println("Mortgage: " + money);
    }
}