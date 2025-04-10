package 基礎編02.確認テスト;
//数値の演算問題
public class Calc {
	
	public static double calculateAverage(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return (double)sum/numbers.length;
	}
	public static void main(String[] args) {
		int[] numbers = {10, 12, 22, 42, 24};
		double average = calculateAverage(numbers);
		System.out.println("配列内の数値の平均値: " + average);
	}
}
