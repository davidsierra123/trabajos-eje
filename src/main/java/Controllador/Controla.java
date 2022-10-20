/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.JFPersonas;
import Modelo.Modelo_Cliente;
import Vista.JFrameVendedor;
import Vista.JFrameProductos;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class Controla implements ActionListener {

    private String Usuario = null;
    private String Contraseña = null;

    JFPersonas Login;
    JFrameProductos Productos = new JFrameProductos();
    JFrameVendedor Vendedor = new JFrameVendedor();

    ArrayList<Modelo_Cliente> ListaPersonas = new ArrayList<Modelo_Cliente>();

    public Controla(JFPersonas Login) {
        this.Login = Login;
        this.Login.Entrar.addActionListener(this);
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

            } else {
                JOptionPane.showMessageDialog(null, "USUARIO NO REGISTRADO");
            }

        }
        if (e.getSource() == this.Login.Entrar) {

            Usuario = this.Login.Usuario1.getText();
            Contraseña = this.Login.Contra1.getText();

            if (Usuario.equals("Vendedor") && Contraseña.equals("345")) {
                this.Vendedor.setVisible(true);

            }
        }
        if (e.getSource() == this.Login.Entrar) {

            Usuario = this.Login.Usuario1.getText();
            Contraseña = this.Login.Contra1.getText();

            if (Usuario.equals("Vendedor") && Contraseña.equals("345")) {
                this.Vendedor.setVisible(true);

            }

        }

    }

}
