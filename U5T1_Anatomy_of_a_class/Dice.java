package U5T1_Anatomy_of_a_class;

public class Dice {
    private int sides;
    private int rollValue;
    private int numOfRolls;

    public Dice(int sides){
        this.sides = sides;
        rollValue = 0;
        numOfRolls = 0;
    }

    //getters
    public int getSides(){
        return sides;
    }

    public int getRollValue(){
        return rollValue;
    }

    public int getRollCount(){
        return numOfRolls;
    }

    //setters
    public void setSides(int newSide){
        sides = newSide;
    }

    public void roll(){
        rollValue = (int) (Math.random() * sides) + 1;
        numOfRolls++;
    }

}
