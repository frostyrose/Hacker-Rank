import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
       HashMap<Character,Integer> hashA = new HashMap<Character,Integer>();
       HashMap<Character,Integer> hashB = new HashMap<Character,Integer>();
       ArrayList<Character> lol = new ArrayList<Character>();
       if(A.length() != B.length()){
           return false;
       }
       for(int i=0; i<A.length(); i++){
           char charA = A.toLowerCase().charAt(i);
           char charB = B.toLowerCase().charAt(i);
           //System.out.println("Letter A:"+charA);
           //System.out.println("Letter B:"+charB);
           if(hashA.containsKey(charA)){
              // System.out.printf("Letter Exists in HashA Updating Value ->");
               hashA.put(charA, hashA.get(charA) + 1);
              // System.out.printf("Success \n");
           }
           else{
              // System.out.printf("Letter Doesnt Exist in HashA Putting Value ->");
               hashA.put(charA, 1);
              // System.out.printf("Success \n");
           }
           if(hashB.containsKey(charB)){
              // System.out.printf("Letter Exists in HashB Updating Value ->");
               hashB.put(charB, hashB.get(charB) + 1);
              // System.out.printf("Success \n");;
           }
           else{
              // System.out.printf("Letter Doesnt Exist in HashB Putting Value ->");
               hashB.put(charB, 1);
              // System.out.printf("Success \n");
           }
           if(!lol.contains(charA)){
               lol.add(charA);
           }
           if(!lol.contains(charB)){
               lol.add(charB);
           }
           //System.out.println("List of Letters:" + lol);
       }
       boolean equalFreq = true;
       for(char s : lol){
           equalFreq = equalFreq && hashA.get(s) == hashB.get(s);
       }
       return equalFreq;
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}