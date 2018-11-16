/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.FrontControler;
import mx.edu.uttt.dispacher.Dispatcher;
/**
 *
 * @author crist
 */
public class FrontControlerMenuVenta {
  
    public void Salir(){
    Dispatcher d=new Dispatcher();
    d.dispatcher("salir");
    }
    public void login(){
    Dispatcher d=new Dispatcher();
    d.dispatcher("login");
    }
    public void vender(){
    Dispatcher d=new Dispatcher();
    d.dispatcher("vender");
    }

}
