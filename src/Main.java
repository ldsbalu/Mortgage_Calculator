import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final int totalMonths =12;
        Scanner s = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = s.nextInt();
        System.out.println("Annual interest Rate: ");
        double annualInterest = s.nextDouble();
        double monthlyInterest = annualInterest/100/totalMonths;

        System.out.println("Period in years: ");
        int years =  s.nextInt();
        int numberOfPayments = years*totalMonths;

        double mortgage = principal*(monthlyInterest* Math.pow(1+monthlyInterest, numberOfPayments))/(Math.pow(1+monthlyInterest,numberOfPayments)-1);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + formattedMortgage);
    }
}
