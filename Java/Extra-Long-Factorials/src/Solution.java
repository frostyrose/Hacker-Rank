import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        InputStreamReader cin = new InputStreamReader(System.in);
        int num = 0; //
        try{
            num = cin.read();//Only Gives First ByteValue
            System.out.println(Integer.toString(num));
        }catch (IOException ex) {
            throw ex;
        }
        BigInteger n = new BigInteger("1");
        for(int i = 2; i <= num; i++){
            n = n.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.println(Integer.toString(num));
        System.out.println(n.toString());
    }
}