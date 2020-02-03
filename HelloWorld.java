import java.util.*;

public class HelloWorld{
    public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("ENTER YOR NAME\n");
		
		String name = in.nextLine();
		
        System.out.println("Hello " + name);
    }
}