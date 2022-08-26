package Problems;

public class reverseString {

    public void reverseStr(String inp){
        //int b=inp.length();
        char [] arr = new char[inp.length()];
        int k=0;
        for(int i=inp.length()-1;i>0;i--){
            if(inp.charAt(i)== ' ' && inp.charAt(i-1)==' '){
                continue;
            }
            arr[k] = inp.charAt(i-1);
            k++;
        }
        
        int l = 0;
        for(char c:arr){
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
                l++;
            }
        }
        System.out.print(l);
    }
    public static void main(String[] args) {
        reverseString rs = new reverseString();
        rs.reverseStr("   yash is crazy        ");
       
    }
}
