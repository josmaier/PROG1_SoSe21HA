import java.util.Scanner;

public class RouletteMaster {
    public static void main(String[] args) {


        int     x, i  = 0, h = 0, j = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the desired amount of players");

        x = input.nextInt();

        System.out.println();

        Player[] players = new Player[x];

        /*
          This loop always skips the input for the first array entry it reads and I can not fix it,
          multiple loop types have been tried but none work
         */
        do {
            System.out.println();

            System.out.println("Please input the name of player " + h);

            String name = input.nextLine();

            players[h] = new Player(name);

            h++;
        }while (h < players.length);

        /*
            To have player 0 at least show a name it is initialised seperately with a fixed name
         */
        players[0] = new Player("Joscha");

        Croupier hans = new Croupier();


        do {
            if (players[i].getBank() <= 0) {
                continue;
            }

                players[i].info();

                System.out.println("Please input your desired bet type, 1 for normal betting on a number," +
                        "2 to bet if the number will be even or not, 3 to bet on a range of numbers: ");

                players[i].setBetType(input.nextInt());

                if (players[i].getBetType() == 1) {
                    System.out.println("Please input the number you desire to bet on:");

                    players[i].setBetNumber(input.nextInt());
                } else if (players[i].getBetType() == 2) {
                    System.out.println("Please input if you want to bet on the number being even or odd, " +
                            "input 1 for even and 2 for odd:");

                    players[i].setBetNumber(input.nextInt());

                } else {
                    System.out.println("Please input the range you want to bet on, input 1 for low (1-5) and 2 for " +
                            "high (6-10)");

                    players[i].setBetNumber(input.nextInt());
                }

                System.out.println("Please input the amount of money you want to bet:");

                players[i].setBetAmount(input.nextInt());

                while (players[i].getBetAmount() > players[i].getBank()) {
                    System.out.println("Error, you do not have this much money please try again");

                    players[i].setBetAmount(input.nextInt());
                }

                while (players[i].getBetAmount() <= 0) {
                    System.out.println("Error, you can not bet 0 or below please try again");

                    players[i].setBetAmount(input.nextInt());
                }
            hans.rollNumber();

            players[i].setBank(hans.resolveBet(players[i].getBetType(), hans.getRolledNumber(),
                    players[i].getBetNumber(), players[i].getBetAmount()));

            players[i].info();
            i++;
            if (i == players.length){
                i = 0;
            }
        }while (i < players.length);

    }
}

