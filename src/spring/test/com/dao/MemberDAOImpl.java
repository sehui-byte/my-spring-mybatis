package spring.test.com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.test.com.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Autowired(required=false)
	private SqlSession sqlSession;
	
	@Override
	public int memberInsert(MemberVO mvo) {
		return (Integer)sqlSession.insert("insertMember",mvo);
	}

	@Override
	public List<MemberVO> memberSelectAll(MemberVO mvo) {
		return sqlSession.selectList("selectAllMember",mvo);
	}

	@Override
	public List<MemberVO> memberSelect(MemberVO mvo) {
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
	public List<MemberVO> loginChk(MemberVO mvo) {
		// TODO Auto-generated method stub
		return null;
	}

}
