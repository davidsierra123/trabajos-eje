/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.Productos1;
import java.util.Vector;

/**
 *
 * @author SENA
 */
public class Lista_Usuario {

    public static Vector<Modelo_Prod> Productos = new Vector<Modelo_Prod>();

    public static void Agregacion(Modelo_Prod objeto) {

        Productos.addElement(objeto);

    }

    public static void Eliminar(int poss) {
        Productos.removeElementAt(poss);
    }

    public static Vector mostrar() {

        return Productos;

    }

}
