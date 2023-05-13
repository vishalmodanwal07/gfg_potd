https://practice.geeksforgeeks.org/problems/ed0422e992899f3f46340ce97b0090683ceebd67/1  
class Solution {
    public static int bitMagic(int n, int[] arr) {
      int ans=0,i=0,j=n-1;
        while(i<j){
            if(arr[i]!=arr[j])ans++;
            i++;
            j-- ;
        }
        return ans/2 + ans%2;
}
}       