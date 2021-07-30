package Day2;

class Student2 {
	private int id;
	private String name;
	private int passMark = 40;
	
	public int getId() {
		return id;
	}
	public void setId(int id) throws Exception{
		if (id < 0) {
			throw new Exception("id cannot be -ve");
		}
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public boolean isBlank(String name) {
		if (name == "") {
			System.out.println("name can not be blank");
		}
		return true;		
	}
	public void setName(String name) throws Exception {
		//if (name.isBlank()) {
			//throw new Exception("name cannot be blank");
			//this.name = name;
		//}
		
	}
	public int getPassMark() {
		return passMark;
	}
}
public class Demo28 {

	public static void main(String[] args) {
		
		Student2 student = new Student2();
		//student.setId(1);
        //student.setName("");
        System.out.println("Id = "+ student.getId()+
        		", Name = "+ student.getName()+
        		", Passmark = "+ student.getPassMark());
		
		

	}

}
