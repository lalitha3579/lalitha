package JavaBasics;

public class NestedIfExample {

	public static void main(String[] args) {
		
		int i=50;
		int j=40;
		int k=70;
		
		if(i>j)
		{
		  System.out.println("Testing");
		  if(j==k)
		  {
			  System.out.println("Terminate the program");  
		  }
		}
	}
}
