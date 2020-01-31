package com.ssafy.somebody.dao;

import java.util.List;

import com.ssafy.somebody.vo.Attend;

public interface AttendDao {
	int attend(Attend attend);
	int cancelAttend(String attendId);
	List<Attend> searchAttendByAuctionId(String auctionId);
	List<Attend> searchAttendByMembersId(String membersId);
	int pickAttend(String AttendId);
}
