package in.naresh.ganesh.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MessageRunner implements CommandLineRunner {
   public static void printMessage(String msg) {
	   System.out.println(msg);
   }
	@Override
	public void run(String... args) throws Exception {
		System.out.println("WELCOME TO SPRINGBOOT APP");
		int a=5;
		System.out.println(a);
		printMessage("jessie");
	}

}
