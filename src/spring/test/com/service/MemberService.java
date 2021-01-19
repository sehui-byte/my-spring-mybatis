package spring.test.com.service;

import java.util.List;

import spring.test.com.vo.MemberVO;

public interface MemberService {

	public int memberInsert(MemberVO mvo);
	public List<MemberVO> memberSelectAll(MemberVO mvo);
	public List<MemberVO> meberSelct(MemberVO mvo);
	public int memberUpdate(MemberVO mvo);
	public int memberDelete(MemberVO mvo);
}
