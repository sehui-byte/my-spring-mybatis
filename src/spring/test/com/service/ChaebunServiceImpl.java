package spring.test.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.test.com.dao.ChaebunDAO;
import spring.test.com.vo.MemberVO;

@Service
@Transactional
public class ChaebunServiceImpl implements ChaebunService{

	private ChaebunDAO chaebunDAO;
	
	@Autowired(required=false)
	public ChaebunServiceImpl(ChaebunDAO chaebunDAO) {
		this.chaebunDAO = chaebunDAO;
	}
	
	@Override
	public MemberVO getMemberChaebun() {
		MemberVO mvo = chaebunDAO.getMemberChaebun();
		System.out.println("getMemberChaebun() >> " + mvo.getNum());
		return mvo;
	}

}
