import java.util.Scanner;

public class Source {
	// Methods
	public static float calculateKM100() {
		Scanner input = new Scanner(System.in);
		System.out.print("�������� ����� ��������� ��� ��������: ");
		float KMtraveled = input.nextFloat();
		System.out.print("�������� ����� ����� ��� �����������: ");
		float LitersLost = input.nextFloat();
		input.close();
		System.out.println("������ ������ � " + String.format("%.2f", (LitersLost / (KMtraveled / (float) 100)))
				+ " ����� �� 100 ��.");
		return (LitersLost / (KMtraveled / (float) 100));
	}

	public static void main(String[] args) {
		float litersOn100 = 0;
		Scanner ask = new Scanner(System.in);
		System.out.println("������ �� ����� ����� �� ��� ����� ������ ��? [Y/N]");
		char YesNo = ask.next().charAt(0);
		if (YesNo == 'Y' || YesNo == 'y') {
			System.out.print("�������� ����� ����� �� ��� ����� ������ ��: ");
			litersOn100 = ask.nextFloat();
		}
		if (YesNo == 'N' || YesNo == 'n')
			litersOn100 = calculateKM100();
		System.out.print("�������� ������������ �� ����������: ");
		float distance = ask.nextFloat();
		System.out.print("�������� ������ �� ��������: ");
		float price = ask.nextFloat();
		System.out.println("����������: " + String.format("%.2f", distance) + " ��.");
		System.out.println("���� �� ��������: " + String.format("%.2f", price) + " ��.");
		System.out.println("������ ������: " + String.format("%.2f", litersOn100) + "/100 ��.");
		System.out.println(
				"������� �� " + String.format("%.2f", ((distance / (float) 100) * litersOn100)) + " ����� ������.");
		System.out.println("������ �� ���������� �� � "
				+ String.format("%.2f", (((distance / (float) 100) * litersOn100) * price)) + " ����.");
		ask.close();
	}

}
