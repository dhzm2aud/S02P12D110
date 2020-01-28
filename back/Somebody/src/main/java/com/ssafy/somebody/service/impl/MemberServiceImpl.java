package com.ssafy.somebody.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssafy.somebody.dao.MemberDao;
import com.ssafy.somebody.service.MemberService;
import com.ssafy.somebody.vo.Members;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDao memberDao;
	@Override
	public int insertMember(Members member) {
		return memberDao.insertMember(member);
	}
	@Override
	public Members select(String membersId) {
		return memberDao.select(membersId);
	}
	@Override
	public List<Members> selectAll() {
		return memberDao.selectAll();
	}
	@Override
	public int updateMember(Members member) {
		return memberDao.updateMember(member);
	}
	@Override
	public int deleteMember(String memberId) {
		return memberDao.deleteMember(memberId);
	}
}