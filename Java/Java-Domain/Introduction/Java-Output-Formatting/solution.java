import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s",s1);
                int size = new Integer(x).toString().length();
                for(int j = size; j < 3; j++){
                    System.out.printf("0");
                }
                System.out.println(x);
            }
            System.out.println("================================");

    }
}