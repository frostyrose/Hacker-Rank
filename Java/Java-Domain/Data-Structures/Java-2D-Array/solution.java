import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int myArray[][] = new int[6][6];
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i<6; i++){
            for(int j = 0; j<6 ; j++){
                myArray[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4 ; j++){
                int sum = myArray[i][j] + myArray[i][j+1] + myArray[i][j+2] + myArray[i+1][j+1] + myArray[i+2][j] + myArray[i+2][j+1] + myArray[i+2][j+2];
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
