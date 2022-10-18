/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.JFPersonas;
import Modelo.ModeloP;
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

    ArrayList<ModeloP> ListaPersonas = new ArrayList<ModeloP>();

    public Controla(JFPersonas Login) {
        this.Login = Login;
        this.Entrar();

    }

    public void Entrar() {
        this.Login.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
