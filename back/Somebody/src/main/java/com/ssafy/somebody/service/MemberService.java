package com.ssafy.somebody.service;
import java.util.List;
import com.ssafy.somebody.vo.Members;

public interface MemberService {
	int insertMember(Members member);
	Members select(String membersId);
	List<Members> selectAll();
	int updateMember(Members member);
	int deleteMember(String membersId);
}