import static java.lang.System.out;
import java.io.*;
class ThreadA extends Thread{
	public void run(){
		try {
			out.println("First thread Started ");
			Thread.sleep(1000);
			
			out.println("First Thread end ");
		}
		catch(Exception e){}
		out.println("Exit of the Thread A ....");
	}
}
class ThreadM extends Thread {
	public void run(){
		try{
			out.println("Second Thread starts ");
			out.println("Second Thread is suspendend itself ");
			suspend();
			out.println("Second Thread is start over again ");
		}catch(Exception e){}
		out.println("Exit of the Thread M ....");
	}
}
class ThreadST extends Thread {
	public void run(){
		try{
			out.println("Third Thread start execution starts ");
			out.println("Third Thread stop execution after this ");
			//stop();
		}catch(Exception e){}
		
	}
}
class SThread_sus_res {
	public static void main(String[] args){
		ThreadA ts1 = new ThreadA(); // creating a object of thread class 

		ThreadM ts2 = new ThreadM();
		
		ThreadST ts3 = new ThreadST();
		
		
		// invoking run method with created references thread class by start() 
		ts1.start();
		ts2.start(); 
		ts3.start();
		//ts2.suspend();
		out.println("Resume the second thread ");
		ts2.resume();
		
		out.println(".... Multithreading is over ");
		
	}
}