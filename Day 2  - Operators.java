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
        double m = sc.nextDouble();
        int tip= sc.nextInt();
        int tax = sc.nextInt();
        double ftip = (m*tip)/100;
        double ftax = (m*tax)/100;
        int total = (int) Math.round(ftip+ftax+m);
        System.out.println(total);
    }
}
