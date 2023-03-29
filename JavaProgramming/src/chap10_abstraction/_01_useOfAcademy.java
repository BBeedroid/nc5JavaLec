package chap10_abstraction;

import chap10_abstraction.academyz.Academy;
import chap10_abstraction.academyz.ComputerAcademy;
import chap10_abstraction.academyz.EnglishAcademy;

public class _01_useOfAcademy {

	public static void main(String[] args) {
		Academy ac = new EnglishAcademy();
		
		ac.teach(1);
		ac.doHomework(false);
		ac.rest();
		ac.attend();
		
		ac = new ComputerAcademy();
		
		ac.teach(3);
		ac.doHomework(true);
		ac.rest();
		ac.attend();
						
	}

}
