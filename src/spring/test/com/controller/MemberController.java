package spring.test.com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

	//로그인 화면
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login() {
		return "member/login";
	}
	
	//로그인 처리
	@RequestMapping(value="loginChk", method=RequestMethod.POST)
	public ModelAndView loginChk(@ModelAttribute MemberVO mvo, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		System.out.println(mvo.getEmail());
		boolean result = memberService.login(mvo, session);
		System.out.println("result >> " + result);
		if(result) {
			mav.addObject("msg","success");
			mav.setViewName("../../index");
		}
			
		else {
			System.out.println("false!");
			mav.addObject("msg", "failure");
			mav.setViewName("member/login");	
		}
		return mav;
	}
	
	//로그아웃 처리
	@RequestMapping("logout")
	public ModelAndView logout(HttpSession session) {
		memberService.logout(session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/login");
		mav.addObject("msg", "logout");
		return mav;
	}
	
	public String selectAllMember() {
		return null;
	}
	
	public String selectMember() {
		return null;
	}
	
	//회원가입 화면
	@RequestMapping(value="join",method=RequestMethod.GET)
	public String join() {
		return "member/memberInsert";
	}
	
	//회원가입 처리
	@RequestMapping(value="memberInsert2", method=RequestMethod.POST)
	public String insertMember(MemberVO mvo) {
		MemberVO chaebun = chaebunService.getMemberChaebun();
		mvo.setNum(chaebun.getNum());
		int nCnt = memberService.memberInsert(mvo);
		System.out.println("nCnt >> " + nCnt);
		
		return "../../index";
	}
	
	public String updateMember() {
		return null;
	}
	
	public String deleteMember() {
		return null;
	}

}
