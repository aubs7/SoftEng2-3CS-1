package StrategyLab;

public class Character {
    private Type type;

    public Character(Type type) {
        this.type = type;
    }

    public String defend(){
        return type.defend();
    }

}
