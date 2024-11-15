package U4T2_ForLoops;

public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }
  
    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive! 
       
       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
  
        DO THIS WITH A FOR LOOP
      */  
    public int countCharacters(String character, String searchString) {
        character = character.toLowerCase();
        searchString = searchString.toLowerCase();
        int count = 0;
        for(int i = 0; i < searchString.length(); i ++){
            if(searchString.substring(i, i + 1).equals(character)){
                count++;
            }
        }
        return count;
      /* to be implemented */
    }
    
    /* Returns the original string reversed 
     
     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */  
    public String reverseString(String origString) {
      /* to be implemented */
        String result = "";
        for(int i = origString.length(); i > 0; i --){
            result += origString.substring(i - 1, i);
        }
        return result;
    }

    public String removeA(String str){
      String result = str;
      int idx;
      while (result.indexOf("a") != -1){
        idx = result.indexOf("a");
        result = result.substring(0, idx) + result.substring(idx + 1);
        
      }
      return result;
    }

    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
      String result = origStr;
      for(int i = 0; i < result.length(); i++){
        if(origStr.substring(i, i+1).equals(searchChar)){
          result = result.substring(0, i) + replaceChar + result.substring(i+1);
        }
      }
      return result;
    }

    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
      String result = origStr;
      int i = 0;
      while(i < origStr.length()){
        if(origStr.substring(i, i+1).equals(searchChar)){
          result = result.substring(0, i) + replaceChar + result.substring(i+1);
        }
        i++;
      }
      return result;
    }

    public int countString(String searchStr, String origString){
      int len = searchStr.length();
      int count = 0;
      for(int i = 0; i < origString.length() - len + 1; i++){
        if(origString.substring(i, i + len ).equals(searchStr)){
          count++;
        }
      }
      return count;
    }
    
    public String removeString(String searchString, String origString) {
      String result = origString; 
      while (result.indexOf(searchString) != -1){
        result = result.substring(0, result.indexOf(searchString)) + result.substring(result.indexOf(searchString) + searchString.length());
      }
      return result;
     }
     
    public void commaSeparated(int fromNum, int toNum) {
      int num = fromNum;
      while(num != toNum){
        System.out.print(num + ", ");
        if(toNum > fromNum){
          num++;
        }
        else {
          num--;
        }
      }
      System.out.println(num);
    }
    public boolean isPalindrome(String myString) {
      String str = removeString(" ", myString);
      String inverse = removeString(" ", reverseString(myString));
      if(str.equals(inverse)){
        return true;
      }
      return false;
    }
  
    public void multiPrint(String toPrint, int num) {
      int count = 1;
      String result = "[";
      if(num <= 0){
        System.out.println("[]");
      }
      else {
        while (count < num + 1){
          count++;
          result += toPrint;
          if(count < num + 1){
            result += " ";
          }
        }
        System.out.println(result + "]");
      }
    }
  
  }
  
