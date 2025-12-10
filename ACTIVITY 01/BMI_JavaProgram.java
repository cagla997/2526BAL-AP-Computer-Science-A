import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
		System.out.println("Enter your body mass in kilograms:");
		double mass, height;
		mass = enter.nextInt();
		
		System.out.println("Enter your height in centimeters:");
		height = enter.nextInt();
		
		height /= 100;
		double bmi;
		bmi = mass / (height * height);
		if (bmi<18.5)
			System.out.println("Thin");
		else if (bmi<25)
			System.out.println("Healthy");
		else if (bmi<30)
			System.out.println("Fat");
		else if (bmi<40)
			System.out.println("Obese");
		else
			System.out.println("Morbidly Obese");
    }
}
