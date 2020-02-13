import java.util.Iterator;

public class TestObserver 
{
  public static void main(String args[])
  {
	System.out.println("------------start-----------------");
    Database database = new Database();
    Archiver archiver = new Archiver();
    Client client = new Client();
    Boss boss = new Boss();
    
    System.out.println("Objects created of Observers & database");
    
 
    database.printObservers();//This will print the whole subscribed classes
    System.out.println("------------printobservers-----------------");
    database.registerObserver(archiver);
    database.registerObserver(client);
    database.registerObserver(boss);
    database.printObservers();
    System.out.println("------------printobservers-----------------");
    
    database.editRecord("delete", "record 1");
    database.removeObserver(boss);
    database.printObservers();
    System.out.println("------------printobservers-----------------");  
    database.editRecord("delete", "record 2");
  }
}