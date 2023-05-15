package Model;

public class User {
	
	private String password;
	private String username;
	private String address;
	private String phone_number;
	private String image;
	private String email;
	
	
	
	public User(String username,  String email, String address, String phone_number, String password, String image) {

		this.password = password;
		this.username = username;
		this.address = address;
		this.phone_number = phone_number;
		this.image = image;
		this.email= email;
		
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
}