package spring.test.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import spring.test.com.service.ChaebunService;
import spring.test.com.service.MemberService;
import spring.test.com.vo.MemberVO;

@Controller
public class MemberController {
	
	private MemberService memberService;
	private ChaebunService chaebunService;
	
	@Autowired(required=false)
	public MemberController(MemberService memberService, ChaebunService chaebunService) {
		this.memberService = memberService;
		this.chaebunService = chaebunService;
	}

	public String login() {
		return null;
	}
	
	public String selectAllMember() {
		return null;
	}
	
	public String selectMember() {
		return null;
	}
	
	@RequestMapping(value="join",method=RequestMethod.GET)
	public String join() {
		return "member/memberInsert";
	}
	
	@RequestMapping(value="memberInsert2", method=RequestMethod.POST)
	public String insertMember(MemberVO mvo) {
		MemberVO chaebun = chaebunService.getMemberChaebun();
		mvo.setNum(chaebun.getNum());
		int nCnt = memberService.memberInsert(mvo);
		System.out.println("nCnt >> " + nCnt);
		
		return "member/insertOK";
	}
	
	public String updateMember() {
		return null;
	}
	
	public String deleteMember() {
		return null;
	}

}
