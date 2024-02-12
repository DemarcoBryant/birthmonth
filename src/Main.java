//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        System.out.println("Enter your birth month using a number 1-12:");
        birthMonth = in.nextInt();
        in.nextLine();
        if (birthMonth > 0 && birthMonth < 13) {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}