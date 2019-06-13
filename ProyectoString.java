/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectostring;

/**
 *
 * @author Admin
 */
public class ProyectoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombres=EntradaSalida.pedirNombres();
       String[] lista_nombres=nombres.split(",");
       for(String a: lista_nombres)
       {
           int n=a.length();
           boolean vocales=verificarTieneVocales(a);
           if (vocales==true)
           {
               System.out.println(a+" tiene "+n+" caracteres y TIENE VOCALES");
           }
           else
           {
                System.out.println(a+" tiene "+n+" caracteres y NO TIENE VOCALES");
           }
           
       }
    }

    private static boolean verificarTieneVocales(String nombre) {
        char[] vocales={'a', 'e', 'i', 'o', 'u'};
        boolean tiene_vocales=false;
        for(char letra: vocales)
        {   
            String nombre_minusculas=nombre.toLowerCase();
            int n=nombre_minusculas.indexOf(letra);
            if(n>=0){return true;}
        }
        
        return tiene_vocales;
    }
    
}
