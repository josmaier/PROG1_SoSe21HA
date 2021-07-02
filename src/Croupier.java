
public class Croupier {
    /**
     * Initialising variables for class Croupier
     */
    public int rolledNumber;

    /**
     * Function to Roll a random number and output the result using the setRolledNumber Setter
     */
    public void rollNumber() {
        this.setRolledNumber();
        System.out.println("The rolled number is: " + this.getRolledNumber());
    }

    /**
     * Getter for rolled number
     *
     * @return int
     */
    public int getRolledNumber() {
        return this.rolledNumber;
    }

    /**
     * Setter for rolled number, generates a random number between 0 and 10
     */
    public void setRolledNumber() {
        Math.ceil(0);
        Math.floor(10);
        this.rolledNumber = (int) Math.floor(Math.random() * 12); //The maximum is inclusive and the minimum is inclusive
    }

    /**
     * Resolve bet function, resolves the bet after determining current bet type, if bet is false the bet amount is
     * left unchanged to be subtracted from the players bank
     *
     * @param playerBetSelection        Players Bet Type selection
     * @param rolledNumber              Rolled Number
     * @param playerBetNumber           Number the player bet on or range he bet on depending on bet Type
     * @param playerBetAmount           Amount of money a player is setting on the current bet
     * @return  int
     */
    public int resolveBet(int playerBetSelection, int rolledNumber, int playerBetNumber, int playerBetAmount) {
        switch (playerBetSelection) {
            case 1:
                if (playerBetNumber == rolledNumber) {
                    playerBetAmount = playerBetAmount * -2;
                }
                break;
            case 2:
                if (playerBetNumber == 1) {
                    if (rolledNumber % 2 == 0) {
                        playerBetAmount = playerBetAmount * -2;
                    }
                } else if (playerBetNumber == 2) {
                    if (rolledNumber % 2 != 0) {
                        playerBetAmount = playerBetAmount * -2;
                    }
                }
                break;
            case 3:
                if (playerBetNumber == 1) {
                    if (rolledNumber <= 5) {
                        playerBetAmount = playerBetAmount * -2;
                    }
                } else if (playerBetNumber == 2) {
                    if (rolledNumber >= 10) {
                        playerBetAmount = playerBetAmount * -2;
                    }
                }
        }
        return playerBetAmount;
    }
}
