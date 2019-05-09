/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author drmorales4
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // TODO code application logic here
        String mensajeFinal = "";
        String nombre = "David Ricardo";
        String apellido = "Morales Quezada";
        String profesion = "Estudiante";
        int contador = 1;

/*        
        // ciclo repetitivo
        while (contador < 5){
            System.out.printf("Persona %d: %s %s - %s\n", contador, nombre, 
                    apellido, profesion);
            contador = contador + 1; // para que el contador se incremente
        }
*/
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, 
                "\nInforme de la cuidad de Loja");
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, ""
                + "Listado de Personas");
        while (contador < 5){
            
            System.out.printf("Ingrese sus nombres %d: \n", contador);
            nombre = entrada.nextLine();
            System.out.println("Ingrese sus Apellidos: ");
            apellido = entrada.nextLine();
            System.out.println("Ingrese su Profesion: ");
            profesion = entrada.nextLine();
            
            mensajeFinal = String.format("%sPersona %d: %s %s - %s\n", 
                    mensajeFinal, contador, nombre, apellido, profesion);
            
            contador = contador + 1; // para que el contador se incremente
            
        }
        System.out.printf("%s", mensajeFinal);
    }
    
}
