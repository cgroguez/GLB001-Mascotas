/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puppet;

import java.util.List;


public class User {
    
    private String name;
    private String apellido;
    private String alias;
    private String email;
    private String telefono;
    private int capacidadMascota;
    private int tipoUsuario;
    private List Permisos;
    private Direccion direccion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCapacidadMascota() {
        return capacidadMascota;
    }

    public void setCapacidadMascota(int capacidadMascota) {
        this.capacidadMascota = capacidadMascota;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List getPermisos() {
        return Permisos;
    }

    public void setPermisos(List Permisos) {
        this.Permisos = Permisos;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void asignarPermisos(){//ASIGNAR PERMISOS
        
    }
}
