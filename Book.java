public class Book
{
  //declare all the attributes of the object
  //instance variables
  //hide the instance variable from any class
  //information hiding
  private String title;
  private String isbn;
  private String author;
  private double price;
  //create a constructor for this class
  //1. no return type,2. the name of constructor is exact name as the class name
  //do not use the word static
  public Book()
  {
   
  }
  public Book(String s,String isb,String aut,double p)
  {
    title = s;
    isbn = isb;
    author = aut;
    price = p;
  }
  //toString method: returns a string representing the object
  public String toString()
  {
   String s = "";
   s = s + title+"\n";
   s = s + isbn+"\n";
   s = s + author+"\n";
   s = s + price+"\n";
   return s;
  }
  //updating the instance from a customer class we need to write methods
  //these methods are called mutators
  public void setPrice(double newPrice)
  {
   if(newPrice>0)
   price = newPrice;
  }
  public void setTitle(String newTitle)
  {
   title = newTitle;
  }
  public void setisbn(String newisbn)
  {
    isbn = newisbn;
  }
  public void setauthor(String newauthor)
  {
   author = newauthor;
  }
 //accessor/getter methods
 public String getTitle()
 {
   return title;
 }
 public boolean equals(Book b)
 {
   return this.isbn.equals(b.isbn);
 }
}
