package U5T1_Anatomy_of_a_class;

public class Spinner {
    private int sectionNum;
    private int spinValue;
    private int spinNum;
    private int spinSum;

    public Spinner(int numOfSections){
        sectionNum = numOfSections;
        spinValue = 0;
        spinNum = 0;
        spinSum = 0;
    }

    public int getSpinValue(){
        return spinValue;
    }

    public int getSpinCount(){
        return spinNum;
    }

    public int getSpinSum(){
        return spinSum;
    }

    public double averageSpin(){
        return (double) spinSum / spinNum;
    }

    public void spin(){
        spinValue = (int) (Math.random() * sectionNum) + 1;
        spinNum++;
        spinSum += spinValue;
    }
}
