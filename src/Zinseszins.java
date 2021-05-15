import java.util.Scanner;

public class Zinseszins {
    public static void main(String[] args){

        int length; //declaring running time

        double inves, interrate, value;//declaring variables that need decimal places

        Scanner input = new Scanner(System.in);//initialising scanner for user input

        System.out.println("Please input the desired investment: ");

        inves = input.nextDouble();//setting investment

        System.out.println("Please input the applying interest rate (i.e. 0.1 for 10%: ");

        interrate = input.nextDouble() + 1;//setting interest rate and adding 1 to bump it to 100+% (i.e. 0.06 + 1 = 1.06)

        System.out.println("Please input the desired running time in years: ");

        length = input.nextInt();//setting running time

        value = inves;//initially setting value as investment


        for (int i = 0 ; i < (length); i++) {

            value = value * interrate;//changing value to value after interest rate applied

            System.out.println("The current value of your investment after " + (i + 1) + " years is: " + value);



        }

    }
}
