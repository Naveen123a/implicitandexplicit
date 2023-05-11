package thread;

public class threadsyn {
//class A extends Thread{
class A implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Hi");
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		}
}


//class B extends Thread{
class B implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Hello");
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}


		
//		A obj1=new A();
//		B obj2=new B();
//		
//		Runnable obj1=new A();
//		Runnable obj2=new B();
		
		//				System.out.println("Hi");
//				try {
//					Thread.sleep(5);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
		
		
		
//				System.out.println("Hello");
//				try {
//					Thread.sleep(5);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
	

}
