package proj2;
import java.util.ArrayList; 

class Book {
  private String title;
  private String author;
  private double price;
  
  public Book(String title, String author, double price) {
    this.title = title;
    this.author = author; 
    this.price = price;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getAuthor() {
    return author;
  }
  
  public double getPrice() {
    return price;
  }
}

class User {

  private String name;
  private String email;
  private String address;
  
  public User(String name, String email, String address) {
    this.name = name;
    this.email = email;
    this.address = address;
  }
  
  public String getName() {
    return name; 
  }
  
  public String getEmail() {
    return email;
  }
  
  public String getAddress() {
    return address;
  }
}

class BookStore {

  private ArrayList<Book> catalog;
  ArrayList<User> users;

  public BookStore() {
    catalog = new ArrayList<>();
    users = new ArrayList<>();
  }

  public void addBook(Book b) {
    catalog.add(b);
  }
  
  public void addUser(User u) {
    users.add(u);
  }

  public Book searchByTitle(String title) {
    for(Book b : catalog) {
      if(b.getTitle().equals(title)) {
        return b;
      }
    }
    return null;
  }

  public void purchase(User buyer, Book book) {
    // Process transaction
    System.out.println(buyer.getName() + " purchased " + book.getTitle());
  }
  
}

public class OnlineBookStore {
  
  public static void main(String[] args) {
    BookStore store = new BookStore();
    
    // Add some books 
    store.addBook(new Book("The Da Vinci Code", "Dan Brown", 19.95));
    store.addBook(new Book("Le Petit Prince", "Antoine de Saint-Exupéry", 10.99));
    
    // Add a user
    store.addUser(new User("John Doe", "john@doe.com", "123 Main St"));
    
    // Search for a book
    Book book = store.searchByTitle("Le Petit Prince");
    
    // Purchase book
    User user = store.users.get(0); 
    store.purchase(user, book);
  }

}
