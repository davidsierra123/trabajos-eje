/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author David Sierra
 */
public class Modelo_Vendedor {
    protected int Identificacion;
    protected String Nombres;
    protected String Apellidos;

    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Modelo_Vendedor(int Identificacion, String Nombres, String Apellidos) {
        this.Identificacion = Identificacion;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }
    
    
}
