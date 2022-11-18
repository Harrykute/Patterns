public class Practice3 {
    
//HOLLOW RECTANGLE pattern

    public static void main(String[] args) {

        int totalrows=4;
        int totalcolum=5;

        for(int i=1;i<=totalrows;i++){

            for(int j=1;j<=totalcolum;j++){

                if(i==1 || j==1 || i==totalrows || j==totalcolum){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }


               



            }
            System.out.println();



        }
        





    }
}
