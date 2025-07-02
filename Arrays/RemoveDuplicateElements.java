class RemoveDuplicateElements {
    public int removeDuplicates(int[] nums) {
         int n=nums.length;
         if(n==0)return 0;
        int j = 0; // j is the index of the last unique element
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1; 
    }
}
