package Strings;
import java.util.Scanner;
public class checkPelindrome {

public static Boolean checkPelindrome(String input){
    int i=0;
  int j=input.length()-1;
  while(i<j){
      if(input.charAt(i)!=input.charAt(j)){
          return false;
      }
      else{
          i++;
          j--;
      }
  }
  return true;
}
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str=s.nextLine();
        Boolean isTrue=checkPelindrome(str);
        System.out.println(isTrue);
    }
}
