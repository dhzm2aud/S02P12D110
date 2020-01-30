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

import com.ssafy.somebody.service.AttendService;
import com.ssafy.somebody.vo.Attend;
import com.ssafy.somebody.vo.BoolResult;
import com.ssafy.somebody.vo.Members;

@RestController
@RequestMapping("attend")
@CrossOrigin(origins = { "*" }, maxAge = 6000)
public class AttendController {

	@Autowired
	private AttendService attendservice;
	
	@GetMapping("/searchAttendByAuctionId/{auctionId}")
	public ResponseEntity<BoolResult> searchAttendByAuctionId(@PathVariable String auctionId) throws Exception {
		List<Attend> attend = attendservice.searchAttendByAuctionId(auctionId);
		BoolResult nr = new BoolResult();
		if (attend == null) {
			nr.setState("fail");
			return new ResponseEntity<BoolResult>(HttpStatus.NO_CONTENT);
		} else {
			nr.setState("succ");
		}
		return new ResponseEntity(attend, HttpStatus.OK);
	}

	@GetMapping("/searchAttendByMembersId/{membersId}")
	public ResponseEntity<BoolResult> searchAttendByMembersId(@PathVariable String membersId) throws Exception {
		List<Attend> attend = attendservice.searchAttendByMembersId(membersId);
		BoolResult nr = new BoolResult();
		if (attend == null) {
			nr.setState("fail");
			return new ResponseEntity<BoolResult>(HttpStatus.NO_CONTENT);
		} else {
			nr.setState("succ");
		}
		return new ResponseEntity(attend, HttpStatus.OK);
	}
	
	@PostMapping("/attend")
	public ResponseEntity<BoolResult> attend(@RequestBody Attend attend) {
		boolean flag = attendservice.attend(attend) > 0 ? true : false;
		BoolResult nr = new BoolResult();
		if (!flag) {
			nr.setState("fail");
		} else {
			nr.setState("succ");
		}
		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
	}

	@PutMapping("/pickAttend")
	public ResponseEntity<BoolResult> pickAttend(@RequestBody Attend attend) throws Exception {
		boolean flag = attendservice.pickAttend(attend.getAttendId()) > 0 ? true : false;
		BoolResult nr = new BoolResult();
		if (flag == false) {
			nr.setState("fail");
		} else {
			nr.setState("succ");
		}
		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
	}

	@DeleteMapping("/cancelAttend/{attendId}")
	public ResponseEntity<BoolResult> deleteMember(@PathVariable String attendId) throws Exception {
		boolean flag = attendservice.cancelAttend(attendId) > 0 ? true : false;
		BoolResult nr = new BoolResult();
		if (!flag) {
			nr.setState("fail");
		} else {
			nr.setState("succ");
		}
		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
	}

}
