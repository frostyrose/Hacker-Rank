import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = 0;
        num = sc.nextInt();
        BigInteger n = new BigInteger("1");
        for(int i = 2; i <= num; i++){
            n = n.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.println(n.toString());
    }
}