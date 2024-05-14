import java.io.*;
import static java.lang.System.out;
class ThreadA extends Thread { 
// Extending the pre witten Thread class and JVM will decide which will run first at least one time first is run and by Round Robin schedule is switches the task
	public void run(){ // overriding run of class Thread
		for (int i = 1; i<=5; i++){
			out.println("From Thread A with i = " + i*i);
		}
		out.println("Existing from Thread A .. ");
	}	
}
class ThreadB extends Thread{
	public void run(){
		for (int j= 1; j<= 5; j++){
			out.println("From Thread B with j = " + -2*j);
		}
		out.println("Existing from Thread B .. ");
	}
}
class ThreadC extends Thread{
	public void run(){
		for (int k = 1; k<= 5; k++){
			out.println("From Thread C with k = " + (2*k -1));
		}
		out.println("Existing from Thread C .. ");
	}
}
class Thread_testing{
	public static void main(String[] args){
		ThreadA a = new ThreadA(); // for creating a object of ThreadA class
		ThreadB b = new ThreadB();
		ThreadC c = new ThreadC();
		a.start();
		b.start();
		c.start();
		out.println(".... Multitasking is over running ");
	}
}