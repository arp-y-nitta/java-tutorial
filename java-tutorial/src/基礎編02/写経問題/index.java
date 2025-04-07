package 基礎編02.写経問題;

public class index {
	public static void main(String[] args) {
		String message = "Hello";
		message = message + "World";
		
		String[] colors = {"Red", "Greenm", "Blue"};
		
		System.out.println("変数messageの値は:" + message);
		System.out.println("配列の要素は:");
		for (String color : colors) {
			System.out.println(color);
		}
	}
}