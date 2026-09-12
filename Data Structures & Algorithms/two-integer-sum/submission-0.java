class Solution {
    public int[] twoSum(int[] nums, int target) {

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int com = target - nums[i];

            if (al.contains(com)) {
                int j = al.indexOf(com);
                return new int[] { j, i };
            }

            al.add(nums[i]);
        }

        return new int[] {};
    }
}