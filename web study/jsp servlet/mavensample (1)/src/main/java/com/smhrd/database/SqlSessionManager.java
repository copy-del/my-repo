package com.smhrd.database;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionManager {
	
	// DB설정 정보를 가져오기 
	static SqlSessionFactory sqlSessionFactory;
	
	// static 블록 : 클래스 로딩 시 딱 한번만 수행되는 블럭
	static {
		
		String resource = "com/smhrd/database/mybatis-config.xml";
		// mybatis-config에 작성된 db 정보를 가지고 실제로 db연결을 도와줄
		// session을 생성할 Factory 만들기
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			// reader에 작성된 DB정보를 가지고 세션 빌드
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	// dao에서 사용하기 위해서 SqlSessionFactory를 반환해주는 메소드
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
