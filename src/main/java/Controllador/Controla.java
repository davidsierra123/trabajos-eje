/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.JFPersonas;
import Vista.JFPersonas;
import Vista.JFVendedor;
import Modelo.Modelo_Prod;
import Vista.JFProductos;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author SENA
 */
public class Controla implements ActionListener {

    private String Usuario = null;
    private String Contraseña = null;

    JFPersonas Login;
    JFProductos Productos = new JFProductos();
    JFVendedor Vendedor = new JFVendedor();

    ArrayList<Modelo_Prod> ListaPersonas = new ArrayList<Modelo_Prod>();

    public Controla(JFPersonas Login) {
        this.Login = Login;
        /*this.Productos = Productos;*/
        this.Login.Entrar.addActionListener(this);
        this.Login.Exit.addActionListener(this);
        this.Productos.B_Mostrar.addActionListener(this);
        this.Productos.B_Buscar.addActionListener(this);
        this.Entrar();

    }

    public void Entrar() {
        this.Login.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.Login.Entrar) {

            Usuario = this.Login.Usuario1.getText();
            Contraseña = this.Login.Contra1.getText();

            if (Usuario.equals("Cliente") && Contraseña.equals("567")) {
                this.Productos.setVisible(true);

            } else if (Usuario.equals("Vendedor") && Contraseña.equals("345")) {
                this.Vendedor.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "DATOS NO ENCONTRADOS, INTENTELO NUEVAMENTE");
            }
        } else if (e.getSource() == this.Login.Exit) {
            System.exit(0);

        }
        if (e.getSource() == this.Productos.B_Mostrar) {
            this.Productos.setVisible(true);
          

        }
    }
        public void tablainfo(JTable Tabla, ArrayList<Modelo_Prod> listapersona) {
        for (int i = 0; i < listapersona.size(); i++) {
            Tabla.setValueAt(listapersona.get(i).getId(),i,0);
            Tabla.setValueAt(listapersona.get(i).getNombre(), i, 1);
            Tabla.setValueAt(listapersona.get(i).getPrecio(), i, 2);
            Tabla.setValueAt(listapersona.get(i).getCategorias(), i, 3);

        }
    }

}

