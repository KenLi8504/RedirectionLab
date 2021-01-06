import java.util.*;
public class PigLatin{

  public static String pigLatinSimple(String s){
    if (
    ( s.charAt(0) == 'a' ) ||
    ( s.charAt(0) == 'e' ) ||
    ( s.charAt(0) == 'i' ) ||
    ( s.charAt(0) == 'o' ) ||
    ( s.charAt(0) == 'u' ) ){
      return s + "hay";
    }
    else{
      return s.substring(1,s.length())+s.substring(0,1)+"ay";
    }
  }

  public static String pigLatin(String s){
    String Diagraphs [] = new String [] {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if (s.length() < 2){
      return (pigLatinSimple(s));
    }
    String FirstTwo = (s.substring(0,2)).toLowerCase();
    for (int i = 0; i < Diagraphs.length; i++){
      if (FirstTwo.equals(Diagraphs[i]) ) {
        return s.substring(2,s.length())+s.substring(0,2)+"ay";
      }
    }
    return (pigLatinSimple(s));
  }

  public static String pigLatinBest(String s){
    if (
    (s.charAt(0) < 65) ||
    (s.charAt(0) > 122) ||
    (s.charAt(0) > 90 && s.charAt(0) < 97) ){
      return s;
    }
    else if (
    (s.charAt(s.length()-1) < 48) ||
    (s.charAt(s.length()-1) > 122) ||
    (s.charAt(s.length()-1) > 90 && s.charAt(s.length()-1) < 97) ||
    (s.charAt(s.length()-1) > 57 && s.charAt(s.length()-1) < 65)) {
    return (pigLatin(s.substring(0,s.length()-1)) +s.charAt(s.length()-1)).toLowerCase();
    }
    return pigLatin(s).toLowerCase();
  }


  public static void main (String args []){

    Scanner n = new Scanner( System.in );
    while (n.hasNextLine()){
      Scanner CurrentLine = new Scanner(n.nextLine());
      while (CurrentLine.hasNext()){
        String a = CurrentLine.next();
        System.out.print(pigLatinBest(a));
        System.out.print(" ");
      }
      if (n.hasNextLine() ){
        System.out.print("\r\n");
      }
    }
    /*
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("david"));
    System.out.println(pigLatinSimple("aaron"));
    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("check"));
    System.out.println(pigLatin("skee"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("grade"));
    System.out.println(pigLatinBest("4chan"));
    System.out.println(pigLatinBest("5head"));
    System.out.println(pigLatinBest("3.5head"));
    System.out.println(pigLatinBest("*howdy"));
    System.out.println(pigLatinBest("fish!"));
    System.out.println(pigLatinBest("fish"));
    System.out.println(pigLatinBest("the."));
    System.out.println(pigLatinBest("cat!"));
    System.out.println(pigLatinBest("amazing?"));
    System.out.println(pigLatinBest("apple%"));
    */
  }
}
