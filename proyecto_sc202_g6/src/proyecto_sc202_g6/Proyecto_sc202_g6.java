/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_sc202_g6;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Proyecto_sc202_g6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO: Se debe de validar que código ISBN empiece por '978' o '979')
        
        Book book = new Book("Harry Potter", "J.K Rowling", "000", true);        
        JOptionPane.showMessageDialog(null, book.toString());
    }
    
}
