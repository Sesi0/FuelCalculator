import java.util.Scanner;

public class Source {
	// Methods
	public static float calculateKM100() {
		Scanner input = new Scanner(System.in);
		System.out.print("Въведете колко километра сте изминали: ");
		float KMtraveled = input.nextFloat();
		System.out.print("Въведете колко литра сте изразходили: ");
		float LitersLost = input.nextFloat();
		input.close();
		System.out.println("Вашият разход е " + String.format("%.2f", (LitersLost / (KMtraveled / (float) 100)))
				+ " литра на 100 км.");
		return (LitersLost / (KMtraveled / (float) 100));
	}

	public static void main(String[] args) {
		float litersOn100 = 0;
		Scanner ask = new Scanner(System.in);
		System.out.println("Знаете ли колко литра на сто харчи колата Ви? [Y/N]");
		char YesNo = ask.next().charAt(0);
		if (YesNo == 'Y' || YesNo == 'y') {
			System.out.print("Въведете колко литра на сто харчи колата Ви: ");
			litersOn100 = ask.nextFloat();
		}
		if (YesNo == 'N' || YesNo == 'n')
			litersOn100 = calculateKM100();
		System.out.print("Въведете разстоянието на пътуването: ");
		float distance = ask.nextFloat();
		System.out.print("Въведете цената на горивото: ");
		float price = ask.nextFloat();
		System.out.println("Разстояние: " + String.format("%.2f", distance) + " км.");
		System.out.println("Цена на горивото: " + String.format("%.2f", price) + " лв.");
		System.out.println("Среден разход: " + String.format("%.2f", litersOn100) + "/100 км.");
		System.out.println(
				"Трябват Ви " + String.format("%.2f", ((distance / (float) 100) * litersOn100)) + " литра гориво.");
		System.out.println("Цената на пътуването Ви е "
				+ String.format("%.2f", (((distance / (float) 100) * litersOn100) * price)) + " лева.");
		ask.close();
	}

}
