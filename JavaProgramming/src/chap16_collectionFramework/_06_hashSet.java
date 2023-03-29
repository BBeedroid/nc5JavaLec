package chap16_collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _06_hashSet {

	public static void main(String[] args) {
		Set<String> strSet = new HashSet<String>(); // 인터페이스 객체화 불가능
		
		strSet.add("Java");
		strSet.add("JDBC");
		strSet.add("Javascript");
		strSet.add("Html/Css");
		
		//중복값 저장
		strSet.add("JDBC");
		strSet.add("Java");
		strSet.add("React.js");
		
		System.out.println("strSet의 크기: " + strSet.size());
		
		int idx = 0;
		Iterator<String> it = strSet.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(idx++ + ", " + str);
			if(str.equals("Html/Css"))
				System.out.println(idx++ + ", " + str);
		}
		
		strSet.remove("JDBC");
		System.out.println("strSet의 크기: " + strSet.size());
		
		strSet.clear();
		if(strSet.isEmpty())
			System.out.println("strSet은 비워져 있습니다.");
		else
			System.out.println("strSet은 비워져 있지 않습니다.");
	}

}
