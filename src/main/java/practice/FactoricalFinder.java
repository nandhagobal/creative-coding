package practice;

public class FactoricalFinder {
    public static int factoricalOf(int n){
        int result=1;
        if(n<0) return 0;
        if(n==0) return 1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
}
