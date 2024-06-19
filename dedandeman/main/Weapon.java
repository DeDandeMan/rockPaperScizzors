package dedandeman.main;

public class Weapon {
    private int val;

    public Weapon(String s){
        this.val = setVal(s.toLowerCase());
    }

    public Weapon(int i){
        this.val = i;
    }

    public int compare(Weapon w){
        if(w.getVal() == this.val){
            return 0;
        } else if(w.getVal() == this.val + 1){
            return -1;
        } else {
            return 1;
        }
    }

    public String getName(){
        switch(this.val){
            case 1:
                return "rock";
            case 2:
                return "paper";
            case 3:
                return "scizzors";
            default:
                return "error: illegal Weapon";
        }
    }

    public int getVal(){
        return this.val;
    }

    private boolean isValid(String s){
        s = s.toLowerCase();
        if(s.equals("rock")||s.equals("paper")||s.equals("scizzors")){
            return true;
        } else {
            return false;
        }
    }

    private int setVal(String s){
        if(s.equals("rock")){
            return 1;
        } else if(s.equals("paper")){
            return 2;
        } else if(s.equals("scizzors")){
            return 3;
        } else {
            return -1;
        }
    }
}
