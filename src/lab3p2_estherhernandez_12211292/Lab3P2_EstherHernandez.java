
package lab3p2_estherhernandez_12211292;

/**

 * @author ELIZABETH HERNANDEZ
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Lab3P2_EstherHernandez {
    static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Procoso> planetas = new ArrayList();
        ArrayList<cohetes> cohetes= new ArrayList();
        boolean flag = true;
        while(flag == true){
        System.out.println("0. Salir");
        System.out.println("1. Crear cohete");
        System.out.println("2. Crear planeta");
        System.out.println("3. Editar cohete");
        System.out.println("5. Listar cohetes");
        System.out.println("6. Listar planetas");
        System.out.println("7. Probar cohete");
        System.out.println("Ingrese la opcion");
        int op = lea.nextInt();
        switch (op){
            case 0:
                flag = false;
                break;
            case 1:
                System.out.println("");
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
               
                break;
            default:
                System.out.println("Opcion no valida");
                break;
                
                
            }
        }
    
    }
}
    
