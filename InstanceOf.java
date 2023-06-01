class Animal { } 

class Mammal extends Animal
{
}



public class InstanceOf { 

      public static void main(String[] args) { 

               Mammal mobj = new Mammal();

               Animal aobj = new Animal();

   if (mobj instanceof Mammal) 
   {
	   System.out.println("mobj is instance of Mammal"); 
   }

    else
    	System.out.println("mobj is NOT instance of Mammal");
                       
    if (mobj instanceof Animal) 
    {
    	System.out.println("mobj is instance of Animal"); 
    }

    else
    	{
    	 System.out.println("mobj is NOT instance of Animal"); 
    	 }



   if (aobj instanceof Mammal) 
   {
	   System.out.println("mobj is instance of Animal"); 
   }

   else
        	  {
        	  System.out.println("mobj is NOT instance of Animal");
        	  }

    } 

}

