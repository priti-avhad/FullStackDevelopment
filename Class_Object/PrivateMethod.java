class Parent 
{
    private void display() 
	{
        System.out.println("This is a private method in the Parent class.");
    }
}

class Child extends Parent 
{
  
    public void display() 
	{
        System.out.println("Child display method");
    }
}

public class PrivateMethod 
{
    public static void main(String[] args) 
	{ 

        Child c = new Child();
        c.display(); 
    }
}
