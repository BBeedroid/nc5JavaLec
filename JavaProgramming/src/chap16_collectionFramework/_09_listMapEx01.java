package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import chap06_class.car.Car;

public class _09_listMapEx01 {

	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		
		carList.add(new Car("현대", "제네시스", "흰색", 5000));
		carList.add(new Car("기아", "모하비", "흰색", 5000));
		carList.add(new Car("쉐보레", "카마로", "노란색", 5000));
		carList.add(new Car("벤츠", "E시리즈", "흰색", 6000));
		carList.add(new Car("BMW", "7시리즈", "파란색", 10000));
		
		//carList를 List<Map<String, Object>>로 변환
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		for(Car c : carList) {
			Map<String, Object> map = new HashMap<String, Object>();
			
			map.put("company", c.company);
			map.put("model", c.model);
			map.put("color", c.color);
			map.put("price", c.price);
			
			mapList.add(map);
		}
		
		for(int i = 0; i < mapList.size(); i++) {
			System.out.println(mapList.get(i));
		}
		
		
/*		List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> carMap1 = new HashMap<String, Object>();
		carMap1.put("company", "현대");
		carMap1.put("modle", "제네시스");
		carMap1.put("color", "흰색");
		carMap1.put("price", 5000);
		
		listMap.add(carMap1);
		
		Map<String, Object> carMap2 = new HashMap<String, Object>();
		carMap2.put("company", "기아");
		carMap2.put("modle", "모하비");
		carMap2.put("color", "흰색");
		carMap2.put("price", 5000);
		
		listMap.add(carMap2);
		
		Map<String, Object> carMap3 = new HashMap<String, Object>();
		carMap3.put("company", "쉐보레");
		carMap3.put("modle", "카마로");
		carMap3.put("color", "노란색");
		carMap3.put("price", 5000);
		
		listMap.add(carMap3);
		
		Map<String, Object> carMap4 = new HashMap<String, Object>();
		carMap4.put("company", "벤츠");
		carMap4.put("modle", "E시리즈");
		carMap4.put("color", "흰색");
		carMap4.put("price", 6000);
		
		listMap.add(carMap4);
		
		Map<String, Object> carMap5 = new HashMap<String, Object>();
		carMap5.put("company", "BMW");
		carMap5.put("modle", "7시리즈");
		carMap5.put("color", "파란색");
		carMap5.put("price", 10000);
		
		listMap.add(carMap5);		
		
		System.out.println(listMap);	*/
	}

}
