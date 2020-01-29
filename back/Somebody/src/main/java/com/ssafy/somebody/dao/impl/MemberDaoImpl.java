package com.ssafy.somebody.dao.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.somebody.dao.MemberDao;
import com.ssafy.somebody.vo.Members;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	SqlSession sqlsession;
	private final String ns = "memberMapper.";
	@Override
	public int insertMember(Members member) {
		return sqlsession.insert(ns + "insertMember", member);
	}
	@Override
	public Members searchMember(String membersId) {
		return sqlsession.selectOne(ns+"searchMember", membersId);
	}
	@Override
	public List<Members> searchAllMember() {
		return sqlsession.selectList(ns+"searchAllMember");
	}
	@Override
	public int updateMember(Members member) {
		return sqlsession.update(ns+"updateMember",member);
	}
	@Override
	public int deleteMember(String memberId) {
		return sqlsession.delete(ns+"deleteMember",memberId);
	}
	@Override
	public Members passCheck(String membersId, String password) {
		Map<String, String> map = new HashMap<>();
		map.put("membersId", membersId);
		map.put("password", password);
		return sqlsession.selectOne(ns+"passCheck", map);
	}
}