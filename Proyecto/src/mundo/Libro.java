/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Angie Mendez
 */
public class Libro implements Comparable<Libro> {
    private final String titulo;
    private final Persona autor;
    private final String genero;
    private final String editorial;
    private final String isbn;
    private final int nroPaginas;
    
    public Libro(String nombre, Persona autor,  String genero, String editorial,String isbn, int nroPaginas){
        this.titulo = nombre;
        this.autor = autor;
        this.genero = genero;
        this.editorial = editorial;
        this.isbn = isbn;
        this.nroPaginas = nroPaginas>=49?nroPaginas:49;
    }

    public String getNombre() {
        return titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{ " + "\nTitulo: " + titulo + "\nAutor -> " + autor.toString() + "\nGenero: " + genero + ",\nEditorial: " + editorial + "\nISBN: " + isbn + "\nNumero de paginas: " + nroPaginas + '}';
    }

    @Override
    public int compareTo(Libro that) {
       if(this.autor.compareTo(that.autor) > 0){
            return 1;
        }
        if(this.autor.compareTo(that.autor) < 0){
            return -1;
        }
        /*if(this.genero.compareTo(that.genero) > 0){
            return 1;
        }
        if(this.genero.compareTo(that.genero) < 0){
            return -1;
        }*/
      /* if(this.isbn.compareTo(that.isbn) > 0){
            return 1;
        }
        if(this.isbn.compareTo(that.isbn) < 0){
            return -1;
        }*/
   /*   if(this.nroPaginas > that.nroPaginas){
            return 1;
        }
        if(this.nroPaginas < that.nroPaginas){
            return -1;
        }*/
        return 0;
       // if(this.autor)
    }
    
}
