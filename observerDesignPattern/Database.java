import java.util.*;

public class Database implements Subject 
{
  private Vector<Observer> observers;//making an array of Observer class with name of observers
  private String operation;
  private String record;
  
  public void printObservers()//this will print the child of the Observer class 
  {
  		for (Observer observer : observers) {
		System.out.println(observer);
	}
  } 
  
  public Database() 
  {
    observers = new Vector<Observer>();//proper declaration of the opservers array
  }
  							//	Receving object with data type of Observer 
  public void registerObserver(Observer o) 
  {
    observers.add(o);
  }
  
  public void removeObserver(Observer o) 
  {
    observers.remove(o);
  }
  
  public void notifyObservers() 
  {
	  for (int loopIndex = 0; loopIndex < observers.size(); loopIndex++) {
	        Observer observer = (Observer)observers.get(loopIndex);
	        //This will send operation and record to update methode
	        observer.update(operation, record);
	      }
  }
  
  public void editRecord(String operation, String record) 
  {
    this.operation = operation;
    this.record = record;
    notifyObservers();
   
  }
}