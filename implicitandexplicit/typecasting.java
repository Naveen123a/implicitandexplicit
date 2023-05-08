package implicitandexplicit;

public class typecasting {

		public static void main(String[] args) {
			
			//implicit conversion
			System.out.println("Implicit Type Casting");
			char a='N';
			System.out.println("Value of a: "+a);
			
			int i=a;
			System.out.println("Value of b: "+i);
			
			float f=a;
			System.out.println("Value of c: "+f);
			
			long l=a;
			System.out.println("Value of d: "+l);
			
			double d=a;
			System.out.println("Value of e: "+d);
			
					
			System.out.println("\n");
			
			System.out.println("Explicit Type Casting");
			//explicit conversion
			
			double x=45.5;
			int y=(int)x;
			System.out.println("Value of x: "+x);
			System.out.println("Value of y: "+y);
			
		}
	}

