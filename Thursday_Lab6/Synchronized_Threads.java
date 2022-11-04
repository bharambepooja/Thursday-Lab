/*
Q2. Write a Java program using Synchronized Threads, which demonstrates Producer Consumer concept. 
    Producer Consumer problem: The producer-consumer problem is the classical concurrency of a multi process synchronization problem. 
    It is also known as bound-buffer problem. The problem describes two processes, the producer and the consumer, 
    who share a common, fixed-size buffer used as a queue. The producer generates a piece of data, put it into the buffer and starts again.
*/


package Thread;



public class Consumer_class extends Thread
{
	Problem_class Shop;	                 //variables declared used by class name   
    int num,value = 0,i;               
   
    //create the construtor
    public Consumer_class(Problem_class c, int number)
    {
          Shop = c;
          this.num = number;             //use this keyword for use the same class variable
    }
    public void run()                    //create run method
    {
          for ( i = 0; i < 10; i++)
          {
                System.out.println("Consumed value " + this.num+ " got: " + value);
          }
    }
}





package Thread;

public class Problem_class
{
	int materials;         
    boolean available = false;
    // synchronized method to get a true or false
    public synchronized int get()                        
    {
    	// for checking false condition
          while (available == false)                      
          {
                try
                {
                      wait();                             // if false problem will go to wait
                }
                catch (InterruptedException ie)           
                {
                }
          }
          available = false;                             // material not available
          notifyAll();
          return materials;                               //return material to the method
    }


    // synchronized method for true conditions
    public synchronized void put(int value)               
    {
    	  // for checking true condition
          while (available == true)                     
          {
                try
                {
                      wait(); 
                }
                catch (InterruptedException ie) 
                {
                      ie.printStackTrace();
                }
          }
          materials = value;                               // material available in a value
          available = true;                                 // material available here
          notifyAll();
    }

}



package Thread;

public class Producer_Class extends Thread
{
	//use the thread class property
	Problem_class  Shop;   
  	int number;          

 public Producer_Class(Problem_class c, int number)           //creating parameterized constructor
 {
       Shop = c;
       this.number = number;	                               //use this keyword for use the same class variable
 }
//create run method
 public void run()				
 {
       for (int i = 0; i < 10; i++)  
       {
             
             System.out.println("Produced value " + this.number+ " put: " + i);
           
             try						
             {
            	
                   sleep((int)(Math.random() * 100));	//sleep method of thread
             }
           
             catch (InterruptedException ie)		
             {
                 System.out.println(ie);			
             }
       }
 }
}




package Thread;

public class Main
{

	public static void main(String[] args)
	{
		Problem_class pc = new Problem_class(); 
		Producer_Class p1 = new Producer_Class(pc, 1);
		Consumer_class c1 = new Consumer_class(pc, 2);  
	      c1.start();                                  
	      p1.start();  
	}

}
