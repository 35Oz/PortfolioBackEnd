package com.portfolio.ezeq.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String email;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String telefono;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String ubicacion;
    
    @NotNull
    @Size(min = 1, max = 50000, message = "no cumple con la longitud")
    private String descripcion;
    
    private String imgP;
    private String img;
    
    //constructores

    public Persona() {
    }

    public Persona( String nombre, String apellido, String email, String telefono, String ubicacion, String descripcion, String img, String imgP) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.img = img;
        this.imgP = imgP;
    }


    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    public String getImgP() {
        return img;
    }

    public void setImgP(String img) {
        this.img = img;
    }


    
}
