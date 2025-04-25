package 基礎編02.確認テスト.Shopping;
//より詳細なデータ型問題
public class ShoppingCart {
	private Product[] items; 
	private int itemCount;
	
	public ShoppingCart() {
		items = new Product[10];
		itemCount = 0;
	}
	public void addItem(Product product) {
		if (itemCount < items.length) {
			items[itemCount] = product;
			itemCount++;
		} else {
			System.out.println("カートがいっぱいです。商品を追加できません。");
		}
	}
	public double getTotalPrice() {
		double total = 0;
		for (int i = 0; i < itemCount; i++) {
			total += items[i].getPrice();
		}
		return total;
	}
}
