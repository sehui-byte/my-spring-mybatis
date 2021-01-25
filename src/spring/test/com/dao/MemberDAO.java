package spring.test.com.dao;

import java.util.List;

import spring.test.com.vo.MemberVO;

public interface MemberDAO {
	
	int memberInsert(MemberVO mvo);
	List<MemberVO> memberSelectAll(MemberVO mvo);
	List<MemberVO> memberSelect(MemberVO mvo);
	int memberUpdate(MemberVO mvo);
	int memberDelete(MemberVO mvo);
	MemberVO loginChk(MemberVO mvo);
	

}
