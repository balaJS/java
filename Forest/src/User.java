
public class User {
	private String uname;
	private String uemail;
	private String upass;
	private Integer userId;

	User(String uname, String uemail, String upass) {
		this.setUname(uname);
		this.setUemail(uemail);
		this.setUpass(upass);
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUemail() {
		return this.uemail;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public String setUpass() {
		return this.upass;
	}

	public void setUserId(Integer userId) { 
		this.userId = userId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void register() {
//		int userId = this.getUserId();
//
//		if (userId != 0) {
//			System.out.println("lOGGED in user.");
//		}
		System.out.println("Registered.");
	}

	public void login() {

	}

	public void logout() {

	}
}
