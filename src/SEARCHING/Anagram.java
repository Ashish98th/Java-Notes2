package SEARCHING;
import java.util.Arrays;
class Anagram{
    public static void main(String []args){
        String str1="Listen";
        String str2="Sile     t";

        System.out.println(isAnagarm(str1,str2));

    }
    public static boolean isAnagarm(String str1,String str2){
        String str3=str1.replaceAll("\\s","");
        String str4=str2.replaceAll("\\s","");

        if(str3.length()!=str4.length()){
            return false;
        }else{
            char c1[]=str3.toLowerCase().toCharArray();
            char c2[]=str4.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);
        }
    }
}