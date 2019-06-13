/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectostring;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
class EntradaSalida {
    static String pedirNombres()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Escriba nombres separados por comas");  
      String texto=sc.nextLine();
      return texto;
      
    }
    
    
}
