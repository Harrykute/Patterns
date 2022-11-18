public class Practice6 {

//HOLLOW RHOMBUS pattern
    public static void main(String[] args) {
        

        
        int rows=5;
        int colm;

        for(int i=1;i<=rows;i++){
            //spaces

            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //rombus

            for(int j=1;j<=rows;j++){

                if(i==1|| i==rows || j==1 || j==rows){
                    System.out.print("*");

                }
               else {
                System.out.print(" ");
               }



            }
            System.out.println("");
        }
    }
    
}
