package spring.test.com.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.test.com.dao.MemberDAO;
import spring.test.com.vo.MemberVO;

@Service
@Transactional
public class MemberServiceImpl implements MemberService{

	private MemberDAO memberDAO;
	
	@Autowired(required=false)
	public MemberServiceImpl(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Override
	public int memberInsert(MemberVO mvo) {
		int nCnt = memberDAO.memberInsert(mvo);
		return nCnt;
	}

	@Override
	public List<MemberVO> memberSelectAll(MemberVO mvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> meberSelct(MemberVO mvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberDelete(MemberVO mvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean login(MemberVO mvo, HttpSession session) {
		System.out.println(memberDAO.loginChk(mvo));
		if(memberDAO.loginChk(mvo) != null) {
			System.out.println(memberDAO.loginChk(mvo));
			System.out.println("userpw >> " + memberDAO.loginChk(mvo).getPw());
			session.setAttribute("userid", memberDAO.loginChk(mvo).getEmail());
			return true;
		}
		System.out.println("null");
		return false;
	}

	@Override
	public void logout(HttpSession session) {
		//세션 종료
		session.invalidate();
		
	}

}
