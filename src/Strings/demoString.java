package Strings;

public class demoString {
    public static void main(String[] args) {
        char arr[]={'A','B','C','D','f'};
        String str1="Coding";
        String str2=" is Fun";
//        System.out.println(str.charAt(1));
//        System.out.println(str1+str2);
        str1=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str1.equals(str2));
    }
}
