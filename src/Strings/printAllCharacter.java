package Strings;
import java.util.Scanner;
public class printAllCharacter {
    public static void printCharacter(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str=s.nextLine();
        printCharacter(str);

    }
}
