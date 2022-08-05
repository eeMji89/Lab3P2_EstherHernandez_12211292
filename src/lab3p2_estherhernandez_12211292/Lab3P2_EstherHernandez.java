
package lab3p2_estherhernandez_12211292;

/**

 * @author ELIZABETH HERNANDEZ
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Lab3P2_EstherHernandez {
    static Scanner lea = new Scanner(System.in);
    static Random rd = new Random();
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
                System.out.println("Ingrese la posicion del cohete que desea editar:");
                int pc = lea.nextInt();
                if (pc<= cohetes.size()-1 && cohetes.get(pc)instanceof cohetes) {
                    System.out.println("");
                    System.out.println("1.Agregar personas");
                    System.out.println("2.Eliminar personas");
                    System.out.println("3.Listar personas");
                    int op5= lea.nextInt();
                    while((op5 <1)||(op5>3)){
                        System.out.println("Opcion no valida ingrese de nuevo:");
                        op5= lea.nextInt();
                    }
                    if (op5 == 1) {
                        System.out.println("Nombre de la persona:");
                        String np = lea.nextLine(); np = lea.next();
                        System.out.println("Edad: ");
                        int edad = lea.nextInt();
                        System.out.println("Peso");
                        double peso = lea.nextDouble();
                        ((cohetes)cohetes.get(pc)).getPersonas().add(new Personas(np,edad,peso));
                        System.out.println("Persona agregada exitosamente");
                    }
                    if (op5 ==2) {
                        System.out.println("Ingrese la posicion de la persona que desea eliminar:");
                        int pper = lea.nextInt();
                        ((cohetes)cohetes.get(pc)).getPersonas().remove(pper);
                        System.out.println("Persona eliminada del sistema exitosamente");
                    }
                    if (op5 ==3) {
                      int per=  ((cohetes)cohetes.get(pc)).getPersonas().size();
                        String Listarp = "";
                        for (int i = 0; i < per; i++) {
                            Listarp ="["+((cohetes)cohetes.get(pc)).getPersonas().indexOf(i)
                                    +"]"+((cohetes)cohetes.get(pc)).getPersonas();
                        }
                        System.out.println(Listarp);
                    }
                    
                }
                else{
                    System.out.println("Posicion no valida");
                }
                
                break;
            case 4:
                System.out.println("Ingrese la posicion del cohete que desea editar:");
                int pP = lea.nextInt();
                if (pP<= planetas.size()-1 && planetas.get(pP)instanceof Planetas) {
                    System.out.println("");
                    System.out.println("1.Agregar Lunas");
                    System.out.println("2.Elimianr lunas");
                    System.out.println("3.Listar Lunas");
                    int op6 = lea.nextInt();
                     while((op6 <1)||(op6>3)){
                            System.out.println("Opcion no valida ingrese de nuevo:");
                            op6= lea.nextInt();
                        }

                     if (op6 ==1) {
                        System.out.println("Nombre de la luna:");
                        String Nluna = lea.nextLine();Nluna = lea.next();
                        System.out.println("Cantidad de crateres:");
                        int ccrater= lea.nextInt();
                        ((Planetas)planetas.get(pP)).getLunas().add(new lunas(Nluna,ccrater));
                    }
                     if (op6 ==2) {
                         System.out.println("Ingrese la posicion de la luna que desea eliminar:");
                         int pl = lea.nextInt();
                         ((Planetas)planetas.get(pP)).getLunas().remove(pl);
                         System.out.println("Luna eliminada del sistema exitosamente");
                    }
                     if (op6==3) {
                        int luna=  ((Planetas)planetas.get(pP)).getLunas().size();
                        String ListarL = "";
                        for (int i = 0; i < luna; i++) {
                            ListarL +="["+((Planetas)planetas.get(pP)).getLunas().indexOf(i)
                                    +"]"+((Planetas)planetas.get(pP)).getLunas();
                        }
                        System.out.println(ListarL);
                    }
                    }
                
  
                break;
                
            case 5:
                imprimirC();
                break;
            case 6:
                 imprimirP();
                break;
            case 7:
                imprimirP();
                System.out.println("Seleccione el Planeta");
               int p = lea.nextInt();
               Double mass = planetas.get(p).getMasa();
               Double radio=  planetas.get(p).getMasa();
               double g = 6.67 * (Math.pow(10, -1));
               double velocidadE = Math.sqrt((2*g*mass)/2);
               planetas.get(p).setVelocidad(velocidadE);
                System.out.println("1. Un cohete");
                System.out.println("2. Todos los cohetes");
                int op7 = lea.nextInt();
                int cont1 = 0;
                int cont2 = 0;
                if (op7 == 1) {
                    imprimirC();
                    System.out.println("Seleccione el cohete ");
                    int pcc = lea.nextInt();
                    cohetes.get(pcc);
                    int potencia = cohetes.get(pcc).getPotencia();
                    double Nr = 5000+ rd.nextInt(20000);
                    Double velcohete = potencia * Nr ;
                    cont1 = 0;
                    cont2 = 0;
                    if (velcohete < velocidadE) {
                        cont2 =cont2 +1;
                      
                    }
                    else {
                        cont1 = cont1 +1;
                    }
                    if (cont1>0) {
                        System.out.println("El cohete "+ cohetes.get(pcc).getNombre()+"Alcanzo la velocidad de" + velcohete
                        + " km/h y logro salir del planeta "+ planetas.get(p).getNombre());
                        System.out.println("Lanzamientos exitosos: "+ cont1);
                        System.out.println("Lamzamientos fallidos: "+ cont2);
                    }
                    else{
                        System.out.println("El cohete "+ cohetes.get(pcc).getNombre()+"Alcanzo la velocidad de" + velcohete
                        + " km/h y no logro salir del planeta "+ planetas.get(p).getNombre());
                        System.out.println("Lanzamientos exitosos: "+ cont1);
                        System.out.println("Lamzamientos fallidos: "+ cont2);
                    }
                    System.out.println("");
                }
                if (op7 ==2) {
                    for (int i = 0; i < cohetes.size(); i++) {
                    int potencia = cohetes.get(i).getPotencia();
                    double Nr = 5000+ rd.nextInt(20000);
                    Double velcohete = potencia * Nr ;
                    
                    if (velcohete < velocidadE) {
                        cont2 =cont2 +1; 
                    }
                    else {
                        cont1 = cont1 +1;
                    }
                    if (cont1>0) {
                        System.out.println("El cohete "+ cohetes.get(i).getNombre()+"Alcanzo la velocidad de " + velcohete
                        + " km/h y logro salir del planeta "+ planetas.get(p).getNombre());
                        System.out.println("Lanzamientos exitosos: "+ cont1);
                        System.out.println("Lamzamientos fallidos: "+ cont2);
                    }
                    else{
                        System.out.println("El cohete "+ cohetes.get(i).getNombre()+"Alcanzo la velocidad de " + velcohete
                        + " km/h y no logro salir del planeta "+ planetas.get(p).getNombre());
                        System.out.println("Lanzamientos exitosos: "+ cont1);
                        System.out.println("Lamzamientos fallidos: "+ cont2);
                    }
                    }
                }
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
            op2= lea.nextInt();
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
    
    public static void imprimirP(){
        System.out.println("PLANETAS");
                String lplaneta="";
                for (Object object : planetas) {
                    if (object instanceof Planetas) {
                        lplaneta+= "["+cohetes.indexOf(object)+"]"+"- "+object+"\n";
                    }
                    System.out.println(lplaneta);
                    
                }
    }
    public static void imprimirC(){
        System.out.println("COHETES");
                String lcohete="";
                for (Object object : cohetes) {
                    if (object instanceof cohetes) {
                        lcohete+= "["+cohetes.indexOf(object)+"]"+"- "+object+"\n";
                    }
                    System.out.println(lcohete);
                    
                }
    }
}
    
