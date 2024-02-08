package StrategyLab;

public class DefendStrategy{
    private String shield = " uses a shield to defend!";

    public DefendStrategy defendStrategy(String shield){
        this.shield = shield;
        return this;
    }

    public String shield(){
        return " uses a shield to defend!";
    }
    public String dodge(){
        return " dodges to avoid attack!";
    }
    public String createMagic(){
        return " creates a magic barrier for defense!";
    }
}
