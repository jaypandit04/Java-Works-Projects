public class AmazonBook
{
  public static void main(String[]args)
  {
    Book b1 = new Book("Building Java Program","9898175920","Jay",100);
    Book b2 = new Book("Complete refrence","6692883642","JP",40);
    System.out.println(b1.toString());//output: memory reference
    System.out.println(b2.toString());
    b1.toString();
    //b2.price= -1234; any class call constructor, 
    //it has access so intances make private
    //test the mutator methods
    b2.setPrice(30);
    b2.setTitle("jivan nu aadhar");
    b2.setisbn("9429075920");
    b2.setauthor("Niyati");
    
    System.out.println(b2);
    //list the titile of all books in my store
    //System.out.println(b1.title); error since title is a private field
    String title = b1.getTitle();
    System.out.println(title);
    System.out.println(b1.getTitle());
    
    if(b1.equals(b2))
    {
     System.out.println("Same");
    }
    else
    System.out.println("not same");
  }
}