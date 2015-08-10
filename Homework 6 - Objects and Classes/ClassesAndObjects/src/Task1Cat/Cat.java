package Task1Cat;

public class Cat {

	protected String name;
	protected int age;

	public Cat(String name, int age) { // конструктор
		super();
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sayMiau() {

		System.out.println("Hi, my name is " + this.name + " and I am " + this.age + " years old.");

	}
}