package entities;

public class Report {

	private String name;
	private String email;
	private int numberRoom;

	public Report(String name, String email, int numberRoom) {
		this.name = name;
		this.email = email;
		this.numberRoom = numberRoom;
	}

	public int getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(int numberRoom) {
		this.numberRoom = numberRoom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
