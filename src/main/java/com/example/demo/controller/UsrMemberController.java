package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.MemberService;
import com.example.demo.util.Ut;
import com.example.demo.vo.Member;
import com.example.demo.vo.ResultData;

@Controller
public class UsrMemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping("/usr/member/doJoin")
	@ResponseBody
	public Object doJoin(String loginId, String loginPw, String name, String nickname, String cellphoneNum,
			String email) {

		if (Ut.isEmptyOrNull(loginId)) {
			return ResultData.from("F-1", Ut.f("loginId를 입력해주세요"));
		}
		if (Ut.isEmptyOrNull(loginPw)) {
			return ResultData.from("F-1", Ut.f("loginPw를 입력해주세요"));
		}
		if (Ut.isEmptyOrNull(name)) {
			return ResultData.from("F-1", Ut.f("name를 입력해주세요"));
		}
		if (Ut.isEmptyOrNull(nickname)) {
			return ResultData.from("F-1", Ut.f("nickname를 입력해주세요"));
		}
		if (Ut.isEmptyOrNull(cellphoneNum)) {
			return ResultData.from("F-1", Ut.f("cellphoneNum를 입력해주세요"));
		}
		if (Ut.isEmptyOrNull(email)) {
			return ResultData.from("F-1", Ut.f("email를 입력해주세요"));
		}

		int id = (int) memberService.doJoin(loginId, loginPw, name, nickname, cellphoneNum, email);

		if (id == -1) {
			return ResultData.from("F-1", Ut.f("이미 사용중인 아이디입니다"), loginId);
		}

		if (id == -2) {
			return ResultData.from("F-1", Ut.f("이미 사용중인 이메일입니다"), email);
		}

		Member member = memberService.getMemberById(id);

		return ResultData.from("S-1", Ut.f("%d번 회원이 등록되었습니다", id), member);
	}

}