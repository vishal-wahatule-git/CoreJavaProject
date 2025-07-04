package hasARelationship;

import java.util.List;

public class Student {

	private int studentId;

	private String name;

	private List<Address> addr;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddr() {
		return addr;
	}

	public void setAddr(List<Address> addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", addr=" + addr + "]";
	}

}
