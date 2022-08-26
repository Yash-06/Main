package Problems;

import java.util.HashMap;
import java.util.Map;

import javax.management.DynamicMBean;
import javax.xml.stream.events.EndDocument;

public class longestSubString {

    // public static int longestSubStringWithoutRepeating(String str){
    //     int output = 0;
    //     StringBuilder sb = new StringBuilder();   //  "S u s a n t a"
    //     char result[] = {};
    //     int l = 1;
    //     int max = 0;
    //     char[] ch = str.toCharArray();
        
    //     for(char i : ch){
    //         sb.append(i);
    //     } 
    //     for(int i=0;i<ch.length;i++){
    //         System.out.print(ch[i] + " ");
    //     }
    //     result[0] = ch[0];
    //     for(int i=0;i<str.length();i++){    // s u s a n t a
    //             for(int j=0;j<result.length;j++){
    //                 if(ch[i] == result[j]){
    //                     if(result.length>max){
    //                         max = result.length;
    //                         result = new char[str.length()];
    //                         break;
    //                     }
    //                 }
    //             }
    //             result[l] = ch[i];
    //             l++;
    //         }
    //     System.out.print(max);
    //     return max;
    // }

    public static int longestSubStringWithoutRepeating(String str){
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for(int end=0;end<str.length();end++){
            char rightChar = str.charAt(end);
            if(map.containsKey(rightChar)){
                start = Math.max(start, map.get(rightChar) + 1);
            }
            map.put(rightChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        System.out.println(maxLength);
        return maxLength;
    }


    public static void main(String[] args) {
        longestSubString s = new longestSubString();
        s.longestSubStringWithoutRepeating("sanjay".toLowerCase());
    }
}
