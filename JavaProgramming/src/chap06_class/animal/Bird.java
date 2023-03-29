package chap06_class.animal;

public class Bird {
	//날개(int wing), 색깔(String color), 이름(String name), 공간(String space), 크기(int size), 먹이(String food)
	
	//날다(void fly): 독수리(name)는 날개(wing)를 이용하여 하늘(space)을 납니다.
	//운다(void cry): 독수리는 나무에 앉아 웁니다.
	//걷는다(void walk): 독수리는 땅을 걷습니다.
	//먹이를 먹는다(void eat): 독수리는 고기(food)를 먹습니다.
	
	public int wing;
	public String color;
	public String name;
	public String space1;
	public String space2;
	public String space3; //배열로 처리 가능? public String[] space;
	public int size;
	public String food;
	
	public Bird() {
		System.out.println("기본 생성자");
	}
	
	public Bird(String name, String food) {
		this.name = name;
		this.food = food;
	}
	
	public void birdInfo() {
		System.out.println(name + " " + food);
	}
	
	
	public void fly(int num, int num2) { //매개변수 정의할 때 자료형 타입 기재, 사용할 때에는 price 등으로 사용)
		for(int i = 0; i < num; i++) {
		System.out.println(color + " " + name + "은/는 " + wing + "장의 날개를 이용하여 "
											+ space1 + "을/를 납니다.");
		}
	}
	
	public void cry() {
		System.out.println(color + " " + name + "은/는 " + space2 + "에 앉아 웁니다.");
	}
	
	public void walk() {
		System.out.println(color + " " + name + "은/는 " + space3 + "을 걷습니다.");
	}
	
	public void eat() {
		System.out.println(color + " " + name + "은/는 " + food + "을/를 먹습니다.");
	}
	
}
