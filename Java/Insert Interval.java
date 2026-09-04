class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int []> arr1=new ArrayList<>();
        int start=newInterval[0];
        int end=newInterval[1];
        for(int i=0;i<intervals.length;i++)
        {
            if(intervals[i][1]<start)
            {
                arr1.add(intervals[i]);
            }
            else if(intervals[i][0]<=end)
            {
                start=Math.min(start,intervals[i][0]);
                end=Math.max(end,intervals[i][1]);
            }
            else
            {
                arr1.add(new int[]{start,end});
                arr1.add(intervals[i]);
                for(int j=i+1;j<intervals.length;j++)
                {
                    arr1.add(intervals[j]);
                }
             return arr1.toArray(new int[arr1.size()][]);

            }
        }
        
          arr1.add(new int[]{start, end});

        return arr1.toArray(new int[arr1.size()][]);
    }
}