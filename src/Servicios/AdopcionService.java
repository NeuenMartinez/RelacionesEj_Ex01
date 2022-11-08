package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class AdopcionService {

    List<Perro> ListaPerrosAadop = new ArrayList<>();
    List<Persona> ListaPersonas = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void crearPerro() {
        System.out.println("¿Cuantos Perros hay para adoptar?");
        int cant = leer.nextInt();
        System.out.println("Ingresar los datos de los perros:");
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingresar el nombre: ");
            String nom = leer.next();
            System.out.println("Ingresar la raza: ");
            String raz = leer.next();
            System.out.println("Ingresar la edad:");
            Integer edad = leer.nextInt();
            System.out.println("Ingresar el tamaño:");
            String tam = leer.next();
            ListaPerrosAadop.add(new Perro(nom, raz, edad, tam, null));
        }
    }

    public void crearPersona() {
        boolean loop = true;
        boolean loop2 = true;
        System.out.println("Ingresar los datos de la persona:");
        do {
            System.out.println("Ingresar el nombre: ");
            String nom = leer.next();
            System.out.println("Ingresar el apellido: ");
            String ap = leer.next();
            System.out.println("Ingresar la edad:");
            Integer edad = leer.nextInt();
            System.out.println("Ingresar el DNI:");
            String dni = leer.next();
            ListaPersonas.add(new Persona(nom, ap, edad, dni));
            System.out.println("Desea agregar otra persona? (s/n)");
            loop = true;
            loop2 = true;
            do {
                switch (leer.next()) {
                    case "s":
                        loop2 = false;
                        break;
                    case "n":
                        loop = false;
                        loop2 = false;
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida.");
                }
            } while (loop2);

        } while (loop);

    }

    public void eleccionPerro() {
        boolean aux3 = true;
        boolean aux4 = false;
        boolean loop3 = true;
        boolean aux15 = true;
        for (Persona aux : ListaPersonas) {
            System.out.println(aux);
            do {

                aux15 = true;
                System.out.println("¿Que perro desea adoptar? (ingrese el nombre exacto del perro)");
                System.out.println("--------------------------------------");
                System.out.println("Lista de perros para adoptar: ");
                for (Perro aux45 : ListaPerrosAadop) {
                    System.out.println(aux45);
                }
                System.out.println("--------------------------------------");
                String elec = leer.next();
                for (Iterator<Perro> iterator = ListaPerrosAadop.iterator(); iterator.hasNext();) {
                    Perro aux2 = iterator.next();
                    if (elec.equals(aux2.getNombre())) {
                        System.out.println("Felicidades... A adoptado a: " + aux2.getNombre());
                        aux.getListaPerros().add(aux2);
                        aux2.setDueño(aux);
                        iterator.remove();
                        aux4 = true;
                    } else {
                        aux3 = false;
                    }

                }

                if (aux3 == false && aux4 == false) {
                    System.out.println("El nombre del perro seleccionado es incorrecto o ya fue adoptado... intente nuevamente");
                }
                System.out.println("¿Desea adoptar otro Perro?");
                do {
                    switch (leer.next()) {
                        case "s":
                            loop3 = false;
                            break;
                        case "n":
                            aux15 = false;
                            loop3 = false;
                            break;
                        default:
                            System.out.println("Ingrese una opcion valida.");
                    }
                } while (loop3);
            } while (aux15);
        
        }
    }
}
