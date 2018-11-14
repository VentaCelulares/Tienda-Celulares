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
public class FrontControlerLogin {
     public boolean autenticUsuario(String user, String password){
     boolean x=false;
        if (user.equals("Admin")&&password.equals("admin")) {
            Dispatcher d=new Dispatcher();
            d.dispatcher("admin");
           x=true;
        }else if (user.equals("Public")&&password.equals("1234")) {
            Dispatcher d=new Dispatcher();
            d.dispatcher("public");
                x=true;
            }else if (user.equals("Public")|| user.equals("Admin") && (!password.equals("admin")|| !password.equals("1234")) ){
            Dispatcher d=new Dispatcher();
            d.dispatcher("Icon");
            }else if (password.equals("admin")|| password.equals("1234") &&(!user.equals("Public")|| !user.equals("Admin"))){
            Dispatcher d=new Dispatcher();
            d.dispatcher("Ius");
            }else{
           Dispatcher d=new Dispatcher();
            d.dispatcher("nlogin");
            }
        return x;
        }
}
