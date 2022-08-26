package Problems;

import java.util.Set;

public class removeVowels {

    public static String removeVowelsFromString(String str){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder sb = new StringBuilder();

        char[] charArray = str.toCharArray();
        for(Character ch : charArray){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print(removeVowelsFromString("yash".toLowerCase()));
    }
}
