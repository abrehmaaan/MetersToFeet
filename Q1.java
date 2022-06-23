import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		int meters;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for meter: ");
		meters = sc.nextInt();
		System.out.println(meters+" meters is "+meters*3.2786+" feet");
	}
}
