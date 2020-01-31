package com.ssafy.somebody.dao;
import java.util.List;

import com.ssafy.somebody.vo.Members;
import com.ssafy.somebody.vo.Verify;

public interface MemberDao {
	int insertMember(Members member);
	Members searchMember(String membersId);
	List<Members> searchAllMember();
	int updateMember(Members member);
	int deleteMember(String membersId);
	Members passCheck(String membersId, String password);
	int insertVerify(Verify verify);
	int updateVerify(Verify verify);
	Verify searchVerify(String email);
	Verify checkVerify(Verify verify);
}