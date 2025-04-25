package 基礎編03.写経問題;

public class Main2 {

	public static void main(String[] args) {
		String fruit = "apple";
		switch(fruit) {
		case "apple":
			System.out.println("It's a delicious apple!");
			break;
		
		case "banana":
			System.out.println("I love bananas!");
			break;
		
		case "orange":
			System.out.println("Oranges are refreshing!");
			break;
		
		default:
			System.out.println("Sorry, I'm not familiar with that fruit.");
			break;
		}
	}

}
