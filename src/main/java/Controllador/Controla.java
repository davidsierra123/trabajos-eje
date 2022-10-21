/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.Vendedor1;
import Modelo.Modelo_Prod;
import Vista.Cliente1;
import Vista.Admin;
import Vista.Productos1;
import Vista.JFPersonas;
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
    private int Id = 0;
    private String Nombre = null;
    private int Precio = 0;
    private String Categorias = null;

    JFPersonas Login;
    Productos1 Productos = new Productos1();
    Vendedor1 Vendedor1 = new Vendedor1();
    Cliente1 Cliente1 = new Cliente1();
    Admin Admin = new Admin();

    ArrayList<Modelo_Prod> LisPerso = new ArrayList<Modelo_Prod>();

    public Controla(JFPersonas Login) {
        this.Login = Login;
        this.Login.Entrar.addActionListener(this);
        this.Login.Exit.addActionListener(this);
        this.Productos.B_Mostrar.addActionListener(this);
        this.Productos.B_Buscar.addActionListener(this);
        this.Admin.Cliente.addActionListener(this);
        this.Admin.Vendedor.addActionListener(this);
        this.Admin.Productos.addActionListener(this);
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

            if (Usuario.equals("Admin") && Contraseña.equals("123")) {
                this.Admin.setVisible(true);
                this.Admin.Menu1.setVisible(true);
                this.Admin.Menu2.setVisible(true);

            } else if (Usuario.equals("Cliente") && Contraseña.equals("345")) {
                this.Admin.setVisible(true);
                this.Admin.Menu2.setVisible(false);
                this.Admin.Menu3.setVisible(false);

            } else if (Usuario.equals("Vendedor") && Contraseña.equals("567")) {
                this.Admin.setVisible(true);
                this.Admin.Menu1.setVisible(false);
                this.Admin.Menu3.setVisible(false);

//            
            } else {
                JOptionPane.showMessageDialog(null, "DATOS NO EXISTENTES");
            }
        } else if (e.getSource() == this.Login.Exit) {
            System.exit(0);

        }
        if (this.Admin.Vendedor == e.getSource()) {

            Vendedor1 Vende = new Vendedor1();
            this.Admin.Panel.add(Vende);
            Vende.show();

        }
        if (this.Admin.Productos == e.getSource()) {
            Productos1 Prod = new Productos1();
            this.Admin.Panel.add(Prod);
            Prod.show();

        }
        if (this.Admin.Cliente == e.getSource()) {
            Cliente1 Cli = new Cliente1();
            this.Admin.Panel.add(Cli);
            Cli.show();

        }
        if (e.getSource() == this.Productos.B_Buscar) {
            Id = Integer.parseInt(this.Productos.Id_Prod.getText());
            Nombre = Integer.parse(this.Productos.Nom_Prod.getText());
        }
    }

    public void tablainfo(JTable Tabla, ArrayList<Modelo_Prod> listapersona) {
        for (int i = 0; i < listapersona.size(); i++) {
            Tabla.setValueAt(listapersona.get(i).getId(), i, 0);
            Tabla.setValueAt(listapersona.get(i).getNombre(), i, 1);
            Tabla.setValueAt(listapersona.get(i).getPrecio(), i, 2);
            Tabla.setValueAt(listapersona.get(i).getCategorias(), i, 3);

        }
    }

}
