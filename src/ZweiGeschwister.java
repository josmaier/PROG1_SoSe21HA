import java.util.Scanner;

public class ZweiGeschwister
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//Input scanner

        int alter1;//Alter Schwester 1
        int alter2;//Alter Schwester 2
        int durschnitt;//Durchschnittsalter
        int unterschied;//Altersunterschied


        System.out.println("Bitte das Alter von Schwester 1 eingeben: ");//Eingabe Alter Schwester 1
        alter1 = input.nextInt();

        System.out.println("Bitte das Alter von Schwester 2 eingeben: ");//Eingabe Alter Schwester 2
        alter2 = input.nextInt();

        durschnitt = (alter1 + alter2)/2;//Errrechnung des Durschnittsalters
        unterschied = alter1 - alter2;//Errechnung des Altersunterschieds

        if (unterschied < 0){
            unterschied = unterschied * -1;
        }//Korrektur falls der Altersunterschied negativ ist

        System.out.println("Der Altersunterschied betr�gt " + unterschied + " Jahre, mit einem Durschnittsalter von " + durschnitt + " Jahren.");//Ergebnisausgabe
    }
}
