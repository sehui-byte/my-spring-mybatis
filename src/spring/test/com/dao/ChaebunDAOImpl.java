package spring.test.com.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.test.com.vo.MemberVO;

@Repository
public class ChaebunDAOImpl implements ChaebunDAO{

	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	@Override
	public MemberVO getMemberChaebun() {
		return sqlSession.selectOne("getMemberChaebun");
	}

}
