import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for(int i = 0; i<tests; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int value = a;
            for(int j = 0; j < n; j++){
                value += Math.pow(2,j) * b;
                System.out.printf("%d ", value);
            }
            System.out.println();
        }
    }
}