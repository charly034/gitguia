/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;

/**
 *
 * @author Emiliano
 */
public class AutorServicio extends DAO{
    Scanner sc=new Scanner(System.in);
    public void crearAutor() {
        Autor nuevoAutor=new Autor();
        System.out.println("Ingresar el nombre");
        nuevoAutor.setNombre(sc.next());
        System.out.println("Ingrese el id");
        nuevoAutor.setId(sc.next());
        crear(nuevoAutor);
    }
    public void eliminarAutor(){
        Autor autor=new Autor();
        System.out.println("Ingrese el id del autor a eliminar");
        autor.setId(sc.next());
        autor=(Autor)consultar(autor, autor.getId());
        eliminar(autor);
    }
    public void modificarAutor(){
            Autor autor=new Autor();
        System.out.println("Ingrese el id del autor a modificar");
        autor.setId(sc.next());
        autor=(Autor)consultar(autor, autor.getId());
        System.out.println("Cual es el nuevo nombre");
        autor.setNombre(sc.next());
        modificar(autor);
    }
    public  List<Autor> listarAutor(){
            return(List<Autor>)(List<?>)listar("Autor");
    }
}
