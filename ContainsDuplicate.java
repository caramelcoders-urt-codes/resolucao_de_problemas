import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int []nums = {1,4,3,2,1};

        boolean duplicata = duplicadou(nums);
        String saida = (duplicata) ? "TRUE" : "FALSE";
        System.out.println(saida);
    }
    public static boolean duplicadou (int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
                set.add(nums[i]);
        }
        return false;
    }
}
