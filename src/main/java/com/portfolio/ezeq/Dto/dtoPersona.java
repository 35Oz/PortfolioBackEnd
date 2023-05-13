package com.portfolio.ezeq.Dto;

import jakarta.validation.constraints.NotBlank;


public class dtoPersona {
    
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String descripcion;
    @NotBlank    
    private String email;
     @NotBlank    
    private String telefono;
    @NotBlank    
    private String ubicacion;
    @NotBlank    
    private String img;
    @NotBlank    
    private String imgP;
    
    //constructor

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String descripcion, String email, String telefono, String ubicacion, String img, String imgP) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.email = email;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.img = img;
        this.imgP = imgP;
    }


    
    //Getters y Setters

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
     public String getImgP() {
        return imgP;
    }

    public void setImgP(String imgP) {
        this.imgP = imgP;
    }

   
    
    
    
}
