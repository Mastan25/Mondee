import java.util.*;
public class Animal 
{
void drink()
   {
	System.out.println("drink Water");
	}
}
class Dog extends Animal{
void walk() 
    { 
	System.out.println("walk on Table");
	}
}
class BabyCat extends Dog{
   void eat() 
{
	System.out.println("Eat Chiken");
	}
}
class TestInheritance2
{
public static void main(String args[]) 
{
BabyCat c=new BabyCat();
c.drink();
c.walk();
c.eat();
}
} 