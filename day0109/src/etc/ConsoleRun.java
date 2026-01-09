package etc;

import java.io.Console;

public class ConsoleRun {
	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      
	      Console cons = System.console();
	      

	      if (cons != null) {
	         try {
	            System.out.println("이름 : ");
	            String name = cons.readLine();
	            System.out.println("name = " + name);
	            
	         } catch (Exception e) {
	            // TODO: handle exception
	            System.out.println("예외 발생 : " + e.getMessage());
	         }
	      } else {
	         System.out.println("콘솔을 사용할수 없습니다.");
	      }
	   }
}