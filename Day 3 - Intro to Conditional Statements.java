import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>1&&n<=100)
        {
            if(n%2!=0)
            {
                System.out.println("Weird");
            }
            else
            {
                if(n>2&&n<5)
                {
                System.out.println("Not Weird");                
                }
                else if(n>6&&n<=20)
                {
                System.out.println("Weird");
                }
                else if(n>20)
                {
                System.out.println("Not Weird");                
                }
            }
        }
    }
}
