class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      double [] x= new double[nums1.length+nums2.length];
      int i=0;
      for(int num:nums1){
         x[i]=num;
         i++;
      }
      for(int mun:nums2){
        x[i]=mun;
        i++;
      }
      i--;
      Arrays.sort(x);
      if(i%2==0){
         return x[i/2];
      }
      else{
        return (x[i/2]+x[(i/2)+1])/2.0;
      }
    }
}