
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
@Table(name = "playlist")
public class PlayList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idPlayList")
    private Integer idPlayList;
    @Column(name = "Creditos")
    private String creditos;
    @Column(name = "Nombre")
    private String nombre;
    @JoinColumn(name = "idUsuario", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;
    
   

    public PlayList() {
    }

    public PlayList(Integer idPlayList) {
        this.idPlayList = idPlayList;
    }

    public Integer getIdPlayList() {
        return idPlayList;
    }

    public void setIdPlayList(Integer idPlayList) {
        this.idPlayList = idPlayList;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlayList != null ? idPlayList.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlayList)) {
            return false;
        }
        PlayList other = (PlayList) object;
        return !((this.idPlayList == null && other.idPlayList != null) || (this.idPlayList != null && !this.idPlayList.equals(other.idPlayList)));
    }

    @Override
    public String toString() {
        return "org.mintic.back03.entidades.Playlist[ idPlayList=" + idPlayList + " ]";
    }
    
}
