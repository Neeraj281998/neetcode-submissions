class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> seen=new HashMap<>();

        int[] result=new int[2];

        for(int i=0;i<nums.length;i++){

            int leftAmount=target-nums[i];

            if (seen.containsKey(leftAmount)){

                result[0]=seen.get(leftAmount);
                result[1]=i;
                return result;

            }else{

                seen.put(nums[i],i);

            }




        }

        
            return result;



    }
}
