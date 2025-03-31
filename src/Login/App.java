/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Login;

import Conect.Conexion;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Conexion c = Conexion.getInstancia();
       c.conectar();
       c.desconectar();
       
       boolean rpta = c instanceof Conexion;
        System.out.println(rpta);

    }
    
}
