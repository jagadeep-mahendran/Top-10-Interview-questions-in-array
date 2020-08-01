public class Solution {
    
    public int maxSubArray(final List<Integer> a) {
          int max=0,maxfr=Integer.MIN_VALUE;
           int maxval=Integer.MIN_VALUE;
           if(a.size()==1) 
             return a.get(0);
          for(int i=0;i<a.size();i++)
            {    
                maxval=Math.max(maxval,a.get(i));
                max=max+a.get(i);
                if(max<0)
                   max=0;
                   if(maxfr<max)
                      maxfr=max;
                   
            }
             if(maxfr==0)
                {
                    maxfr=maxval;
                }
            return maxfr;
    }
}
