/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		 {
		     int n=sc.nextInt();
		     int m=sc.nextInt();
		     int a[][]=new int[n][m];
		     for(int i=0;i<n;i++)
		      for(int j=0;j<m;j++)
		         a[i][j]=sc.nextInt();
		      int l=0,k=0;
		     // int n=n1,m1=m;
		      while(k<n&&l<m) 
		        {
		            for(int i=l;i<m;i++)
		              System.out.print(a[k][i]+" ");
		              
		            k++;
		            for(int i=k;i<n;i++)
		             System.out.print(a[i][m-1]+" ");
		             m--;
		             if(k<n)
		              {
		                  for(int i=m-1;i>=l;i--)
		                   System.out.print(a[n-1][i]+" ");
		                   n--;
		                   
		              }
		              if(l<m)
		               {
		                   for(int i=n-1;i>=k;i--)
		                    System.out.print(a[i][l]+" ");
		                    l++;
		               }
		              
		        }
		        System.out.println();
		 }
	}
}
