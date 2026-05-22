import java.util.Arrays;
import java.util.HashMap;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        int s = numPars(nums);
        System.out.println(s);
    }
    public static int numPars(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int saida = 0;
        for(int num:nums){
            int freq = map.getOrDefault(num,0); //Procuro o valor cujo a chave do mapa é 1, caso não tenha é 0
            saida += freq; //Saida aumenta caso ache
            map.put(num,freq + 1);
        }
        return saida;
    }
}
