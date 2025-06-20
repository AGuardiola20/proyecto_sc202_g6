/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_sc202_g6;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Bookshelf {    
    private Book[] bookshelf = new Book[10];
    
    public void addBook(Book book, int pos){
        bookshelf[pos] = book;
    }
    
    public void getAllBooks(){
        String list = "Libros: \n";
        for(Book book : bookshelf){
            if(book != null){
                list += "- " + book + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, list);
    }
}
