/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Author;
import entity.Book;

/**
 *
 * @author user
 */
public class App {
    public void run (){
        System.out.println("Hello");
        Book book = new Book();
        book.setBookName("Voina i mir");
        book.setReleaseyear(1828);
        Author[] authors = new Author[1];
        Author author = new Author();
        author.setFirstName("Lev");
        author.setLastname("Tolstoy");
        author.setBirthYear(1828);
        authors[0] = author;
        book.setAuthors(authors);
        System.out.printf("Создана книга: %s, автор: %s %s, год издания: %d%n",
                            book.getBookName(),
                            book.getAuthors()[0].getFirstName(),
                            book.getAuthors()[0].getLastname(),
                            book.getReleaseyear()
        );
    }
}
