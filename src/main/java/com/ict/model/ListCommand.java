package com.ict.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.GuestDAO;
import com.ict.db.GuestVO;

public class ListCommand implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// guestbook 테이블의 모든 정보 다 가져와야 한다.
		// DB 처리는 MyBatis이다.
		// 오라클 라이브러리와 MyBatis 라이브러리를 WEB-INF 안 lib에 넣는다.
		
		List<GuestVO> list = GuestDAO.getList();
		request.setAttribute("list", list);
		
		return "guestbook/list.jsp";
	}
}
