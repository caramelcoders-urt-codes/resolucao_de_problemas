import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[]nums = {2,7,11,15};
        int target = 9;
    }
    public static int[] somaDupla (int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int numAtual = nums[i];
            int complemento = target - numAtual;
            if(map.containsKey(complemento)){
                return new int[]{map.get(complemento),i};
            } else
                map.put(numAtual,i);
        }
        return new int[]{0,0};
    }
}
