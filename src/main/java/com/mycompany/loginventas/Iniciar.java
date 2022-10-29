/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.loginventas;

import Controllador.Controla;
import Controllador.Controllador_Productos;
import Vista.JFPersonas;

/**
 *
 * @author SENA
 */
public class Iniciar {

    public static void main(String[] args) {

        JFPersonas Persona = new JFPersonas();
        Controla ca = new Controla(Persona);
        ca.Entrar();
        Controllador_Productos cpr = new Controllador_Productos(Controllador_Productos.Productos);
        cpr.Entrar();
    }
}
