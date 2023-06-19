/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.trabajo.clases.u3;

import ec.edu.ups.trabajo.clases.u3.modelo.Contacto;
import java.util.Scanner;

/**
 *
 * @author aroon
 */
public class TrabajoClasesU3 {

    public static void main(String[] args) {
        Agenda<String, String> agenda = new Agenda<>();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            System.out.println("MENU:");
            System.out.println("1. AGREGAR CONTACTO");
            System.out.println("2. ELIMINAR CONTACTO");
            System.out.println("3. BUSCAR");
            System.out.println("4. SALIR");
            System.out.print("POR FAVOR SELECCIONES UNA DE LAS OPCIONES: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("INTRODUZCA NOMBRE: ");
                    String nombre = scanner.nextLine();
                    System.out.print("ITRODUZCA TELEFONO: ");
                    String telefono = scanner.nextLine();
                    Contacto<String, String> contact = new Contacto<>(nombre, telefono);
                    agenda.agregar(contact);
                    System.out.println("CONTACTO AGREGADO");
                    break;
                case 2:
                    System.out.print("INTRODUZCA NOMBRE: ");
                    nombre = scanner.nextLine();
                    agenda.borrar(nombre);
                    System.out.println("CONTACTO ELIMINADO");
                    break;
                case 3:
                    System.out.println("INGRESE EL NOMBRE A BUSCAR");
                    nombre = scanner.nextLine();
                    agenda.buscar(nombre);
                    System.out.println("USTED BUSCO: "+nombre);
                case 4:
                    System.out.println("GRACIAS POR SALIR");
                    break;
                default:
                    System.out.println("OPCION INVALIDA VULEVA A INGRESAR");
            }
        }
    }
}
