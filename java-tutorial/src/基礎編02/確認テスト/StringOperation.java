package 基礎編02.確認テスト;
//文字列の操作問題
public class StringOperation {
	public static void reverseString(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		StringBuilder reversedString = stringBuilder.reverse();
		System.out.println("元の文字列:" + str);
		System.out.println("逆順の文字列:" + reversedString);
	}
	public static void main(String[] args) {
		String message = "Hello World!";
		reverseString(message);
	}
}
