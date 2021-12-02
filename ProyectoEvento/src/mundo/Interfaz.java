package mundo;

import java.util.Date;
import java.util.Scanner;
import sort.QuickSort;
/**
 *
 * @author Angie Mendez
 */
public class Interfaz <Item>{

    static Scanner datos = new Scanner(System.in);
    static Evento evento;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Seleccione una opcion:");
            System.out.println("0. Para salir");
            System.out.println("1. Crear evento");
            System.out.println("2. Agregar un asistente");
            System.out.println("3. Buscar un asistente ");//tambien en la cola
            System.out.println("4. Modificar un asistente");
            System.out.println("5. Eliminar un asistente");
            System.out.println("6. Visualizar asistentes en espera");
            System.out.println("7. Visualizar la lista de asistentes");
            System.out.println("8. Ordenar");
            System.out.println("9. Visualizar todo");
            String opcion = datos.next();
            opciones(opcion);
        }
    }

    public static void opciones(String opcion) {
    
        switch (opcion) {
            case "0":
                System.exit(0);
            case "1":
                crearEvento();
                break;
            case "2":
                agregarUnAsistente();
                break;
            case "3":
                buscarAsistente();
                break;
            case "4":
                modificarP();
                break;
            case "5":
                eliminarPersona();
                break;
            case "6":
                verAsistentesEspera();
                break;
            case "7":
                verListaAsistentes();
                break;
            case "8":
                ordenar();
                break;
            case "9":
                verTodo();
                break;
            default:
                System.out.println("Dato invalido, intente de nuevo");
                break;
        }
    }

    public static String llenarNom() {
        String nombres[] = {"Ana", "Juan", "David", "Pedro", "Carlos", "Sofia", "Andrea", "Nicolas", "Paula", "Esteban", "Lady", "Daniel", "Felipe", "Viviana", "Santiago", "Crsitian", "Alexander", "Camila", "Diana", "Laura", "Nicole", "Sebastian", "Jhoan", "Daniela", "Catalina", "Andres", "Enrique", "Valentina", "Sara", "Sergio"};
        return nombres[(int) (Math.random() * nombres.length)].toUpperCase();
    }

    public static String llenarAp() {
        String ap[] = {"Ortiz", "Suarez", "Lopez", "Rodriguez", "Barragan", "Gonzales", "Garcia", "Zamudio", "Triana", "Diaz", "Gomez", "Torres", "Beltran", "Navarro", "Martinez", "Forero", "Jimenez", "Alvarado", "Romero", "Ramirez", "Polo", "Perez", "Mendoza", "Cruz", "Velez", "Sanchez", "Vargas", "Gutierrez", "Ruiz", "Arango"};
        return ap[(int) (Math.random() * ap.length)].toUpperCase();
    }

    public static String crearCedula() {
        String cedula = "";
        for (int i = 0; i < 10; i++) {
            cedula += (int) (Math.random() * 9+1) + "";
        }
        return cedula;
    }

    public static Persona crearAsistente() {
        int edad = (int) (Math.random() * (99 - 18 + 1) + 18);
        return new Persona(llenarNom(), llenarAp(), edad, crearCedula(), new Date());
    }

    public static void crearEvento() {
        if (!verificar()) {
            System.out.println("Ingrese el nombre del nuevo evento:");
            datos.nextLine();
            String nombre = datos.nextLine();
            System.out.println("\nIngrese la cantidad maxima de asistentes: ");
            int tamanio;
            tamanio = datos.nextInt();
            evento = new Evento(nombre, tamanio);
            for (int i = 0; i < tamanio; i++) {
                evento.getAsistentes().insertarFinal(crearAsistente());
            }
        } else {
            System.out.println("El evento ya ha sido creado");
        }
    }

    public static void agregarUnAsistente() {
        if (verificar()) {
            if (evento.getCantidadAsistentes() == evento.getAsistentes().size()) {
                    evento.getColaIngreso().enqueue(crearAsistente());
            } else {
                evento.getAsistentes().insertarFinal(crearAsistente());
            }
        } else {
            System.out.println("Primero debe crear el evento");
        }
    }

    public static void buscarAsistente() {
        if (verificar()) {// ha creado el evento
            System.out.println("Ingrese el numero de cedula: ");
            String nroCedula = datos.next();
            for (Persona p : evento.getAsistentes()) {//busca en la lista
                if (nroCedula.equals(p.getCedula())) {
                    System.out.println(p);
                    return;
                }
            }
            if (!evento.getColaIngreso().isEmpty()) {
                for (Persona p2 : evento.getColaIngreso()) {
                    if (nroCedula.equals(p2.getCedula())) {
                        System.out.println(p2);
                        return;
                    }
                }
            }
            System.out.println("No encontrado");

        } else {
            System.out.println("Primero debe crear el evento");
        }
    }

    public static void modificarP() {
        if (verificar()) {
            System.out.println("Ingrese el numero de cedula: ");
            String nro = datos.next();
            for (Persona p : evento.getAsistentes()) {
                if (p.getCedula().equals(nro)) {
                    System.out.println(p);
                    actualizar(p);
                    return;
                }
            }
            if (!evento.getColaIngreso().isEmpty()) {
                for (Persona p : evento.getColaIngreso()) {
                    if (p.getCedula().equals(nro)) {
                        System.out.println(p);
                        actualizar(p);
                        return;
                    }
                }
            }
            System.out.println("No encontrado");
        } else {
            System.out.println("Primero debe crear el evento!!");
        }
    }

    public static void actualizar(Persona p) {
        int opc;
        do {
            System.out.println("Seleccione el dato a modificar");
            System.out.println("0. Para terminar de modificar");
            System.out.println("1. Nombre");
            System.out.println("2. Apellido");
            System.out.println("3. Edad");
            opc = datos.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nuevo dato: ");
                    datos.nextLine();
                    String nombre = datos.nextLine();
                    p.setNombre(nombre.toUpperCase());
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo dato: ");
                    datos.nextLine();
                    String apellido = datos.nextLine();
                    p.setApellido(apellido.toUpperCase());
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo dato: ");
                    int edad = datos.nextInt();
                    p.setEdad(edad);
                    break;
                default:
                    System.out.println("Seleccion invalida, intente de nuevo!! ");
                    break;
            }
        } while (opc != 0);
    }
    public static void eliminarPersona() {
        if (verificar()) {// ha creado el evento
            System.out.println("Ingrese el numero de cedula: ");
            String nro = datos.next();
            for (Persona p : evento.getAsistentes()) {
                if (p.getCedula().equals(nro)) {
                    evento.getAsistentes().eliminaValor(p);
                    evento.moverDeLaCola();//para que se mueva automatico de la cola de espera, si se llega a borrar un asistente de la lista
                    return;
                }
            }
            if (!evento.getColaIngreso().isEmpty()) {
                for (Persona p : evento.getColaIngreso()) {
                    if (p.getCedula().equals(nro)) {
                        evento.getColaIngreso().eliminar(p);
                        return;
                    }
                }
            }
            System.out.println("No encontrado");
        } else {
            System.out.println("Primero debe crear el evento");
        }
    }
    public static void verAsistentesEspera() {
        if (verificar()) {
            if (!evento.getColaIngreso().isEmpty()) {
                for (Persona p : evento.getColaIngreso()) {
                    System.out.println(p);
                }
            } else {
                System.out.println("Cola de espera vacia\n");
            }
        } else {
            System.out.println("Primero debe crear el evento");
        }
    }
    public static void ordenar(){
        if(verificar()){
        Persona arrP[] = new Persona[evento.getAsistentes().size()];//copia de los asistentes para ordenar
            int i = 0;
            for (Persona p : evento.getAsistentes()) {
                arrP[i++] = p;
            }
            QuickSort.sort(arrP);
            for (Persona arrP1 : arrP) {
                System.out.println(arrP1);
            }
        }else{
            System.out.println("Primero debe crear el evento");
        }
    }
    public static void verListaAsistentes() {
        if (verificar()) {
            for (Persona p : evento.getAsistentes()) {
                System.out.println(p);
            }
        } else {
            System.out.println("Primero debe crear el evento");
        }
    }
    public static void verTodo() {
        if (verificar()) {
            System.out.println("Nombre del evento: " + evento.getNombre());
            System.out.println("################Lista de asistentes#####################");
            verListaAsistentes();
            System.out.println("*****************************Ordenados***************************");
            ordenar();
            System.out.println("################Lista de asistentes en espera #####################");
            verAsistentesEspera();
        } else {
            System.out.println("No se ha creado el evento!!");
        }
    }
    public static boolean verificar() {
        return evento != null;
    }
}