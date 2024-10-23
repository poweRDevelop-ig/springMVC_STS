package com.office.library.admin.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/member")
public class AdminMemberController {
	
	//회원가입
	@RequestMapping(value = "/createAccountForm", method = RequestMethod.GET)
	//@PostMapping("/createAccountFrom/")
	public String createAccouintForm() { 
		System.out.println("[AdminMemberController] createAccountform()");
		String nextPage = "admin/member/create_account_form";
		return nextPage;
	}
	
	//회원가입 확인
	@RequestMapping(value = "/createAccountConfirm", method = RequestMethod.GET)
	//@PostMapping("/createAccountConfirm")
	public String createAccountConfirm() {
		System.out.println("[AdminMemberController] createAccountconfirm()");
		return null;
	}
	
}
