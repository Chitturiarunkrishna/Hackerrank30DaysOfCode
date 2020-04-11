import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[6][6];
        int i,j,sum;
        int maxSum = Integer.MIN_VALUE;
        for (i = 0; i < 6; i++) 
        {
            for (j = 0; j < 6; j++) 
            {
                a[i][j] = in.nextInt();
            }
        }
        for(i = 0; i < 4; i++)
        {
            for (j = 0; j < 4; j++) 
            {
                sum = a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                 if (maxSum < sum)
                 {
                     maxSum = sum;
                 }
            }
        }

        System.out.println(maxSum);
    }
}