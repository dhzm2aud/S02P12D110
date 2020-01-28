package com.ssafy.somebody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.somebody.service.MemberService;
import com.ssafy.somebody.vo.BoolResult;
import com.ssafy.somebody.vo.Members;

@RestController
@RequestMapping("member")
@CrossOrigin(origins = { "*" }, maxAge = 6000)
public class MemberController {
	
	@Autowired
	MemberService memberservice;

	@RequestMapping(value = "/searchMemberById/{id}", method = RequestMethod.GET)
	public ResponseEntity<BoolResult> searchMemberById(@PathVariable String membersId) throws Exception {
		System.out.println("뜨뜬");
		Members members = memberservice.select(membersId);
		BoolResult nr = new BoolResult();
		if (members == null) {
			nr.setState("fail");
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}else {
			nr.setState("succ");
		}
		return new ResponseEntity (members, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity<String> test() throws Exception {
		return new ResponseEntity ("test", HttpStatus.OK);
	}
}