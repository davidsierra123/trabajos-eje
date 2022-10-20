/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author SENA
 */
public class Modelo_Cliente {
    protected String Usuario;
    protected int Contraseña;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getContraseña() {
        return Contraseña;
    }

    public void setContraseña(int Contraseña) {
        this.Contraseña = Contraseña;
    }

    public Modelo_Cliente(String Usuario, int Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    
    }
    

