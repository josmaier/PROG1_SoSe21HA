import java.util.Scanner;
public class MeilenYardsCo
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);//scanner for user input

        int choice;

        double in, m2, y2, f2, i2, hlp;//variables used for conversion



        System.out.println("Please input desired conversion, 1 for converting meters into imperial, 2 for converting inces into full imperial");

        choice = input.nextInt();//choosing which conversion to run

        if(choice == 1){

            System.out.println("Please input the distance you want to convert in the next steps");

            System.out.println("Please input Miles: ");//requesting user input

            double miles = input.nextDouble();//user input for lengths

            System.out.println("Please input yards: ");

            double yards = input.nextDouble();

            System.out.println("Please input feet: ");

            double feet = input.nextDouble();

            System.out.println("Please input inches: ");

            double inches = input.nextDouble();

            double meters = (miles * 1610) + (yards * 0.9144) + (feet * 0.3048) + (inches * 0.0254);//conversion of user inputs

            System.out.println("The input distance in meters is: " + meters);//output of conversion
        }
        /* tests for function 1

		inputs in miles, yards, feet, inches
		0100, 0, 0, 0 result: 161000 meters = correct
		10, 000100, 10, 10 result: 1694742 = correct
		0000, 0000, 0001, 0000 result: 0.3048 = correct
		0100, 1000000, 0, 0 result: 1075400 = correct
		3, 4.1, 10, 5.3 result = 4836.931659999999
        */
        else if (choice == 2){

            System.out.println("Please input the distance in Inches:");

            in = input.nextDouble();//initial input

            m2 = in / 63360;//calculating varaible

            int m3 = (int)m2;//conversion to int to loose decimal places

            hlp = in % 63360;//setting help variable as remaining length

            y2 = hlp / 36;

            int y3 = (int)y2;

            hlp = in % 36;

            f2 = hlp / 12;

            int f3 = (int)f2;

            i2 = hlp % 12;

            int i3 = (int)i2;

            if (m3 < 2){//output if conversion
                System.out.println(m3 + " Mile " + y3 + " Yards " + f3 + " Feet " + i3 + " Inch");
            }
            else{
                System.out.println(m3 + " Miles " + y3 + " Yards " + f3 + " Feet " + i3 + " Inch");
            }


        }
    }
}
