package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class _01_arrayList {

	public static void main(String[] args) {
		//타입을 지정하지 않으면 자동적으로 Object가 지정된다
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		//데이터 추가(add)
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(6);
		list1.add(5);
		list1.add(4);
		
		//subList: 지정한 인덱스 사이의 데이터를 잘라온다
		list2 = new ArrayList(list1.subList(2, 5));
		
		//print()의 매개변수로 객체를 넣으면 자동으로 toString() 메소드가 실행된다
		System.out.println(list1); // .toString()이 생략되어 있음
		System.out.println(list2);
		
		System.out.println("---------------------------");
		
		//정렬
		Collections.sort(list1);
		Collections.sort(list2);
		
		//포함여부 확인
		if(list1.containsAll(list2))
			System.out.println("list1이 list2를 포함합니다.");
		else
			System.out.println("list1이 list2를 포함하지 않습니다.");
		
		System.out.println("---------------------------");
		
		//list2 데이터 추가
		list2.add("collection");
		list2.add("framework");
		System.out.println(list2);
		
		list2.set(3, "ArrayList");
		System.out.println(list2);
		
		list2.set(3, "List");
		System.out.println(list2);
		
		System.out.println("---------------------------");
		
		//list1에 list2의 데이터만 남기고 나머지는 삭제
		list1.retainAll(list2);
		System.out.println(list1);
		
		//ArrayList의 복제
		
		ArrayList list3 = (ArrayList)list2.clone(); //형 변환 필수
		
		System.out.println(list2 == list3);
		System.out.println(list2.equals(list3));
		
		System.out.println("---------------------------");
		
		ArrayList list4 = new ArrayList();
		
		list4.add(10);
		
		//capacity를 확인하는 방법은 없음
		System.out.println(list4.size());
		//System.out.println(list4.toArray().);
		
		
		list4.trimToSize();
		
		String[] strArr = new String[list2.size()];
		
		//Type을 지정하지 않았을 때의 문제점: 형변환 시 castException이 발생할 수 있기 때문에
		//Type을 지정해서 공통된 타입의 데이터만 다룰 수 있도록 한다 
		for(int i = 0; i < list2.size(); i++) {
			String str = (String)list2.get(i);
			strArr[i] = str;
		}
	}

}
