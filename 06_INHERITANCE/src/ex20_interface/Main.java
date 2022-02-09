package ex20_interface;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog("백구");
		Cat cat = new Cat("지똥이");
		Snake snake = new Snake("헤비");
		
		Person person = new Person();
		person.feed(dog, "강아지먹이");
		person.feed(cat, "고양이먹이");
		person.feed(snake, "뱀먹이");
		
		person.walk(dog); // 백구와 산책하기
		person.walk(cat);
		
	}

}
