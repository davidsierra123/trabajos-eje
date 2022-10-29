/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import Modelo.Lista_Usuario;
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
    
    public static Productos1 Productos = new Productos1();
    private int Id = 0;
    private String Nombre = null;
    private int Precio = 0;
    private String Categorias = null;
    

    /*JFRAME A TRABAJAR*/

 /*ARRAYLIST A TRABAJAR*/
    ArrayList<Modelo_Prod> ListPersona = new ArrayList<Modelo_Prod>();


    public Controllador_Productos(Productos1 Productos) {


        /*BOTONES DE JFRAME ADMINISTRADOR-PRODUCTOS*/
        this.Entrar();
        this.Productos = Productos;
        this.Productos.B_Mostrar.addActionListener(this);
        this.Productos.B_Buscar.addActionListener(this);
        this.Productos.B_Guardar.addActionListener(this);
        

    }
     public void Entrar() {
        this.Productos.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.Productos.B_Guardar) {
            Id = Integer.parseInt(this.Productos.Iden_Prod.getText());
            Nombre = (this.Productos.Nombr_Pro.getText());
            Precio = Integer.parseInt(this.Productos.Prec_Prod.getText());
            Categorias = this.Productos.Cate_Prod.getText();

            Modelo_Prod objeto = new Modelo_Prod(Id, Nombre, Precio, Categorias);

            if (Modelo_Prod.Verificar(Id, Nombre, Precio, Categorias) == -1) {
                objeto.setId(Id);
                objeto.getNombre();
                objeto.getPrecio();
                objeto.getCategorias();

                Lista_Usuario.Agregacion(objeto);

                tablainfo(this.Productos.Tabla_Prod, Lista_Usuario.Productos);

                JOptionPane.showMessageDialog(null, "Datos Guardados Con Exitos");

                this.Productos.Iden_Prod.setText("");
                this.Productos.Nombr_Pro.setText("");
                this.Productos.Prec_Prod.setText("");
                this.Productos.Op1.setActionCommand("");

            } else {
                JOptionPane.showMessageDialog(null, "NO SIRVE");
            }
        }

        if (e.getSource() == this.Productos.B_Buscar) {

            Id = Integer.parseInt(this.Productos.Iden_Prod.getText());
            for (int i = 0; i < Lista_Usuario.Productos.size(); i++) {
                if (Id == Lista_Usuario.Productos.get(i).getId()) {
                    this.Productos.Nombr_Pro.setText(Lista_Usuario.Productos.get(i).getNombre());

                }
            }
        }
        if (e.getSource() == this.Productos.B_Mostrar) {
            for (int i = 0; i < Lista_Usuario.Productos.size(); i++) {
                JOptionPane.showMessageDialog(null, "Documento: " + Lista_Usuario.Productos.get(i).getId() + "\n" + "Nombre : " + Lista_Usuario.Productos.get(i).getNombre() + "\n" + "Precio : " + Lista_Usuario.Productos.get(i).getPrecio());
            }
        }

    }

    public void tablainfo(JTable Tabla, Vector<Modelo_Prod> Productos) {
        for (int i = 0; i < Lista_Usuario.Productos.size(); i++) {
            Tabla.setValueAt(Lista_Usuario.Productos.get(i).getId(), i, 0);
            Tabla.setValueAt(Lista_Usuario.Productos.get(i).getNombre(), i, 1);
            Tabla.setValueAt(Lista_Usuario.Productos.get(i).getPrecio(), i, 2);
            Tabla.setValueAt(Lista_Usuario.Productos.get(i).getCategorias(), i, 3);

        }

    }

}
