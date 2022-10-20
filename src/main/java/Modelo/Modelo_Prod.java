/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author David Sierra
 */
public class Modelo_Prod {
     protected int Id;
     protected String Nombre;
     protected int Precio;
     protected String Categorias;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getCategorias() {
        return Categorias;
    }

    public void setCategorias(String Categorias) {
        this.Categorias = Categorias;
    }

    public Modelo_Prod(int Id, String Nombre, int Precio, String Categorias) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Categorias = Categorias;
    }
    
}
