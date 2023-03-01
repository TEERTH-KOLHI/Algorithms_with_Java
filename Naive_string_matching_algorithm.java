import java.util.*;
public class Naive_string_matching_algorithm{
    public static void main(String...args){
        String pattern = "AABAACAADAABAAABAA";
        String txt = "AABA";
        search(pattern, txt);
    }
    private static void search(String pattern, String txt){
        int len1 = pattern.length();
        int len2 = txt.length();
        int i = 0, j = len2 - 1;
        for(i = 0, j = len2 - 1; j < len1;){
            if(txt.equals(pattern.substring(i, j + 1))){
                System.out.println("Pattern found at " + i);
            }
            i++;
            j++;
        }
    }
}
