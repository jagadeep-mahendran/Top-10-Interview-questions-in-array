class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
           //   List<List<Integer>> lil=new ArrayList<>();
           HashSet<List<Integer>> hs=new HashSet<>();
        Arrays.sort(nums);
         int srt=0,end=0;
        for(int i=0;i<nums.length-2;i++)
        {
            srt=i+1;
            end=nums.length-1;
            while(srt<end)
            {
                int sum=nums[srt]+nums[end];
                if(nums[i]+sum==0)
                {
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[srt]);
                    tmp.add(nums[end]);
                    if(!hs.contains(tmp))
                         hs.add(tmp);
                srt++;
                end--;
                }
                else if(sum+nums[i]<0)
                     srt++;
                else
                     end--;

            }
            
        }
        List<List<Integer>> list = new ArrayList<>(hs);
        return list; 
    }  
}
