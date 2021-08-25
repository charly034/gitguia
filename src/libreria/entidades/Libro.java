/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Emiliano
 */
@Entity
public class Libro {
    @Id
    private long isbn;
    private String titulo;
    private Integer anio;
    private Integer ejemplares;
    private Integer prestados;
    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Editorial editorial;
    @OneToMany
    private List<Prestamo> prestamo;

}
