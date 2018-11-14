/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.FrontControler;
import javax.swing.JOptionPane;
import mx.edu.uttt.dispacher.Dispatcher;
import mx.edu.uttt.vistas.VistaLogin;
import mx.edu.uttt.vistas.VistaMenuA;
import mx.edu.uttt.vistas.VistaMenuV;

/**
 *
 * @author crist
 */
public class FrontControlerAdministrador {
    public void Salir(){
    Dispatcher d=new Dispatcher();
    d.dispatcher("salir");
    }
}
