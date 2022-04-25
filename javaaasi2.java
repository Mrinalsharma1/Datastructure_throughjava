 
import java.util.Scanner;

public class javaaasi2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 2; i++) {
			String name = "";
			int subA = 0;
			int subB = 0;
			int subC = 0;
			
			try {				
				name = sc.nextLine();
				
				if (sc.hasNextInt())
					subA = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subB = sc.nextInt();
				else
					throw new NumberFormatException();
				
				if (sc.hasNextInt())
					subC = sc.nextInt();
				else
					throw new NumberFormatException();
				

                if (subA < 0){  
                    throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
                }
                if (subA > 100){  
                    throw new ArrayIndexOutOfBoundsException("\nNumber is Greater, More Than 100");  
                }  

			System.out.println("Name: " + name);
			System.out.println("Marks of subject A: " + subA);
			System.out.println("Marks of subject B: " + subB);
			System.out.println("Marks of subject C: " + subC);
		}
        catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
		
		// sc.close();

	 }
    }
}