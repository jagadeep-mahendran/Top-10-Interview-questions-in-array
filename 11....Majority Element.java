/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
      static int findMajority(int[] arr)  
    { 
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>(); 
  
        for(int i = 0; i < arr.length; i++) { 
            if (map.containsKey(arr[i])) { 
                    int count = map.get(arr[i]) +1; 
                    if (count > arr.length /2) { 
                         return arr[i]; 
                        
                    } else
                        map.put(arr[i], count); 
  
            } 
            else
                map.put(arr[i],1); 
            } 
            return -1; 
    } 
	public static void main (String[] args) {
		//code
		 Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t-->0)
		  {
		      int n=sc.nextInt();
		      int a[]=new int[n];
		      for(int i=0;i<n;i++) a[i]=sc.nextInt();
		      System.out.println(findMajority(a));
		  }
	}
}
