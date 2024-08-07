class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int med = 0;
        int[] arr = new int[nums1.length + nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i=nums1.length,j=0;i<nums1.length+nums2.length;i++,j++){
            arr[i]=nums2[j];
        }
        Arrays.sort(arr);
        int n=arr.length;
        int prev = n-1;
        if(n==0)
            return 0;
        if(n%2==0){
            double avg = (arr[n/2]+arr[prev/2])/2.0;
            return avg;
        }
        else 
            return arr[n/2];
    }
}