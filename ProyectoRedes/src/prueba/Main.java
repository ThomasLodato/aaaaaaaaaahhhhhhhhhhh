/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import vista.App;
import vista.Login;
import vista.Registro;

/**
 *
 * @author Daren
 */
public class Main {
     public static void main(String args[]) {
         Login login = new Login();
         Registro registro = new Registro();
         App app = new App();
         Controlador control = new Controlador(login,registro,app);
     }
    
}
