
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello" + "world");
		
		Exercise_2.helloWorldEx();
		Arrays.ranMessage();
		
		//when methods aren't static, the Object MUST be instanciated 
		Cat cat = new Cat();
		
		cat.meow();
		cat.scratch();
	}
}
