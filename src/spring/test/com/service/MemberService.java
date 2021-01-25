package spring.test.com.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import spring.test.com.vo.MemberVO;

public interface MemberService {

	public int memberInsert(MemberVO mvo);
	public List<MemberVO> memberSelectAll(MemberVO mvo);
	public List<MemberVO> meberSelct(MemberVO mvo);
	public int memberUpdate(MemberVO mvo);
	public int memberDelete(MemberVO mvo);
	public boolean login(MemberVO mvo, HttpSession session);
	public void logout(HttpSession session);
}
