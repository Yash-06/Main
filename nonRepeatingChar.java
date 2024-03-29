package Problems;

import java.util.HashMap;
import java.util.Map;

public class nonRepeatingChar {

    public static int firstNonRepeatingChar(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char ch : chars){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0;i<chars.length;i++){
            char ch = chars[i];
            if(map.get(ch) == 1){
                System.out.println(ch);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        nonRepeatingChar n = new nonRepeatingChar();
        System.out.println(n.firstNonRepeatingChar("yashya"));
    }
}
