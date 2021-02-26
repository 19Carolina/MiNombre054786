/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minombre054786;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class MiNombre054786 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Como te llamas? ");
        String nombre = lector.nextLine();
        System.out.println("Te llamas " + nombre );
    }
    
}
