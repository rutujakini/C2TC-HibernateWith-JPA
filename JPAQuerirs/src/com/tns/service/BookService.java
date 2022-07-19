package com.tns.service;

import java.util.List;

import com.tns.entity.Book;

public interface BookService {

	public abstract Book getBookById(int id);

	public abstract List<Book> getBookByTitle(String title);

	public abstract Long getBookCount();

	public abstract List<Book> getAuthorBooks(String author);

	public abstract List<Book> getAllBooks();

	public abstract List<Book> getBooksInPriceRange(double low, double high);
}







//Create database demo;
//use demo;
//CREATE TABLE books (id  INT NOT NULL, 
//title VARCHAR(100), 
//author VARCHAR(50), 
//price int(6),
//PRIMARY KEY (id));
//select * from books;
//
//insert into books values(5,'Java Closures and Lambda','Robert Fischer',460);
//
//insert into books values(6,'Pro Java 8 Programming','Brett Spell',600);
//
//insert into books values(4,'Java for Android, Second Edition','Budi Kurniawan',680);
//
//insert into books values(1,'Java EE 7: The Big Picture','Danny Coward',3040);
//
//insert into books values(2,'Java: The Complete Reference, Ninth Edition','Herbert Schildt',360);
//
//insert into books values(3,'Beginning Java with WebSphere','Robert W. Janson',630);