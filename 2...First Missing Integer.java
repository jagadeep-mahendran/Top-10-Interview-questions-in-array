// time complexiy O(n) and const space complexity 
// change a[i]<=0 --> a[i]=1..
// change a[i]>n  --> a[i]=1..


class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums==null||nums.length==0) return 1;
        int one=0;
        
         // step 1..
            for(int i=0;i<nums.length;i++){
                if(nums[i]==1)
                    one=1;
                  if(nums[i]<=0||nums[i]>nums.length)
                       nums[i]=1;
            }
          if(one == 0) return 1;
        // step 2..
            for(int i=0;i<nums.length;i++)
            {     
                int index=Math.abs(nums[i])-1;
                 if(nums[index]>0)
                     nums[index]=(-1)*nums[index];
            } 
        // step 3
        for(int i=0;i<nums.length;i++)
               if(nums[i]>0)
                    return i+1;
              return nums.length+1;       
    }
}




// time complexity O(n) and space complexity O(n)
public class Solution {
    public int firstMissingPositive(int[] a) {
          int max=Integer.MIN_VALUE;
          HashSet<Integer> hs=new HashSet<>();
          for(int i=0;i<a.length;i++){
            // max=Math.max(max,a[i]);
               hs.add(a[i]);
               
          }
           for(int i=1;i<=a.length+1;i++)
            if(!hs.contains(i))
             return i;
             return 1;
            
    }
}
