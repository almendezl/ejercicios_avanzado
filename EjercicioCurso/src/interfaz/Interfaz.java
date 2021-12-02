/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.Scanner;
import mundo.Curso;
import mundo.Docente;
import mundo.Estudiante;

/**
 *
 * @author Angie Mendez
 */
public class Interfaz {

    static Scanner datos = new Scanner(System.in); //esto nos permite recoger los datos que el usuario ingresa

    public static void main(String[] args) {
        Curso curso = null;
        do {
            System.out.println("Seleccione: \n1. Crear curso\n2. Asignar docente\n3. Matricular estudiante\n4. Imprimir lista del curso\n5. Salir");
            int opcion = datos.nextInt();
            datos.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del curso: ");
                    String nombreCurso = datos.nextLine();
                    curso = new Curso(nombreCurso, crearDocente());
                    break;
                case 2:
                    if (curso != null) {
                        curso.setProfesor(crearDocente());
                    }
                    break;
                case 3:
                    if (curso != null) {
                        curso.matricular(crearEstudiante());
                    }
                    break;
                case 4:

                    if (curso != null) {
                        System.out.println(curso.getEstudiantes().toString());
                    }
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir (S/N)?");
                    if (datos.nextLine().equalsIgnoreCase("S")) {
                        System.exit(0);
                    }
            }
        } while (true);
    }

    private static Estudiante crearEstudiante() {
        System.out.println("Ingrese el nombre del estudiante:");
        String nombreEstudiante = datos.nextLine();
        System.out.println("Ingrese la identificación del estudiante:");
        String idEstudiante = datos.nextLine();
        System.out.println("Ingrese la edad del estudiante:");
        int edadEstudiante = datos.nextInt();
        Estudiante e = new Estudiante(nombreEstudiante, edadEstudiante, idEstudiante);
        datos.nextLine();
        for(int i=0; i<3; i++){
            System.out.println("Ingrese la nota del corte " + (i+1) + " del estudiante :");
            String nota = datos.nextLine();
            e.setNotas(Double.parseDouble(nota),i);
        }
        return e;
    }

    static private Docente crearDocente() {
        System.out.println("Ingrese el nombre del profesor:");
        String nombreProfesor = datos.nextLine();
        System.out.println("Ingrese la identificación del profesor:");
        String idProfesor = datos.nextLine();
        System.out.println("Ingrese la edad del profesor:");
        int edad = datos.nextInt();
        datos.nextLine();

        Docente d = new Docente(nombreProfesor, edad, idProfesor);
        return d;
    }
}
