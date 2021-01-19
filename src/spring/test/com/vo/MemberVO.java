package spring.test.com.vo;

public class MemberVO {

	//�����ͺ��̽� ���̺��� �÷���� DTO�� �Ӽ����� ��ġ�ϸ� �ڵ����� ���εȴ�. �̶� ��ҹ��� ����X
	//�Ϸù�ȣ, �̸�, �̸���, ��й�ȣ
	//�����ȣ, �ּ�, �������ּ�
	//�������, ȸ������
	//ȸ�����Գ�¥, ȸ������������Ʈ��¥, Ż�𿩺�
	
	private String tm_num;
	private String tm_name;
	private String tm_email;
	private String tm_pw;
	private String tm_zipcode;
	private String tm_addr;
	private String tm_extraAddr;
	private String tm_birth;
	private String tm_level;
	private String tm_insertdate;
	private String tm_updatedate;
	private String tm_deleteyn;
	
	public MemberVO() {}
	public MemberVO(String num, String name, String email, String pw, String zipcode, String addr, String extraAddr,
			String birth, String level, String insertdate, String updatedate, String deleteyn) {
		this.tm_num = num;
		this.tm_name = name;
		this.tm_email = email;
		this.tm_pw = pw;
		this.tm_zipcode = zipcode;
		this.tm_addr = addr;
		this.tm_extraAddr = extraAddr;
		this.tm_birth = birth;
		this.tm_level = level;
		this.tm_insertdate = insertdate;
		this.tm_updatedate = updatedate;
		this.tm_deleteyn = deleteyn;
	}
	public String getNum() {
		return tm_num;
	}
	public String getName() {
		return tm_name;
	}
	public String getEmail() {
		return tm_email;
	}
	public String getPw() {
		return tm_pw;
	}
	public String getZipcode() {
		return tm_zipcode;
	}
	public String getAddr() {
		return tm_addr;
	}
	public String getExtraAddr() {
		return tm_extraAddr;
	}
	public String getBirth() {
		return tm_birth;
	}
	public String getLevel() {
		return tm_level;
	}
	public String getInsertdate() {
		return tm_insertdate;
	}
	public String getUpdatedate() {
		return tm_updatedate;
	}
	public String getDeleteyn() {
		return tm_deleteyn;
	}
	public void setNum(String num) {
		this.tm_num = num;
	}
	public void setName(String name) {
		this.tm_name = name;
	}
	public void setEmail(String email) {
		this.tm_email = email;
	}
	public void setPw(String pw) {
		this.tm_pw = pw;
	}
	public void setZipcode(String zipcode) {
		this.tm_zipcode = zipcode;
	}
	public void setAddr(String addr) {
		this.tm_addr = addr;
	}
	public void setExtraAddr(String extraAddr) {
		this.tm_extraAddr = extraAddr;
	}
	public void setBirth(String birth) {
		this.tm_birth = birth;
	}
	public void setLevel(String level) {
		this.tm_level = level;
	}
	public void setInsertdate(String insertdate) {
		this.tm_insertdate = insertdate;
	}
	public void setUpdatedate(String updatedate) {
		this.tm_updatedate = updatedate;
	}
	public void setDeleteyn(String deleteyn) {
		this.tm_deleteyn = deleteyn;
	}
}
