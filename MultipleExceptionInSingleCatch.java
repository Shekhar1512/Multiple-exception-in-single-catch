package javaPrograms;

public class MultipleExceptionInSingleCatch {

	public static void main(String[] args) {
		
		try {
			
			int x=100/0;
			int a[] = new int [5];
			a[0]=10;
			
			System.out.println("Rest code");
			
			
		}
		
		catch(ArrayIndexOutOfBoundsException   | ArithmeticException e)
		{
			System.out.println("this is Exeption");
			
		}

	}

}
