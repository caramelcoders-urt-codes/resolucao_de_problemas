import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("amor", "roma"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            Character charS = s.charAt(i);
            hashMap.put(charS, hashMap.getOrDefault(charS,0) + 1);

            Character charT = t.charAt(i);
            hashMap.put(charT, hashMap.getOrDefault(charT,0) - 1);
        }
        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()){
            if(entry.getValue() != 0)
                return false;
        }
        return true;
    }
}
