import static java.lang.System.out;
class ThreadA implements Runnable{
	public void run(){
		for (int i=1; i<= 5; i++){
			out.println("Thread A with i = "+ (-1*i));
		}
		out.println("Exit of the Thread A ....");
	}
}
class ThreadM implements Runnable {
	public void run(){
		for (int j=1; j<= 6; j++){
			out.println("Thread M with j = " +(2*j));
		}
		out.println("Exit of the Thread M ....");
	}
}
class ThreadST implements Runnable {
	public void run(){
		for (int k = 1; k<= 6; k++){
			out.println("Thread M with k = "+(2*k+2));
		}
		out.println("current Thread of ST is "+ CurrentThread());
	}
}
class RunnableThread {
	public static void main(String[] args){
		ThreadA ob = new ThreadA(); // creating a object of thread class 
		Thread ts1 = new Thread(ob);// invoking thread built in class with class created object references 

		ThreadM ob1 = new ThreadM();
		Thread ts2 = new Thread(ob1);

		ThreadST ob2 = new ThreadST();
		Thread ts3 = new Thread(ob2);
		
		/* insted of this type of creating a object than calling thread with that class object we can do this 
		Thread ts3 = Thread(new ThreadST());*/
		
		// invoking run method with created references thread class by start() 
		ts1.start(); ts2.start(); ts3.start();
		out.println(".... Multithreading is over ");
		
	}
}