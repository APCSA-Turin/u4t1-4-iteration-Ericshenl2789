public class Main {
    public static void main(String[] args)
    {
        String str = "hoopla";
        String previousLetter = str.substring(0, 1);
        String currentLetter = "";
        int count = 1; 
        int max = count; 
        for(int i = 1; i < str.length(); i++){
          currentLetter = str.substring(i, i + 1);
          System.out.println(currentLetter + ", " + previousLetter);
          if(previousLetter.equals(currentLetter)){
            count++;
            if(count>= max){
              max = count;
            }
          }else
          {
            previousLetter = currentLetter;
            count = 1;
          }
        }
        System.out.println(max);
    }
 }
 