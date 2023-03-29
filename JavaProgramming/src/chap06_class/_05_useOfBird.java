package chap06_class;

import chap06_class.animal.Bird;

public class _05_useOfBird {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		
		bird.wing = 2;
		bird.color = "갈색";
		bird.name = "독수리";
		bird.space1 = "하늘";
		bird.space2 = "나무";
		bird.space3 = "땅";
		bird.size = 3;
		bird.food = "고기";
		
		/*bird.fly(2, 2);
		bird.cry();
		bird.walk();
		bird.eat();
		
		System.out.println();
		
		Bird bird2 = new Bird();
		
		bird2.color = "노란색";
		bird2.name = "참새";
		bird2.food = "곡물";
		bird2.space1 = "하늘";
		bird2.wing = 2;
		
		bird2.fly(5, 1);*/
		
		Bird sparrow = new Bird("참새", "곡물");
		Bird eagle = new Bird("독수리", "육류");
		Bird chiken = new Bird("닭", "잡식");
				
		sparrow.birdInfo();
		eagle.birdInfo();
		chiken.birdInfo();

	}

}
