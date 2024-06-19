package dedandeman.main;

import java.util.Scanner;

public class Player {
    private Scanner scnr = new Scanner(System.in);
    protected String playerName;
    private Weapon w;
    private int[] scores = new int[3];

    public Player(){
        this("Unknown");
    }

    public Player (String s){
        this.playerName = s;
    }
    
    public Weapon getWeapon(){
        int num = -1;
        while(num < 1 || num > 3){
            System.out.println(playerName + ": Choose your weapon:\n1: Rock\n2: Paper\n3: Scizzors");
            num = scnr.nextInt();
            
        }
        
        return new Weapon(num);
    }

    public void giveScore(int i){
        try{
            scores[i + 1]++;
        } catch(Exception e){
            System.out.println(playerName + " did not understand the score they received");
        }
    }

    public String printScores(){
        return "" + playerName + ":: Losses: " + scores[0] + ", Ties: " + scores[1] + ", Wins: " + scores[2];
    }
}
