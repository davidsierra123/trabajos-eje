/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.loginventas;

import Controllador.Controla;
import Vista.JFPersonas;

/**
 *
 * @author SENA
 */
public class Iniciar {

    public static void main(String[] args) {

        JFPersonas Persona = new JFPersonas();
        Controla cp = new Controla(Persona);
        cp.Entrar();
    }
}
