public class Practice7 {
    
// Star DIAMOND pattern
    public static void main(String[] args) {
        

        int n=5;

        for(int i =1;i<=n;i++){
            //Spaces

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            
            System.out.println();
        }
        
        for(int i =n;i>=1;i--){
            //Spaces

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            
            System.out.println();
        }
        
    }
}
