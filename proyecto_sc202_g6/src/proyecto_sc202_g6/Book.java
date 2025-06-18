/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_sc202_g6;

/**
 *
 * @author Andres
 */
public class Book {
   
    public String title;
    public String auth;
    public String isbn;
    public boolean isAvailable;

    public Book(String title, String auth, String isbn, boolean isAvailable) {
        this.title = title;
        this.auth = auth;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuth() {
        return auth;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Libro{\n"
                +"Título: " + title + "\n"
                + "Autor: " + auth + "\n"
                + "ISBN: " + isbn + "\n"
                + "Estado: " + isAvailable +"\n"
                + "}";
    }
    
}
