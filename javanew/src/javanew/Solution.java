package javanew;
import java.io.*; 
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       //System.out.println("enter the String");
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverse="";
        int l=A.length();
        
        for(int i=l-1  ;i>=0;i--){
            reverse=reverse+A.charAt(i);
        }
        if(reverse.equals(A)){
            System.out.println("Yes");
        
        }
        else{
            System.out.println("No");
        }
    }
}

