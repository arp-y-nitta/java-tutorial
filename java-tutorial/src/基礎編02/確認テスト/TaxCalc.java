package 基礎編02.確認テスト;
// 変数問題
public class TaxCalc {
	public static void main(String[] args) {
		double price = 60.5;
		int quantity = 2;
		double taxRate = 0.1;
		
		double subTotal = price * quantity;
		double tax = subTotal * taxRate;
		double total = subTotal + tax;
		System.out.println("税抜き価格: $" + subTotal);
		System.out.println("税額: $" + tax);
		System.out.println("税込み価格: $" + total);
	}
}
