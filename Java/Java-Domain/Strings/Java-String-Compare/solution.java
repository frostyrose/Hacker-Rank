import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String smallest = "";
        String largest = "";
        String base = sc.nextLine();
        int len = base.length();
        int k = sc.nextInt();
        for(int i = 0; i < len-k+1; i++){
            String chunk = base.substring(i,i+k);
            if(chunk.compareTo(largest) > 0){
                largest = chunk;
            }
            if(chunk.compareTo(smallest) < 0 || smallest.equals("")){
                smallest = chunk;
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}