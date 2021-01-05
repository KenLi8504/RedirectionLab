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

  public static void main (String args []){
    System.out.println(pigLatinSimple("mock"));
    System.out.println(pigLatinSimple("pie"));
    System.out.println(pigLatinSimple("david"));
    System.out.println(pigLatinSimple("aaron"));
  }

}
