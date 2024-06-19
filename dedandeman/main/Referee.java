package dedandeman.main;

public class Referee {
    Player playerOne;
    Player playerTwo;
    int pOnePoints = 0;
    int pTwoPoints = 0;
    
    public Referee(Player one, Player two){
        this.playerOne = one;
        this.playerTwo = two;
    }

    public void ref(){
        pOnePoints = pTwoPoints = 0;
        
        while(RPS.gameOn){
            refRound(playerOne.getWeapon(), playerTwo.getWeapon());
            
        }

        
    }

    public void refRound(Weapon player1, Weapon player2){
        int score = player1.compare(player2);
        playerOne.giveScore(score);
        playerTwo.giveScore(0 - score);
    }
}