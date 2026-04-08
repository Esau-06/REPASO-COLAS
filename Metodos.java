import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Metodos {
    
    public Queue<ObjDato> LlenarCola(Queue<ObjDato> c, Scanner sc){
        boolean continuar = true;

        while (continuar) {
            
            ObjDato o = new ObjDato();
            System.out.println("Digite el numero: ");
            o.setNumero(sc.nextInt());

            c.offer(o);

            System.out.println("Desea ingresar otro numero 1) si, 2) no");
            int opt = sc.nextInt();

            if (opt == 2) {
                continuar = false;
            }
        }

        return c;
    }

    public void MostrarCola(Queue<ObjDato> c){
        for(ObjDato o : c){
            System.out.println(o.getNumero() + " ");
        }
        System.out.println();

    }

    public Queue<ObjDato> EliminarCola(Queue<ObjDato> c, Scanner sc) {
        
        System.out.println("Ingrese el numero a eliminar");
        int eliminar = sc.nextInt();

            Queue<ObjDato> aux = new LinkedList<>();

        while (!c.isEmpty()) {

        
            ObjDato o = c.remove();

            if (o.getNumero() != eliminar) {
                aux.offer(o);
            }      
        }

        while (!aux.isEmpty()) {
            c.offer(aux.remove());
            
        }
        return c;
    }


    public  Queue<ObjDato> ModificarCola(Queue<ObjDato> c, Scanner sc) {

        System.out.println("Numero a cambiar");
        int buscar = sc.nextInt();
        
        System.out.println("Nuevo numero");
        int nuevo = sc.nextInt();

        for(ObjDato o : c){
            if (o.getNumero() == buscar) {
                o.setNumero(nuevo);
            }
        }

        
        return c;
        }
        
    }
