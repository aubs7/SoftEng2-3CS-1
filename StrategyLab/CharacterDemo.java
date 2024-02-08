package StrategyLab;

public class CharacterDemo {
    public static void main(String[] args) {
        Character knight = new Character(new Knight(shield()));

        System.out.println(knight.defend());

    }
    
}
