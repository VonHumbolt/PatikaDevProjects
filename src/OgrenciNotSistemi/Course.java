package OgrenciNotSistemi;

public class Course {
	String name;
	String code;
	String prefix;
	int note;
	Teacher teacher;
	
	Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
	}
	
	void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(this.prefix)) {			
			this.teacher = teacher;
		} else {
			System.out.println("Ders b�l�m� ve ��retmen e�le�miyor.");
		}
	}
	
	void printTeacher() {
		if (teacher != null) {			
			System.out.println("�sim: " + this.teacher.name + " Verdi�i Ders: "+ this.name);
		}else {
			System.out.println("Bulunamad�!");
		}
	}
}
