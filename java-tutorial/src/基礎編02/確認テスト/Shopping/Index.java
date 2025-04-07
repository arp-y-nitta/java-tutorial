package 基礎編02.確認テスト.Shopping;
//より詳細なデータ型問題
public class Index {

	public static void main(String[] args) {
		Product itemA = new Product("商品A", 50.0);
		Product itemB = new Product("商品B", 30.0);
		Product itemC = new Product("商品C", 20.0);
		
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(itemA);
		cart.addItem(itemB);
		cart.addItem(itemC);
		
		double total = cart.getTotalPrice();
		System.out.println("ショッピングカートの合計金額: $" + total);
	}
}
