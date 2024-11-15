public class CoinGame {


    private int startingCoins;  // starting number of coins
    private int maxRounds;      // maximum number of rounds played
    private int roundTracker = 1; // ADDED TO ENABLE TESTING
    
    
    public CoinGame(int s, int r) {
    startingCoins = s;
    maxRounds = r;
    }
     
    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.
        THIS WAS AN "implementation not shown" METHOD IN THE ORIGINAL FRQ,
        BUT IS INCLUDED HERE TO ENABLE TESTING
      */
    public int getPlayer1Move() {
      int result;
      if (roundTracker == 1 || roundTracker == 2 || roundTracker == 4) {
        result = 2;
      } else if (roundTracker == 3) {
        result = 1;
      } else {
        result = 3;
      }
      roundTracker++;
      return result;
    }
     
    /** Returns the number of coins (1, 2, or 3) that player 2 will spend,
      * as described in part (a).
      */
      public int getPlayer2Move(int round){
        int result; 
        if(round%3 == 0){
            result = 3;
        } else if (round % 2 == 0){
            result = 2;
        } else {
            result = 1;
        }
        return result;
    }
    
    
    
    /** Plays a simulated game between two players, as described in part
      * (b).
      */
      public void playGame(){
        int round = 1;
        int player1Coins = startingCoins;
        int player2Coins = startingCoins;
        int player1Move;
        int player2Move;
        while(player1Coins >= 3 && player2Coins >= 3 && round <= maxRounds){
            player1Move = getPlayer1Move();
            player2Move = getPlayer2Move(round);
            player1Coins -= player1Move;
            player2Coins -= player2Move;
            if(Math.abs(player1Move - player2Move) == 1){
                player2Coins ++;
            } else if(Math.abs(player1Move - player2Move) == 2){
                player1Coins += 2;
            } else if(player1Move == player2Move){
                player2Coins++;
            }
            round++;
        }
        if(player1Coins == player2Coins){
            System.out.println("tie game");
        } else if(player1Coins > player2Coins){
            System.out.println("player 1 wins");
        } else if(player2Coins > player1Coins){
            System.out.println("player 2 wins");
        }
    }
    
    
    }
    