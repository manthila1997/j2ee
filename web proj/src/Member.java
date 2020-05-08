
public class Member {

	private String name,pword;

	public Member( String name, String pword) {
		super();
		
		this.name = name;
		this.pword = pword;
	}

	public Member() {
		super();
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}
	
	
}
