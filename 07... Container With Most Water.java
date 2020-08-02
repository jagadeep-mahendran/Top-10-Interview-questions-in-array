// time complexity O(n)
 class Solution {
    public int maxArea(int[] h) {
           int max=Integer.MIN_VALUE;
        int i=0;
        int j=h.length-1;
        int min=0;
        while(i<j)
        {
            min=Math.min(h[i],h[j]);
            max=Math.max(max,min*(j-i));
            if(h[i]<h[j])
                 i++;
            else
                j--;
        }
        return max;
    }
}

// Brute force aproach time complexity O(n^2)
class Solution {
    public int maxArea(int[] h) {
           int max=Integer.MIN_VALUE;
            int n=h.length;
           for(int i=0;i<n;i++)
           {
               for(int j=i+1;j<n;j++)
               {
                   int x=Math.min(h[i],h[j]);
                     max=Math.max(max,(j-i)*x);
               }
           }
        return max;
    }
}
