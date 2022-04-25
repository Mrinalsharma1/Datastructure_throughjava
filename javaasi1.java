import java.util.*;

class fruit

{
    String name, taste, size;
  public void eat ( ) // overridden method.

 {

       Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name of fruit");
        name = obj.nextLine();
        System.out.println("enter the teast of fruit");
        taste = obj.nextLine();
        System.out.println("name of the fruit is : "+name);
        System.out.println("taste of the fruit is : "+taste);

    }

}

class apple extends fruit

{

  public void eat () // overriding method
  {
        System.out.println("Name of the fruit is Apple");
        System.out.println("Taste aaof the fruit is sweet");

    }

}

class orange extends fruit

{

   public void eat ( ) // overriding method

  {

    System.out.println("Name of the fruit is Orange");
    System.out.println("Taste aaof the fruit is sour");

    }

}

public class javaasi1

{

    public static void main(String[] args)

    {
        fruit obj=new fruit();
        obj.eat();
        
        apple A = new apple();

        A.eat();

        orange O = new orange();

        O.eat();

    }

}
