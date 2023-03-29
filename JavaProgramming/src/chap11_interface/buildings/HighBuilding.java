package chap11_interface.buildings;

//class가 인터페이스를 상속 받을 때에는 implements 키워드를 사용한다
//인터페이스를 상속 받아 추상메소드 일부만 구현하려면 추상class로 선언한다 
public /*abstract*/ class HighBuilding implements Building {

	@Override
	public void build() {
		System.out.println("고층 건물을 짓는다.");
	}

	@Override
	public void turnOnAircon() {
		System.out.println("에어컨을 가동하다.");
	}

	@Override
	public int getParkingPrice(int time) {
		int totalPrice = time * 1000;
		return totalPrice;
	}

}
