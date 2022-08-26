import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MenuCLI {
    public static void doOperator(){
        Scanner scan = new Scanner(System.in) ;
        int i ;
        try{
            i = scan.nextInt() ;
            switch(i){
                case 1:{
                    MenuOperation2.addOwnData() ;
                    break ;
                }
                case 2:{
                    MenuOperation2.findOwnData() ;
                    break ;
                }
                case 3:{
                    MenuOperation2.updateOwnData() ;
                    break ;
                }
                case 4:{
                    MenuOperation2.queryInterest() ;
                    break ;
                }
                case 5:{
                    MenuOperation2.updateDataByID() ;
                    break ;
                }
                case 0:{
                    System.out.println("System Exit Successfully, Thanks for Using...");
                    System.exit(1) ;
                }
                default : {
                    System.out.println("Invaild Selection，Please Entry Again：");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Error Operation！Please Entry Again：");
        }

    }
    public static String show(){
        return "=========Paper System Menu=========== \n"
                +"[1]   Create your Data \n"
                +"[2]   Check your Data \n"
                +"[3]   Update your Data \n"
                +"[4]   Query related paper By category\n"
                +"[5]   Refer paper to others \n"
                +"[6]   Finish your marking"
                +"[0]   Exit \n"
                +"Please enter a number:";
    }

    @Test
    public static void main(String[] args) {
        MenuCLI menuCLI = new MenuCLI() ;
        System.out.println(menuCLI.show()) ;
        while(true){
            menuCLI.doOperator() ;
        }
    }

}