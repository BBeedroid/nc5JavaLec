package chap11_interface;

import chap11_interface.multiInherit.MultiflexStadium;
import chap11_interface.multiInherit.SeoulMultiflexStadium;

//MultiflexStadium이 Stadium과 ConcertHall의 형태를 가지고 있기 때문에
//Seoul도 Stadium, ConcertHall의 형태를 가지게 된다. 때문에 Stadium, ConcertHall 타입의 변수도 사용 가능하다
public class _02_multiInherit {

	public static void main(String[] args) {
		MultiflexStadium ms = new SeoulMultiflexStadium();
		
		ms.getSportsSchedule(3);
		int sportsTicket = ms.getSportsTicketPrice(2);
		System.out.println("경기표 가격은 총 " + sportsTicket + "원입니다.");
		ms.getSupportersItem(2);
	
		ms.getRemainSeat();
		int concertTicket = ms.getTicketPrice(5);
		System.out.println("콘서트표 가격은 총 " + concertTicket + "원입니다.");

	}

}
