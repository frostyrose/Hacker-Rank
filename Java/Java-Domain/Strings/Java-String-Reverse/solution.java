import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int len = A.length();
        boolean anagram = true;
        //if(len%2 == 0){
            for(int i = 0; i < len/2; i++){
                anagram = anagram && A.charAt(i) == A.charAt(len-1-i);
            }
        //}
        /* Enter your code here. Print output to STDOUT. */
        if(anagram){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}