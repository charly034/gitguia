/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Iterator;
import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.servicios.AutorServicio;
import libreria.servicios.DAO;

/**
 *
 * @author Emiliano
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        AutorServicio nueServicio=new AutorServicio();
//        nueServicio.crearAutor();
//        Autor nuAutor=new Autor("jjjj", "djjj");
//       DAO.crear(nuAutor);
        Editorial nueva = new Editorial("sfdfdsfd", "dafsgggfsf");
        Editorial nueva2 = new Editorial("sfdfdsfd", "sf");
        Editorial no = (Editorial) DAO.consultar(nueva, nueva.getId());
        List<Editorial> nuevalista =(List<Editorial>)(List<?>) DAO.listar("Editorial");
        for (Editorial editorial : nuevalista) {
            System.out.println(editorial.getNombre());
        }
    }

}
