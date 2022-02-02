import java.util.*;
import java.util.Scanner;

public class Time2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Time2 n = new Time2(23,58);
		
		System.out.println("toString() = "+n.toString());
		System.out.println("toUniversalString() = "+n.toUniversalString());
		
		System.out.println();
		
		n.incrementHour(1);
		System.out.println("toString() = "+n.toString());
		System.out.println("toUniversalString() = "+n.toUniversalString());
	}
	
}




