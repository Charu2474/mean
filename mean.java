import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        int n=b.nextInt();
        int x[]=new int[n];
        int i,sum=0;
        Double m;
        for(i=0;i<n;i++)
        {
            x[i]=b.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum+=x[i];
        }
        m=(double)sum/n;
        System.out.println("Quantum Mean Calculation Completed:");
        System.out.printf("The quantum mean of the array is %.2f",m);
        System.out.println("\nCongratulations, Quantum Explorer!");
    }
}
