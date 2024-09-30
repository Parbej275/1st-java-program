package com.parbej;

public class Book
{
    String title;
    String author;

    Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    void displayinfo()
{
    System.out.println("title:"+ title);
    System.out.println("author:"+ author);

}

    public static void main(String[] args)
    {
        Book myBook=new Book("To kill ayush","Parbej ak");
        myBook.displayinfo();
    }
}
