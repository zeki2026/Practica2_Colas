import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Cola cola = new Cola(4);
        boolean bucle = true;
        Scanner scan = new Scanner(System.in);
        String respuesta;
        String[] res = new String[3]; 
        int val, prioridad;

        while(bucle == true){
            System.out.print("Agregar elemento a la cola: ");
            respuesta = scan.nextLine();

            res= respuesta.split("-");
            if(res[0].equals("")) break;

            val = Integer.parseInt(res[0]);
            prioridad = Integer.parseInt(res[1]);;

            cola.add(val, prioridad);

            cola.imprimir_cola();
        }
        scan.close();


        System.out.println("Vaciar cola: ");
        for(int i = 0; i < cola.getsize(); i++){
            cola.vaciar_cola();
        }
        
    }
}