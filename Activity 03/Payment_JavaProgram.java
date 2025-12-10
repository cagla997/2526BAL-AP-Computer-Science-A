import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
		System.out.println("Enter the bill in TL:");
		int bill, tip, payment, total, change;
		int p200, p100, p50, p20, p10, p5, p1;
		bill = enter.nextInt();
		
		System.out.println("Enter your tip in TL:");
		tip = enter.nextInt();
		System.out.println("Enter the amount paid in TL:");
		payment = enter.nextInt();
		
		total = bill + tip;
		change = payment - total;
		if (change<0)
			System.out.println("Underpayment amount:" + change);
		else if (change ==0) 
			System.out.println("We would like to thank you for your payment and state that we will be happy to host you again");
		
		else {
			System.out.println("Changes:" + change);
			
			p200 = change/200;
			change -= p200*200;
			p100 = change/100;
			change -= p100*100;
			p50 = change/50;
			change -= p50*50;
			p20 = change/20;
			change -= p20*20;
			p10 = change/10;
			change -= p10*10;
			p5 = change/5;
			change -= p5*5;
			p1 = change;
			
			System.out.println("Minimum Amount of Payment:");
			System.out.println("200: " + p200);
			System.out.println("100: " + p100);
			System.out.println("50: " + p50);
			System.out.println("20: " + p20);
			System.out.println("10: " + p10);
			System.out.println("5: " + p5);
			System.out.println("1: " + p1);
			
		}
			
    }
}
