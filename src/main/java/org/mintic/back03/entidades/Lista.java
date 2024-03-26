
package org.mintic.back03.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "listas")

public class Lista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idLista")
    private Integer idLista;
    
    @Column(name = "posicion")
    private int posicion;
    
    @JoinColumn(name = "idCancion", referencedColumnName = "idCancion")
    @ManyToOne(optional = false)
    private Cancion idCancion;
    
    @JoinColumn(name = "idPlaylist", referencedColumnName = "idPlayList")
    @ManyToOne(optional = false)
    private PlayList idPlaylist;
    
    @JoinColumn(name = "idUsuario", referencedColumnName = "IdUsuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public Lista() {
    }

    public Lista(Integer idLista) {
        this.idLista = idLista;
    }

    public Lista(Integer idLista, int posicion) {
        this.idLista = idLista;
        this.posicion = posicion;
    }

    public Integer getIdLista() {
        return idLista;
    }

    public void setIdLista(Integer idLista) {
        this.idLista = idLista;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Cancion getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(Cancion idCancion) {
        this.idCancion = idCancion;
    }

    public PlayList getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(PlayList idPlaylist) {
        this.idPlaylist = idPlaylist;
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
        hash += (idLista != null ? idLista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lista)) {
            return false;
        }
        Lista other = (Lista) object;
        return !((this.idLista == null && other.idLista != null) || (this.idLista != null && !this.idLista.equals(other.idLista)));
    }

    @Override
    public String toString() {
        return "org.mintic.back03.entidades.Listas[ idLista=" + idLista + " ]";
    }
    
}
