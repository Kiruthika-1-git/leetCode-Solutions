class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        int[][] arr=new int[intervals.length][2];
        int count=0;
        for(int i=1;i<intervals.length;i++)
        {
            if(end>=intervals[i][0])
            {
                end=Math.max(end,intervals[i][1]);
            }else
            {
                arr[count]=new int[]{start,end};
                count++;
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
            arr[count]=new int[]{start,end};
            count++;
        
        return Arrays.copyOf(arr,count);
        
    }
}