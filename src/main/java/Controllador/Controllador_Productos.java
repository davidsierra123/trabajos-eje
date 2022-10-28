/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import Modelo.Modelo_Prod;
import Vista.JFPersonas;
import Vista.Productos1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;

/**
 *
 * @author SENA
 */
public class Controllador_Productos implements ActionListener {

    /*VARIABLES*/
    
    Productos1 Productos;
    private int Id = 0;
    private String Nombre = null;
    private int Precio = 0;
    private String Categorias = null;

    /*JFRAME A TRABAJAR*/
    /*Productos1 Productos = new Productos1();*/

    /*ARRAYLIST A TRABAJAR*/
    
    ArrayList<Modelo_Prod> ListPersona = new ArrayList<Modelo_Prod>();

    
    public void Controla (Productos1 Productos) {


        /*BOTONES DE JFRAME ADMINISTRADOR-PRODUCTOS*/
        this.Productos = Productos;
        this.Productos.B_Mostrar.addActionListener(this);
        this.Productos.B_Buscar.addActionListener(this);
        this.Productos.B_Guardar.addActionListener(this);

}

    @Override
    public void actionPerformed(ActionEvent e) {
 
        
    }


}
