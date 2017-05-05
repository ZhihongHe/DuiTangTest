import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("/answer/?l=");
		String string = scanner.nextLine();
		String[] strings = string.split(",");
		if (strings.length != 4) {
			throw new Exception("Error input!");
		}
		int[] input = new int[4];
		int[] output = new int[4];
		for(int i = 0;i<4;i++) {
			input[i] = Integer.parseInt(strings[i]);
		}
		for(int i = 0;i<4;i++) {
			int temp = input[i];
			input[i] = 1;
			output[i] = input[0]*input[1]*input[2]*input[3];
			input[i] = temp;
		}
		for(int i = 0;i<3;i++) {
			System.out.print(output[i] + ",");
		}
		System.out.println(output[3]);

	}

}
