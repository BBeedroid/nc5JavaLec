package chap18_enum.enums;

public enum Season {
	SPRING("봄") {
		public void printSeasonMonth() {
			String[] strArr = {"3", "4", "5"};
			int index = 0;
			
			for(String s : strArr) {
				if(index < 3) {
					if(index == 0)
						System.out.print("봄은 " + s + ", ");
//						this.getKoreaSeason() + "은 " + s + ", "
					else
						System.out.print(s + ", ");
				}
				index++;
			}
			System.out.println("월입니다.");
		}
	}, SUMMER("여름") {
		public void printSeasonMonth() {
			String[] strArr = {"6", "7", "8"};
			int index = 0;
			
			for(String s : strArr) {
				if(index < 3) {
					if(index == 0)
						System.out.print("여름은 " + s + ", ");
					else
						System.out.print(s + ", ");
				}
				index++;
			}
			System.out.println("월입니다.");
		}
	}, FALL("가을") {
		public void printSeasonMonth() {
			String[] strArr = {"9", "10", "11"};
			int index = 0;
			
			for(String s : strArr) {
				if(index < 3) {
					if(index == 0)
						System.out.print("가을은 " + s + ", ");
					else
						System.out.print(s + ", ");
				}
				index++;
			}
			System.out.println("월입니다.");
		}
	}, WINTER("겨울") {
		public void printSeasonMonth() {
			String[] strArr = {"12", "1", "2"};
			int index = 0;
			
			for(String s : strArr) {
				if(index < 3) {
					if(index == 0)
						System.out.print("겨울은 " + s + ", ");
					else
						System.out.print(s + ", ");
				}
				index++;
			}
			System.out.println("월입니다.");
		}
	};
	
	//변수 설정
	private String koreaSeason;
	
	//생성자 설정
	Season(String koreaSeason) {
		this.koreaSeason = koreaSeason;
	}
	
	//getter 설정
	public String getKoreaSeason() {
		return koreaSeason;
	}
	
	//추상메소드 생성
	public abstract void printSeasonMonth();
	
}	