public class ReverseArra_02 {

    public static void  ReverseArra(int arra[]){
        int si=0;
        int ei=arra.length-1;
        while(si<ei){
            int temp=arra[si];
            arra[si]=arra[ei];
            arra[ei]=temp;
            si++;
            ei--;
        }
    }
    public static void PrintArra(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.print(arra[i]+" ");
        }
    }
    
    
    public static void main(String[] args){
        int arra[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Before reverse");
        PrintArra(arra);
        System.out.println("\nAfter reverse");
        ReverseArra(arra);
        PrintArra(arra);
    }
}
