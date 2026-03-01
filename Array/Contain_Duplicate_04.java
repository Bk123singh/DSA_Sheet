public class Contain_Duplicate_04 {
    public static boolean ContainDuplicate(int arra[]){
        int lp=0;
        int rp=arra.length-1;
        while(lp<rp){
            if(arra[lp]==arra[rp]){
                return true; 
            }
            else if(arra[lp]<arra[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

        

    public static void main(String[] args) {
        int arra[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1 };
    
        System.out.println("Contain duplicate is " + ContainDuplicate(arra));
       
    }
}
