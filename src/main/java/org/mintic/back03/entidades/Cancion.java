
package org.mintic.back03.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "canciones")
public class Cancion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idCancion")
    private Integer idCancion;
    
    @Column(name = "Nombre")
    private String nombre;
    
    @Column(name = "Autor")
    private String autor;
    
    @JoinColumn(name = "IdGenero", referencedColumnName = "idGenero")
    @ManyToOne(optional = false)
    private Genero idGenero;
    
    

    public Cancion() {
    }

    public Cancion(Integer idCancion) {
        this.idCancion = idCancion;
    }

    public Cancion(Integer idCancion, String nombre) {
        this.idCancion = idCancion;
        this.nombre = nombre;
    }

    public Integer getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(Integer idCancion) {
        this.idCancion = idCancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Genero getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Genero idGenero) {
        this.idGenero = idGenero;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCancion != null ? idCancion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cancion)) {
            return false;
        }
        Cancion other = (Cancion) object;
        return !((this.idCancion == null && other.idCancion != null) || (this.idCancion != null && !this.idCancion.equals(other.idCancion)));
    }

    @Override
    public String toString() {
        return "org.mintic.back03.entidades.Canciones[ idCancion=" + idCancion + " ]";
    }
    
}
