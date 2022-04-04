package vo;

public class MemberVO {
	
	String id;
	String ename;
	String pw;
	String gender;
	String motive;
	
	//기본생성자
	MemberVO(){
		 
	}
	 
	//매개변수있는 생성자
	public MemberVO(String id, String ename, String pw, String gender, String motive) {
		super();
		this.id = id;
		this.ename = ename;
		this.pw = pw;
		this.gender = gender;
		this.motive = motive;
	}
	
	//Setter Getter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename; 
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMotive() {
		return motive;
	}
	public void setMotive(String motive) {
		this.motive = motive;
	}
	
	

}
