package chap18_enum.enums;

public enum RGB {
	//상수명 RED("red", 255, 0, 0), GREEN, BLUE
	RED("red", 255, 0, 0) {
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for (String s : color) {
				if (!s.equals(this.getColor())) {
					if (index == 0)
						System.out.print(s + ", ");
					else
						System.out.print(s + " ");
				}
				index++;
			}
			System.out.println("색상이 부족합니다.");
		}
	}, GREEN("green", 0, 255, 0) {
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for (String s : color) {
				if (!s.equals(this.getColor())) {
					if (index == 0)
						System.out.print(s + ", ");
					else
						System.out.print(s + " ");
				}
				index++;
			}
			System.out.println("색상이 부족합니다.");
		}
	}, BLUE("blue", 0, 0, 255) {
		public void makeWhite() {
			String[] color = {"red", "green", "blue"};
			
			int index = 0;
			
			for (String s : color) {
				if (!s.equals(this.getColor())) {
					if (index == 0)
						System.out.print(s + ", ");
					else
						System.out.print(s + " ");
				}
				index++;
			}
			System.out.println("색상이 부족합니다.");
		}
	};
	
	private String color;
	private int rgbNum1;
	private int rgbNum2;
	private int rgbNum3;
	
	RGB(String color, int rgbNum1, int rgbNum2, int rgbNum3) {
		this.color = color;
		this.rgbNum1 = rgbNum1;
		this.rgbNum2 = rgbNum2;
		this.rgbNum3 = rgbNum3;
	}

	public String getColor() {
		return color;
	}

	public int getRgbNum1() {
		return rgbNum1;
	}

	public int getRgbNum2() {
		return rgbNum2;
	}

	public int getRgbNum3() {
		return rgbNum3;
	}
	
	public abstract void makeWhite();
	
}
