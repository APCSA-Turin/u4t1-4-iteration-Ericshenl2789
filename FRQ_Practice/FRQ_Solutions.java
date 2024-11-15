public class FRQ_Solutions {

    public FRQ_Solutions(){}
    
    public void printNums(int value, int numRounds) {
        //your code here
        int number = 10;
        for(int i = 1; i <= numRounds; i++){
            while(number != value){
                number = (int) (Math. random() * 10);
                System.out.print(number);
            }
        number = 10;
        System.out.println();
        }
    }  

    public String longestStreak(String str) {
        //your code here
        int max = 1;
        int streak = 1;
        String prevLetter = str.substring(0, 1);
        String currentLet = "";
        String maxLetter = prevLetter;
        for (int i = 1; i < str.length(); i++){
            currentLet = str.substring(i, i + 1);
            if(currentLet.equals(prevLetter)){
                streak++;
            } else {
                streak = 1;
            }
            if(streak > max){
                maxLetter = currentLet;
                 max = streak;
             }
            prevLetter = currentLet;
        }
        return maxLetter + " " + max;
    }
    
    
    
}
