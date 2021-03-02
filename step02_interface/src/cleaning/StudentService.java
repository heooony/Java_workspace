package cleaning;

public class StudentService {
	private String pickedName [];
	private int pickedNum [];
	static int total;
	static int count;
	
	StudentService(int total) {
		StudentService.total = total;
		count = 0;
		pickedName = new String[total];
		pickedNum = new int[total];
	}
	
	public String[] getPickedStudent() { return pickedName; }
	
	public void getStudent() {
		for(int i = 0; i < total; i++) {
			
			int randNum = 0;
			randNum = (int)(Math.random() * Student.studentLength);
			if(!isDuplicate(randNum)) {
				i--;
				continue;
			}
			
			pickedName[i] = Student.student[randNum];
			pickedNum[count] = randNum;
			count++;
		}
	}
	
	public boolean isDuplicate(int randNum) {
		for(int i = 0; i < pickedNum.length; i++) {
			if(randNum == pickedNum[i]) {
				return false;
			}
		}
		
		for(int i = 0; i < Student.previousStudentLength; i++) {
			if(Student.student[randNum].equals(Student.previousStudent[i])) {
				return false;
			}
		}
		
		return true;
	}	
}
