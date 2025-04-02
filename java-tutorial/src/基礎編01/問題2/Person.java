package 基礎編01.問題2;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void introduce() {
		System.out.println("名前:" + name);
		System.out.println("年齢:" + age);
	}
	public void main(String[] args) {
		if (args.length != 2) {
			System.out.println("年齢と名前を指定してください");
			return;
		}
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		
		Person person = new Person(name, age);
		person.introduce();
	}
}
