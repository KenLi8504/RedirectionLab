import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
      Scanner n = new Scanner( System.in );
      while (n.hasNextLine()){
        Scanner CurrentLine = new Scanner(n.nextLine());
        while (CurrentLine.hasNext()){
          String a = CurrentLine.next();
          for (int i = 0; i < a.length(); i++){
            System.out.print("*");
          }
          System.out.print(" ");
        }
      }
      System.out.println('\n');
  }
}

/*
public class MakeStars2{
  public static void main( String[]args ){
      Scanner n = new Scanner( System.in );
      while (n.hasNextLine()){
        String nextLine = n.nextLine();
        System.out.println(nextLine);
      }
  }
}
*/
