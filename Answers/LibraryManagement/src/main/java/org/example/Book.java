package org.example;

public class Book {
    private static int firstId = 1;
    private static String Id;
    private static String Title;
    private static String Author;
    private static Boolean status;
    private static String Description;

    public Book(String Title, String Author, String Description){
        this.Id = idgenerator();
        this.Title = Title;
        this.Author = Author;
        this.status = true;
        this.Description = Description;

    }

    public void setStatus(boolean status){
        this.status = status;
    }

    static String idgenerator(){
        String ID = "book number" + firstId;
        firstId+=firstId;
        return(ID);
    }
    public static String getId() {
        return Id;
    }

    public static String getTitle() {
        return Title;
    }

    public static String getAuthor() {
        return Author;
    }

    public static boolean isAvailable() {
        return status;
    }

    public static String getDescription(){
        return Description;
    }
}