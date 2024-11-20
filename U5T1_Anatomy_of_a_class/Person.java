package U5T1_Anatomy_of_a_class;

public class Person {
    private String fName;
    private String lName;
    private int meetNum;

    public Person(String firstN, String lastN){
        fName = firstN;
        lName = lastN;
        meetNum = 0;
    }

    public String getFirstName(){
        return fName;
    }

    public String getLastName(){
        return lName;
    }

    public int getMeetings(){
        return meetNum;
    }

    public void updateMeetings(){
        meetNum++;
    }

    public void meet(Person person2){
        System.out.println("Hello, my name is " + getFirstName());
        System.out.println("Hi, my name is " + person2.getFirstName());
        person2.updateMeetings();
        updateMeetings();
    }
}
