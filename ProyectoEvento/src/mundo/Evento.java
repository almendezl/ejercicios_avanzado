package mundo;

import cola.Queue;
import lista.Lista;

/**
 *
 * @author Angie Mendez
 */
public class Evento {

    private String nombre;
    private final int cantidadAsistentes;
    private Lista<Persona> asistentes;
    private Queue<Persona> colaIngreso;

    public Evento(String nombre, int tamanio) {
        this.nombre = nombre;
        cantidadAsistentes = tamanio>=10?tamanio:10;
        this.asistentes = new Lista<Persona>();
        colaIngreso = new Queue<Persona>();
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public Queue<Persona> getColaIngreso() {
        return colaIngreso;
    }

    public Lista<Persona> getAsistentes() {
        return asistentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void moverDeLaCola(){
        while( asistentes.size() < cantidadAsistentes ){
            if(colaIngreso.size() > 0){
            asistentes.insertarFinal(colaIngreso.dequeue());
        }else{
                break;
                }
    }
    }
}
