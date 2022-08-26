package Problems;

public class isSubsequence {

    boolean isSubseq(String str, String seq){
        int i=0;
        int j=0;
        while(i < str.length() && j < seq.length()){
            if(str.charAt(i) == seq.charAt(j)){
                j++;
            }
            i++;
        }
        return j == seq.length();    /* ***ThisConditionIsImportant*** As it confirms that the 
                                            subseq is complete And present. */
} 

    public static void main(String[] args) {
        isSubsequence i = new isSubsequence();
        System.out.println(i.isSubseq("yASh".toLowerCase(), "ysa".toLowerCase()));
        
    }
}
