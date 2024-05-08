
package daftarundi;
import java.util.Scanner;
public class Daftarundi {

 
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        int umur;
        
        
        
        System.out.println("Sila masukkan umur anda");
        umur = input.nextInt();
        
        boolean status;

        
        System.out.println("anda sudah mendaftar? (true/false):");
        status = input.nextBoolean();
        
        
     
       if( umur <=18 ){
          System.out.println("Anda terlalu muda dan tidak layak mengundi");
       }
       
       else if( umur >=18 && status ==false){
           System.out.println("Anda perlu mendaftar sebelum mengundi");
       }
       else if (umur >=18 && status == true){
           System.out.println("Anda layak mengundi");
       }
       
    }
    
}
