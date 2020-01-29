package com.ssafy.somebody.service;
import java.util.List;
import com.ssafy.somebody.vo.Members;

public interface MemberService {
	int insertMember(Members member);
	Members searchMember(String membersId);
	List<Members> searchAllMember();
	int updateMember(Members member);
	int deleteMember(String membersId);
	Members passCheck(String membersId, String password);
}