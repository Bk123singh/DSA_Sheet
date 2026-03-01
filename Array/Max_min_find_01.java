public class Max_min_find_01{

    public static void Max(int arra[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arra.length;i++){
            if(arra[i]>max){
                max=arra[i];   
            }
    }
        System.out.println("Max value is "+max);
        
}

    public static void Min(int arra[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arra.length;i++){
            if(arra[i]<min){
                min=arra[i];   
            }
    }
        System.out.println("Min value is "+min);    
}

    public static void main(String []args){

        int arra[]={10,56,77,3,23,45,67,89,90};
        Max(arra);
        Min(arra);

    }
}