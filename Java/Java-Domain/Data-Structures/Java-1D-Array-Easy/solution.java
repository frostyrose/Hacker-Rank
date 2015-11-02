import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int myList[] = new int[n];
        for(int i = 0; i < n; i++){
            myList[i] = sc.nextInt();
        }
        int countNegative = 0;
        for(int j = 0; j < n; j++){
            int value = 0;
            for(int k = j; k < n; k++){
                value += myList[k];
                if(value < 0){
                    countNegative++;
                }
            }
        }
        System.out.println(countNegative);
    }
}