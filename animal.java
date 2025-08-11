public class Book { String title; String author;
int pages; double price;
void displayBookInfo() { System.out.println("Title: " + title); System.out.println("Author: " + author); System.out.println("Pages: " + pages); System.out.println("Price: ₹" + price);
}
public static void main(String[] args) { Book book1 = new Book();


book1.title = "Atomic Habits"; book1.author = "James Clear"; book1.pages = 320;
book1.price = 499.00; book1.displayBookInfo();
}
}
 
