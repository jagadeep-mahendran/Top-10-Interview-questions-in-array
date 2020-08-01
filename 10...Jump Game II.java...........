class Solution {
    public int jump(int[] a) {
        if(a.length==1)
             return 0;
    
        int ladder=a[0];
    
        int steps=ladder;
        int ct=1;
        for(int i=1;i<a.length;i++)
        {
             if(i==a.length-1)
                  return ct;
             if(i+a[i]>ladder)
                  ladder=i+a[i];
            steps--;
             if(steps==0)
             {    ct++;
                steps=ladder-i;
             }
        }
        return ct;
    }
}
