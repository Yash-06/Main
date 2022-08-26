public class dynamicProgramming {

    public int fibonaaci(int n){
        if(n==0 ){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int result = fibonaaci(n-1) + fibonaaci(n-2);
        return result;
    }

    // below solution using dynamic problem
    // Bottom up approach
    public int fib1(int n){
        int[] table = new int[n+1];
        table[0] = 0;
        table[1] = 1;
        for(int i=2;i<=n;i++){
            table[i] = table[i-1] + table[i-2];
        }
        for(int i=0;i<=n;i++){
            System.out.print(table[i] + " ");
        }
        return table[n];
    }

    //Top down approach

    public int fib2(int[] memorize, int n){
        if(memorize[n] == 0){
            if(n<2){
                memorize[n] = n;
            }
            else{
                int left = fib2(memorize, n-1);
                int right = fib2(memorize, n-2);
                memorize[n] = left+right;
            }
        }
        return memorize[n];
    }

    public static void main(String[] args) {
        dynamicProgramming dp = new dynamicProgramming();
        // int p = dp.fibonaaci(10);
        // System.out.println(p);
        // int q = dp.fib1(10);
        // System.out.println(q);
        int r = dp.fib2(new int[10+1], 10);
        System.out.println(r);
        
    }
}
