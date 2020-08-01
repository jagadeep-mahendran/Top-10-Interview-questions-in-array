/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
     static int binarySearch(int a[],int l,int r,int k)
      {
          if(r>=l)
           {
               int mid=l+(r-l)/2;
               if(a[mid]==k)
                 return mid;
                 if(a[mid]>k)
                     return binarySearch(a,l,mid-1,k);
                     return binarySearch(a,mid+1,r,k);
           }
           return -1;
      }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//test cases
		 while(t-->0)
		  {
		      int n=sc.nextInt();//array size
		       int a[]=new int[n];
		      
		       for(int i=0;i<n;i++)   
		        a[i]=sc.nextInt();   //array elements
		         Arrays.sort(a);
		        int key=sc.nextInt(); // key to find
		        System.out.println(binarySearch(a,0,n-1,key));
		  }
	}
}
