package com.smhrd.model;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class MemberDAO {

	SqlSessionFactory sessionFactory = SqlSessionManager.getSqlSessionFactory();

	
	public int join(MemberVO member) {
		// 1. factory를 통해서 sqlSession을 생성
		SqlSession sqlSession = sessionFactory.openSession(true);
		// 매개변수(sql문의 위치, 넘겨줄 값)
		int res = sqlSession.insert("com.smhrd.database.MemberMapper.join", member);
		// 세션 사용 후 자원 반환
		sqlSession.close();
		return res;
	}
	
	public MemberDAO login(MemberVO member) {
		SqlSession sqlSession = sessionFactory.openSession(true);
		MemberDAO result = sqlSession.selectOne("com.smhrd.database.MemberMapper.login", member);
		sqlSession.close();
		return result;
	}
	
	public int idCheck(String id) {
		SqlSession sqlSession = sessionFactory.openSession(true);
		int count = sqlSession.selectOne("com.smhrd.database.MemberMapper.idCheck", id);
		sqlSession.close();
		return count;
	}
	
	public int update(MemberVO member) {
		SqlSession sqlSession = sessionFactory.openSession(true);
		int result = sqlSession.update("com.smhrd.database.MemberMapper.update",member);
		sqlSession.close();
		return result;
	}
	
	
}
