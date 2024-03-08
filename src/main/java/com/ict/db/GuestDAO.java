package com.ict.db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

// 실제 DB처리
public class GuestDAO {
	// 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;

	// 싱글턴 패턴
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = GuestDBService.getFactory().openSession();
		}
		return ss;
	}

	// DB처리하는 메서드들

	// 리스트
	public static List<GuestVO> getList() {
		List<GuestVO> list = null;
		list = getSession().selectList("guestbook.list");
		return list;
	}

	// 삽입 (insert)
	public static int getInsert(GuestVO gvo) {
		int result = 0;
		result = getSession().insert("guestbook.insert", gvo);
		ss.commit(); // 커밋을 안하면 db에 저장이 안됨
		return result;
	}

	// members 삽입 (insert)
	public static int mInsert(MembersVO gvo) {
		int result = 0;
		result = getSession().insert("guestbook.m_insert", gvo);
		ss.commit();
		return result;
	}
	
	// pk가지고 검색하기
	public static GuestVO getOneList(String idx) {
		GuestVO gvo = null;
		gvo = getSession().selectOne("guestbook.detail", idx);
		return gvo;
	}

	// idx 받아서 삭제하기
	public static int getDelete(String idx) {
		int result = 0;
		result = getSession().delete("guestbook.delete", idx);
		ss.commit();
		return result;
	}

	public static int getUpdate(GuestVO gvo) {
		int result = 0;
		result = getSession().update("guestbook.update", gvo);
		ss.commit();
		return result;
	}
	
	// login
	public static MembersVO login(String id) {
		MembersVO mvo = null;
		mvo = getSession().selectOne("guestbook.m_login", id);
		return mvo;
	}
	public static MembersVO getMoneList(String idx) {
		MembersVO mvo = null;
		mvo = getSession().selectOne("guestbook.mdetail", idx);
		return mvo;
	}

}
