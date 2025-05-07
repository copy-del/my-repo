package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class MemberDAO {

	// Java fkd  Mybatis를 연결하는 역할 수행.
	// 회원가입) 사용자가 입력한 값들을 받아서
	// 		Mybatis를 통해서 DB의 테이블에 넣어주는 작업
	SqlSessionFactory sessionFactory = SqlSessionManager.getSqlSessionFactory();
	
	public int join(MavenMember member) {
		// 1. factory를 통해서 sqlSession 생성
		SqlSession sqlsession = sessionFactory.openSession(true);
		// 매개변수 (어떤sql문, 넘겨줄값)
		int res = sqlsession.insert("com.smhrd.database.Membermapper.join",member);
		// 세션 사용 후 자원 반환
		sqlsession.close();
		return res;
	}

	public MavenMember login(MavenMember member) {
		SqlSession sqlsession = sessionFactory.openSession(true);
		// selectOne : select 했을때 실제 결과가 1개일 경우에만 사용 가능.
		MavenMember result = sqlsession.selectOne("com.smhrd.database.Membermapper.login",member);
		sqlsession.close();
		return result;
	}

	public int update(MavenMember member) {
		SqlSession sqlsession = sessionFactory.openSession(true);
		int result = sqlsession.update("com.smhrd.database.Membermapper.update",member);
		sqlsession.close();
		return result;
	}

	public int idCheck(String id) {
		SqlSession sqlsession = sessionFactory.openSession(true);
		int count = sqlsession.selectOne("com.smhrd.database.Membermapper.idCheck",id);
		sqlsession.close();
		return count;

	}
	
	
	
	
}
