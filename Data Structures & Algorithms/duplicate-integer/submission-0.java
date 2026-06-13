class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> seen=new HashSet<>();

        for(int data:nums){

            if(seen.contains(data)){
                return true;
            }else{
                seen.add(data);
            }

        }

        return false;

    }
}