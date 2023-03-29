package chap13_objectarray.clazz;

public class English implements ILecture {
	private String subject = "English";
	private int studentCnt = 30;
	private int lectureTime = 50;
	
	public English(String subject, int studentCnt, int lectureTime) {
		this.subject = subject;
		this.studentCnt = studentCnt;
		this.lectureTime = lectureTime;
	}
	
	@Override
	public void proceedLecture() {
		System.out.println(this.subject + "수업을 "
				+ this.studentCnt + "명의 학생이 듣습니다. "
				+ "수업 시간은 " + lectureTime + "분입니다.");
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getStudentCnt() {
		return studentCnt;
	}

	public void setStudentCnt(int studentCnt) {
		this.studentCnt = studentCnt;
	}

	public int getLectureTime() {
		return lectureTime;
	}

	public void setLectureTime(int lectureTime) {
		this.lectureTime = lectureTime;
	}
}
