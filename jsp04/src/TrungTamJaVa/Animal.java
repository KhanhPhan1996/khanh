package TrungTamJaVa;

public abstract class Animal {
	private String name;

	
	public Animal() {
	   // Gán giá trị mặc định cho 'name'.
	    this.name = this.getAnimalName();
	}
	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Đây là một phương thức trừu tượng.
    // Trả về tên của loài động vật này.
    // Nội dung cụ thể của phương thức này
    // sẽ được thực hiện (implemented) tại các lớp con.
    public abstract String getAnimalName();
	
}
