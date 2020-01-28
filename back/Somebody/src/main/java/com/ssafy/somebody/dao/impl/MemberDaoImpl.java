package com.ssafy.somebody.dao.impl;
import java.util.List;
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
	public Members select(String membersId) {
		return sqlsession.selectOne(ns+" ", membersId);
	}
	@Override
	public List<Members> selectAll() {
		return sqlsession.selectList(ns+" ");
	}
	@Override
	public int updateMember(Members member) {
		return sqlsession.update(ns+" ",member);
	}
	@Override
	public int deleteMember(String memberId) {
		return sqlsession.delete(ns+" ",memberId);
	}
}