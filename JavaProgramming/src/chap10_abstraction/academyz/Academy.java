package chap10_abstraction.academyz;

public abstract class Academy {
	public int classNum;
	public int teacherNum;
	public int studentNum;
	public int subjectNum = 1;
	public boolean homework;
	
	public abstract void teach(int subject);
	
	public abstract void doHomework(boolean doHw);
	
	public abstract void rest();
	
	public abstract void attend();
	
}
