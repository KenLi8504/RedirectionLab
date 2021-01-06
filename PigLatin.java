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
    String FirstTwo = s.substring(0,2);
    for (int i = 0; i < Diagraphs.length; i++){
      if (FirstTwo.equals(Diagraphs[i]) ) {
        return s.substring(2,s.length())+s.substring(0,2)+"ay";
      }
    }
    return (pigLatinSimple(s));
  }

  public static void main (String args []){
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("david"));
    System.out.println(pigLatinSimple("aaron"));
    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("check"));
    System.out.println(pigLatin("skee"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("grade"));
  }
}
