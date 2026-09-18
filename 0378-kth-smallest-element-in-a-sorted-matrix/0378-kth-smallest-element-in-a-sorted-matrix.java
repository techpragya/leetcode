class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int col=matrix[0].length;
        int[] ans=new int[col*col];
        int index=0;
        for(int i=0;i<col;i++){
            for(int j=0;j<col;j++){
                ans[index]=matrix[i][j];
                index++;
            }
        }
        Arrays.sort(ans);
        int lo=0,hi=ans.length;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(ans[mid]==ans[k-1]){
                return ans[k-1];
            }
            else if(ans[mid]<ans[k-1]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return lo;
    }
}