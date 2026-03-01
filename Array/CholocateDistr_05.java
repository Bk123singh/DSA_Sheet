import java.util.Arrays;

public class CholocateDistr_05{

    public static int CholocateDis(int arra[], int m){
        int n=arra.length;
        Arrays.sort(arra);
        int result=Integer.MAX_VALUE;
        for(int i=0; i < n-m+1;i++){
            int minEle=arra[i];
            int MaxEle=arra[i+m-1];
            result=Math.min(result,(MaxEle-minEle));
        }
        return result;
    }
    public static void main(String[] args) {
        int arra[]={7,3,2,4,9,12,56};
        
        System.out.println("Minimum Differance is: " + CholocateDis(arra, 5));
    }
}