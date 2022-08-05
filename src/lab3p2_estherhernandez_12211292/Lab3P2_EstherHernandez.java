
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
    static ArrayList <Planetas> planetas = new ArrayList();
    static ArrayList<cohetes> cohetes= new ArrayList();
    public static void main(String[] args) {
        
        boolean flag = true;
        while(flag == true){
        System.out.println("0. Salir");
        System.out.println("1. Crear cohete");
        System.out.println("2. Crear planeta");
        System.out.println("3. Editar cohete");
        System.out.println("4. Editar planeta");
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
                crearplaneta();
                break;
            case 3:
                System.out.println("1.Regresar");
                System.out.println("2.Agregar personas");
                System.out.println("3.Eliminar personas");
                
                int op5= lea.nextInt();
                break;
            case 4:
                System.out.println("1.Regresar");
                System.out.println("2.Agregar Lunas");
                System.out.println("3.Elimianr lunas");
                int op6 = lea.nextInt();
                break;
                
            case 5:
                System.out.println("COHETES");
                String lcohete="";
                for (Object object : cohetes) {
                    if (object instanceof cohetes) {
                        lcohete+= cohetes.indexOf(object)+"- "+object+"\n";
                    }
                    System.out.println(lcohete);
                    
                }
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
        System.out.println("Serie:");
         String serie= lea.nextLine(); serie = lea.next();
        System.out.println("Potencia:");
        int pot = lea.nextInt();
            while ((pot<1)||( pot >9) ) {
                 System.out.println("La potencia solo puede estar entre 1 y 9, ingrese de nuevo");
                 pot = lea.nextInt();
            }
        
        System.out.println("1. Liquido");
        System.out.println("2. De Fases");
        System.out.println("3. Solido");
        op2 = lea.nextInt();
        while((op2 <1)||(op2>3)){
            System.out.println("Opcion no valida ingrese de nuevo.");
        }
            if (op2 ==1) {
                System.out.println("Litros de gasolina:");
                double lit = lea.nextDouble();
               cohetes.add(new Cliquido(lit,p,nombrec,serie,pot,0));
            }
           else if (op2 == 2) {
                System.out.println("Cantidad de fases:");
                int cf= lea.nextInt();
                System.out.println("Cantidad de motores: ");
                int cm = lea.nextInt();
                System.out.println("Altura");
                double alt = lea.nextDouble();
                cohetes.add(new Fases(cf,cm,alt,p,nombrec,serie,pot,0));
            }
           else if (op2 == 3) {
                System.out.println("Kilos de combustible:");
                double kiloc= lea.nextInt();
                System.out.println("Material");
                 String mat= lea.nextLine(); mat = lea.next();
                 cohetes.add(new CSolido(kiloc,mat,p,nombrec,serie,pot,0));
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
        System.out.println("1. Rocoso");
        System.out.println("2. Gaseoso");
        int op3=lea.nextInt();
        if (op3 ==1) {
            System.out.println("Densidad");
            double dent = lea.nextDouble();
            System.out.println("Escriba 1 si hay vida y 2 si no hay vida:");
            int vida = lea.nextInt();
            String life="";
            if (vida == 1) {
                life= "Hay vida";
            }
            else if (vida == 2) {
                life= "No hay vida";
            }
            planetas.add(new Procoso(dent,life,nombrp,masa,rad,temp,0));
        }
        if (op3 == 2) {
            System.out.println("Presion ");
            double presion = lea.nextDouble();
            System.out.println("Cantidad de anillos:");
            int anillos = lea.nextInt();
            planetas.add(new Pgaseoso(presion,anillos,nombrp,masa,rad,temp,0));
        }
        
        
    }
}
    
