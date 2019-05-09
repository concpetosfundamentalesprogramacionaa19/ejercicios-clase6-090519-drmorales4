/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author drmorales4
 */
// ejercicio en clase:
// desarrollar una aplicacion que me permita ingresar placas de carros, se asume que las placas ingresadas pertenecen a la region cosa del escuador,
// En base a la placa nuestro programa determinara y presentara la placa con la provincia a la que pertenece.
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String placa;
        
        System.out.println("Ingrese la placa de su vehiculo: ");
        placa = entrada.nextLine();

        char valor = placa.charAt(0);
                
        switch(valor){
            case 'O':
                System.out.printf("La primera letra de su placa es: %s por que "
                        + "pertenece a la provicia de: %s (%s)\n", 
                        valor, placa, "El oro");
                break;
            
            case 'E':
                System.out.printf("La primera letra de su placa es: %s por que "
                        + "pertenece a la provicia de: %s (%s)\n", 
                        valor, placa, "Esmeraldas");
                break;
                
            case 'M':
                System.out.printf("La primera letra de su placa es: %s por que "
                        + "pertenece a la provicia de: %s (%s)\n", 
                        valor, placa, "Manabi");
                break; 
                
            case 'R':
                System.out.printf("La primera letra de su placa es: %s por que "
                        + "pertenece a la provicia de: %s (%s)\n", 
                        valor, "Los Rios");
                break;
                
            case 'G':
                System.out.printf("La primera letra de su placa es: %s por que "
                        + "pertenece a la provicia de: %s (%s)\n", 
                        valor, placa, "Guayas");
                break;
            
            case 'Y':
                System.out.printf("La primera letra de su placa es: %s por que "
                        + "pertenece a la provicia de: %s (%s)\n", 
                        valor, placa, "Santa Elena");
                break;  
            
            case 'J':
                System.out.printf("La primera letra de su placa es: %s por que "
                        + "pertenece a la provicia de: %s (%s)\n", 
                        valor, placa, "Santo Domingo");
                break;  
                
            default:
                System.out.println("No es de la region costa de Ecuador");
                
        }
        
    }
}
