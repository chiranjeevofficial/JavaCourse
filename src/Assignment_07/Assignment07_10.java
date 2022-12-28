//10.	Define a class Book with member variables bookId, title, price and author. Provide setters and getters.
package Assignment_07;
class Book{
    int bookID;
    float price;
    String title;
    void setters(int BookID, float Price, String Title){
        bookID=BookID;
        title=Title;
        price=Price;
    }
    void getters(){
        System.out.println("BookID: "+bookID+" Title: "+title+" Price: "+price);
    }
}
public class Assignment07_10 {
    public static void main(String []args){
        Book b1=new Book();
        b1.setters(1201,789.50f,"Java");
        b1.getters();
    }
}
