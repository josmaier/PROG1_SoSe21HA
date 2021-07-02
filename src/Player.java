public class Player {

    /**
     * Initialising Variables for class Player
     */
    private final String playerName;
    public int betAmount, betType, betNumber, bank;

    /**
     * Constructor for a new object of the class Player with the start capital of 1000
     *
     * @param playerName    String name of player
     */
    public Player(String playerName){
        this.playerName = playerName;
        this.bank = 1000;
    }

    /**
     * Method prints string with information about the player
     */
    void info(){
        System.out.println(this.getPlayerName() + " has " + getBank() + "€ left in the bank");
    }

    /**
     * Getter for amount of money a player has left
     *
     * @return int
     */
    public int getBank(){
        return this.bank;
    }

    /**
     * Getter for player name
     *
     * @return String
     */
    public String getPlayerName(){
        return this.playerName;
    }

    /**
     * Getter for player bet amount
     *
     * @return int
     */
    public int getBetAmount(){
        return this.betAmount;
    }

    /**
     * getter for the bet type selected by the player
     *
     * @return int
     */
    public int getBetType(){
        return this.betType;
    }

    /**
     * Getter for the number the player bet on
     *
     * @return int
     */
    public int getBetNumber(){
        return this.betNumber;
    }

    /**
     * Setter for Money a player has left in the bank
     *
     * @param bank Amount of money a player has left in the bank
     */
    public void setBank(int bank){
        this.bank = this.getBank() - bank;
    }

    /**
     * Setter for amount of money a player places on their current bet
     *
     * @param betAmount Amount of money a player places on their current bet
     */
    public void setBetAmount(int betAmount){
        this.betAmount = betAmount;
    }

    /**
     * Setter for bet type selected by a player
     *
     * @param betType Bet type selected by a player
     */
    public void setBetType(int betType){
        this.betType = betType;
    }

    /**
     * Setter for the number the player bet on
     *
     * @param betNumber Setter for the number the player bet on
     */
    public void setBetNumber(int betNumber){
        this.betNumber = betNumber;
    }
}
