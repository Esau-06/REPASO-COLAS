import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Queue<ObjDato> cola = new LinkedList<>();
        boolean seguir = true;

        while (seguir) {        
            System.out.println("1) Para llenar la cola");
            System.out.println("2) Mostrar Cola");
            System.out.println("3) Eliminar repetido");
            System.out.println("4) Modificar Cola");
            System.out.println("5) salir");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    cola = m.LlenarCola(cola, sc);
                    break;
                case 2:
                    m.MostrarCola(cola);
                    break;
                case 3:
                    cola = m.EliminarCola(cola, sc);
                    break;
                case 4:
                    cola = m.ModificarCola(cola, sc);
                    break;
                case 5:
                    seguir = false;
                    break;
            }

        }
        }
}
