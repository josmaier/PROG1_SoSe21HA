import java.util.Arrays;
import java.util.Scanner;

public class PrimzahlenBestimmenMitDemSiegDesEratosthenes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// setting scanner for user input

        System.out.print("Please set upper boundary: ");

        int upb = input.nextInt();

        boolean[] istPrim = new boolean[(upb + 1)];// initialising array istPrim

        Arrays.fill(istPrim, true);// setting all values of array to true

        // 0 and 1 are not prime numbers, so they are set to false
        istPrim[0] = false;
        istPrim[1] = false;

        for (int i = 2; i < istPrim.length; i++) {// looping through array from the number 2 on

            if (true == istPrim[i]) {// if the found entry is a prime number setting multiples of that to false
                for (int k = 2; k < istPrim.length; k++) {// variable for determining multiples of prime number

                    if (i * k > istPrim.length - 1) continue;// break to prevent out of bounds error
                    istPrim[i * k] = false;
                }
            }
        }

        for (int x = 0; x < istPrim.length; x++) {// outputting all values to console

            System.out.println(x + ": " + istPrim[x]);
        }
    }
}
