import java.util.*;
public class MajorityElement {
    

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
            
        }
    
        
        for(Integer key : map.keySet()){
            if(map.get(key)>nums.length/2){
                // System.out.println(key);
                return key;
            }
        }
        return -1;
    }
    
}

