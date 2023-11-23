


public class q_4sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    //    for first element

    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for(int i =0;i<=nums.length-4;i++){

        for(int j = i+1;j<=nums.length-3;j++){
            int l= j+1;
            int r =nums.length-1;
            List<Integer> re = new ArrayList<>();
            while(l<r){
                if((nums[l]+nums[r])<(target-nums[i]-nums[j])){
                    l++;
                }
                else if((nums[l]+nums[r])>(target-nums[i]-nums[j])){
                    r--;
                }
                else{
                    re.add(nums[i]);
                    re.add(nums[j]);
                    re.add(nums[l]);
                    re.add(nums[r]);
                    result.add(re);
                    while(l<r && nums[l]==nums[l+1])l++;
                    while(l<r && nums[r]== nums[r-1])r--;
                }
            }
            while(j+1<nums.length && nums[j]==nums[j+1])j++;


        }
         while(i+1<nums.length && nums[i]==nums[i+1])i++;
         }
    return result;
    }

}
