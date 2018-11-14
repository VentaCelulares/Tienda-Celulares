/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.dispacher;

import javax.swing.JOptionPane;
import mx.edu.uttt.vistas.VistaLogin;
import mx.edu.uttt.vistas.VistaMenuA;
import mx.edu.uttt.vistas.VistaMenuV;
/**
 *
 * @author Marisol
 */
public class Dispatcher {

    public void dispatcher(String petision) {
        switch (petision) {
            case "admin":
                VistaMenuA v = new VistaMenuA();
                v.setVisible(true);
                break;
            case "public":
                VistaMenuV vv = new VistaMenuV();
                vv.setVisible(true);
                break;
            case "login":
                VistaLogin l = new VistaLogin();
                l.setVisible(true);
                break;
            case "Icon":
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                break;
            case "Ius":
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                break;
            case "salir":
                System.exit(0);
                break;
            case "vender":
                JOptionPane.showMessageDialog(null, "Se vendió el celular");
                break;
            case "agregar":
                JOptionPane.showMessageDialog(null, "Se agregó el celular");
                break;
            case "nlogin":
                JOptionPane.showMessageDialog(null, "No se pudo ingresar intentede nuevo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error intente de duevo");
        }
    }
}
