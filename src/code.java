
import java.util.*;
import java.lang.*;
import java.io.*;


class Code
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        int n=sc.nextInt();
        int X[]=new int[n];
        int Y[]=new int[n];
        int Z[]=new int[n];
        int m=sc.nextInt();
        int c=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            X[i]=sc.nextInt();
            Y[i]=sc.nextInt();
            Z[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(Y[j] > m*X[j]+c)
            {
                a=a+Z[j];
            }
            else
                b=b+Z[j];
        }
        if(a>b)
        {System.out.println(a);}
        else
            System.out.println(b);

    }

}
