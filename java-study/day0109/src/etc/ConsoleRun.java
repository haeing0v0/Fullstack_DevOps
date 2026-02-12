package etc;

import java.io.Console;

public class ConsoleRun {
	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      
	      Console cons = System.console();
	      

	      if (cons != null) {
	         try {
	            System.out.println("name : ");
	            String name = cons.readLine();
	            System.out.println("name = " + name);
	            
	         } catch (Exception e) {
	            // TODO: handle exception
	            System.out.println("exception event : " + e.getMessage());
	         }
	      } else {
	         System.out.println("Console not use");
	      }
	   }
}