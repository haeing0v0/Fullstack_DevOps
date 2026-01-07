package exam.ex05;

public class Student { //464p
	
	String id;
	String name;
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return id + ":" + name;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if (this.id == std.id) {
				return true;
			} else return false;
		}
		return false;
	}
}
