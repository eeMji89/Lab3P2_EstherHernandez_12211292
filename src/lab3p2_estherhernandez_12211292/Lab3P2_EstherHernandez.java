
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
    static ArrayList <Procoso> planetas = new ArrayList();
    static ArrayList<cohetes> cohetes= new ArrayList();
    public static void main(String[] args) {
        
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
                crearcohete();
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
    public static void crearcohete(){
        System.out.println("Ingrese el peso soportable:");
        double p = lea.nextInt();
        System.out.println("Nombre:");
        String nombrec= lea.nextLine(); nombrec = lea.next();
        int op2=0;
        while(op2<4){
        System.out.println("Serie:");
         String serie= lea.nextLine(); serie = lea.next();
        System.out.println("Potencia:");
        int pot = lea.nextInt();
            if ((pot>0)&&( pot <10) ) {

            }
            else{

        }
        System.out.println("1. Liquido");
        System.out.println("2. De Fases");
        System.out.println("3. Solido");
        op2 = lea.nextInt();
            if (op2 ==1) {
                System.out.println("Litros de gasolina:");
                double lit = lea.nextDouble();
               cohetes.add(new Cliquido(lit,p,nombrec,serie,pot,0));
            }
            if (op2 == 2) {
                System.out.println("Cantidad de fases:");
                int cf= lea.nextInt();
                System.out.println("Cantidad de motores: ");
                int cm = lea.nextInt();
                System.out.println("Altura");
                double alt = lea.nextDouble();
                cohetes.add(new Fases(cf,cm,alt,p,nombrec,serie,pot,0));
            }
            if (op2 == 3) {
                System.out.println("Kilos de combustible:");
                double kiloc= lea.nextInt();
                System.out.println("Material");
                 String mat= lea.nextLine(); mat = lea.next();
                 cohetes.add(new CSolido(kiloc,mat,p,nombrec,serie,pot,0));
            }

        }
    } 
    
    public static void crearplaneta(){
        System.out.println("Nombre");
        String nombrp = lea.nextLine();nombrp = lea.next();
        System.out.println("Masa:");
        double masa = lea.nextDouble();
        System.out.println("Radio:");
        double rad = lea.nextDouble();
        System.out.println("Teperatura:");
        int temp = lea.nextInt();
        
        
    }
}
    
