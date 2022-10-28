/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllador;

/*EXPORTAMOS TODAS LAS COSAS QUE VAMOS A NECESITAR*/
import Modelo.Lista_Usuario;
import Modelo.Modelo_Clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.Vendedor1;
import Modelo.Modelo_Prod;
import Modelo.Modelo_Vendedor;
import Vista.Cliente1;
import Vista.Admin;
import Vista.Productos1;
import Vista.JFPersonas;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;

/**
 *
 * @author SENA
 */
public class Controla implements ActionListener {

    /*LE DAMOS LOS PARAMETROS QUE VAMOS A UTILIZAR A LA CHISMOSA*/
    private String Usuario = null;
    private String Contraseña = null;

    /*VARIABLES DE PRODUCTOS*/
    private int Id = 0;
    private String Nombre = null;
    private int Precio = 0;
    private String Categorias = null;

    /*ESTABLECEMOS LOS LOGIN A TRABAJAR*/
    JFPersonas Login;
    Productos1 Productos = new Productos1();
    Vendedor1 Vendedor1 = new Vendedor1();
    Cliente1 Cliente1 = new Cliente1();
    Admin Admin = new Admin();

    ArrayList<Modelo_Prod> ListPersona = new ArrayList<Modelo_Prod>();
    ArrayList<Modelo_Clientes> ListClientes = new ArrayList<Modelo_Clientes>();
    ArrayList<Modelo_Vendedor> ListVendedor = new ArrayList<Modelo_Vendedor>();

    public Controla(JFPersonas Login) {

        /*BOTONES DE JFRAME PRNCIPAL*/
        this.Login = Login;
        this.Login.Entrar.addActionListener(this);
        this.Login.Exit.addActionListener(this);

        /*BOTONES DE JFRAME ADMINISTRADOR-PRODUCTOS*/
        this.Productos.B_Mostrar.addActionListener(this);
        this.Productos.B_Buscar.addActionListener(this);
        this.Productos.B_Guardar.addActionListener(this);

        /*BOTONES DE JFRAME ADMINISTRADOR*/
        this.Admin.Cliente.addActionListener(this);
        this.Admin.Vendedor.addActionListener(this);
        this.Admin.Productos.addActionListener(this);
        this.Admin.B_Exit.addActionListener(this);
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

                this.Login.Usuario1.setText("");
                this.Login.Contra1.setText("");

            } else if (Usuario.equals("Cliente") && Contraseña.equals("345")) {
                this.Admin.setVisible(true);
                this.Admin.Menu2.setVisible(false);
                this.Admin.Menu3.setVisible(false);

                this.Login.Usuario1.setText("");
                this.Login.Contra1.setText("");

            } else if (Usuario.equals("Vendedor") && Contraseña.equals("567")) {
                this.Admin.setVisible(true);
                this.Admin.Menu1.setVisible(false);
                this.Admin.Menu3.setVisible(false);

                this.Login.Usuario1.setText("");
                this.Login.Contra1.setText("");

//            
            } else {
                JOptionPane.showMessageDialog(null, "DATOS NO EXISTENTES");
            }
        } else if (e.getSource() == this.Login.Exit) {
            System.exit(0);

        }
        if (this.Admin.Vendedor == e.getSource()) {

            this.Admin.Panel.add(Vendedor1);
            Vendedor1.show();

            this.Cliente1.doDefaultCloseAction();
            this.Productos.doDefaultCloseAction();

        }
        if (this.Admin.Productos == e.getSource()) {
            this.Admin.Panel.add(Productos);
            Productos.show();

            this.Cliente1.doDefaultCloseAction();
            this.Vendedor1.doDefaultCloseAction();
        }
        if (this.Admin.Cliente == e.getSource()) {
            this.Admin.Panel.add(Cliente1);
            Cliente1.show();

            this.Vendedor1.doDefaultCloseAction();
            this.Productos.doDefaultCloseAction();

        }

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
        if (e.getSource() == this.Admin.B_Exit) {
            Admin.dispose();
            Login.setVisible(true);

            this.Productos.Iden_Prod.setText("");
            this.Productos.Nombr_Pro.setText("");
            this.Productos.Prec_Prod.setText("");
            this.Productos.Cate_Prod.setText("");

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
