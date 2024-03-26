
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
@Table(name = "usuarios")

public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    
    @Column(name = "IdUsuario")
    private Integer idUsuario;
    
    @Column(name = "Nombre")
    private String nombre;
    
    @Column(name = "Cedula")
    private int cedula;
    @Column(name = "Correo")
    private String correo;
    
    @Column(name = "Contrase\u00f1a")
    private int contraseña;
    
    
    @JoinColumn(name = "IdRol", referencedColumnName = "IdRol")
    @ManyToOne(optional = false)
    private Role idRol;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String nombre, int cedula, int contraseña) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.cedula = cedula;
        this.contraseña = contraseña;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

   

 

    public void setIdRol(Role idRol) {
        this.idRol = idRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        return !((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario)));
    }

    @Override
    public String toString() {
        return "org.mintic.back03.entidades.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
