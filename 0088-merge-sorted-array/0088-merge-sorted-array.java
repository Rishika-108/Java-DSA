class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int end1 = m-1, end2=n-1, i = m+n-1;
      while(end2>=0){
         if(end1 >= 0 && nums1[end1] > nums2[end2]){
            nums1[i] = nums1[end1];
            end1--;
            i--;
         } else {
            nums1[i] = nums2[end2];
            i--;
            end2--;
         }
      }
    }
}