import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  private ArrayList<String> words;
  public RandomStringChooser(String[] wordArray){
    words = new ArrayList<String>();
    for (String s: words){
      words.add(s);
    }
  }
  public String getNext(){
    if (words.size() ==0){
      return "NONE";
    }
    int i =(int)(Math.random()*words.size());
    return words.remove(i);
  }
}
