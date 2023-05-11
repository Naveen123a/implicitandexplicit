package thread;
class Samplethread implements Runnable{
	public void run(){
		System.out.println("Thread is under running:");
		for(int i=0; i<=10; i++) {
			System.out.println("i :"  +i);
		}
	}
	
}
public class Threadrun{
	public static void main(String[] args) {
		Samplethread Threadobj=new Samplethread();
		Thread threads = new Thread(Threadobj);
		System.out.println("Thread is to start........");
		threads.start();
		
	}
}
    