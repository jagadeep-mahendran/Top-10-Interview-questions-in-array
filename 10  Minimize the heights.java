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
		     int max=Integer.MIN_VALUE;
		     int k=sc.nextInt();
		     int n=sc.nextInt();
		     int a[]=new int[n];
		     for(int i=0;i<n;i++)
		        {
		        a[i]=sc.nextInt();
		        max=Math.max(max,a[i]);
		        }
		        int x=max-(k);
		        int minh=Integer.MAX_VALUE;
		        int maxh=Integer.MIN_VALUE;
		        for(int i=0;i<n;i++)
		         {
		             if(a[i]+k>x)
		              {  
		                  if(a[i]-k<0)
		                   a[i]=a[i]+k;
		                   else
		                   a[i]=a[i]-k;
		              }
		                else 
		                a[i]=a[i]+k;
		             maxh=Math.max(maxh,a[i]);
		             minh=Math.min(minh,a[i]);
		         }
		         System.out.println(maxh-minh);
		 }
		 
	}
}
