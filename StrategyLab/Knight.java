package StrategyLab;

public class Knight implements Type {

    private DefendStrategy defendStrategy;

    public Knight(DefendStrategy defendStrategy) {
        this.defendStrategy = defendStrategy;
    }

    public String defend(){
        String output  = new String();

        output += "Knight" + defendStrategy.shield();

        return output;
       
    }
}
