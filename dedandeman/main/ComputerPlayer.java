package dedandeman.main;

public class ComputerPlayer extends Player {
    
    public ComputerPlayer(){
        this("Computer1");
    }

    public ComputerPlayer(String s){
        super.playerName = s;
    }

    @Override
    public Weapon getWeapon(){
        int num = (int)Math.round(Math.random() * 3);

        return new Weapon(num);
    }
}
