package 基礎編03.確認問題;
//繰り返し文と配列問題
public class Main {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50, 60};
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("配列内の数値の合計: " + sum);
	}
}
