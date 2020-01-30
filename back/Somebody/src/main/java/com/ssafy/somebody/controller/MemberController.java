package com.ssafy.somebody.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.somebody.service.MemberService;
import com.ssafy.somebody.vo.BoolResult;
import com.ssafy.somebody.vo.Members;

@RestController
@RequestMapping("/member")
@CrossOrigin(origins = { "*" }, maxAge = 6000)
public class MemberController {

	@Autowired
	MemberService memberservice;

	@GetMapping("/search/{membersId}")
	public ResponseEntity<BoolResult> searchMember(@PathVariable String membersId) throws Exception {
		Members members = memberservice.searchMember(membersId);
		BoolResult nr = new BoolResult();
		if (members == null) {
			nr.setState("fail");
			return new ResponseEntity<BoolResult>(HttpStatus.NO_CONTENT);
		} else {
			nr.setState("succ");
		}
		return new ResponseEntity(members, HttpStatus.OK);
	}

	@GetMapping("/searchAll")
	public ResponseEntity<BoolResult> searchAllMember() throws Exception {
		List<Members> memberslist = memberservice.searchAllMember();
		BoolResult nr = new BoolResult();
		nr.setState("succ");
		return new ResponseEntity(memberslist, HttpStatus.OK);
	}

	@PostMapping("/insertMember")
	public ResponseEntity<BoolResult> insertMember(@RequestBody Members member) {
		System.out.println(member.getMembersId());
		boolean flag = memberservice.insertMember(member) > 0 ? true : false;
		BoolResult nr = new BoolResult();
		if (!flag) {
			nr.setState("fail");
		} else {
			nr.setState("succ");
		}
		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<BoolResult> updateMember(@RequestBody Members member) throws Exception {
		boolean flag = memberservice.updateMember(member) > 0 ? true : false;
		BoolResult nr = new BoolResult();
		if (flag == false) {
			nr.setState("fail");
		} else {
			nr.setState("succ");
		}
		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{membersId}")
	public ResponseEntity<BoolResult> deleteMember(@PathVariable String membersId) throws Exception {
		boolean flag = memberservice.deleteMember(membersId) > 0 ? true : false;
		BoolResult nr = new BoolResult();
		if (!flag) {
			nr.setState("fail");
		} else {
			nr.setState("succ");
		}
		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
	}

	@PostMapping("/checkPass") // = login
	public ResponseEntity<BoolResult> checkPass(@RequestBody Members member) throws Exception {
		Members members = memberservice.passCheck(member.getMembersId(), member.getPassword());
		BoolResult nr = new BoolResult();
		if (members == null) {
			nr.setState("fail");
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		} else {
			nr.setState("succ");
		}
		return new ResponseEntity(nr, HttpStatus.OK);
	}
}