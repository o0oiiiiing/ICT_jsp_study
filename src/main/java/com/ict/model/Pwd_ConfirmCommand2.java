package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.GuestDAO;
import com.ict.db.MembersVO;

public class Pwd_ConfirmCommand2 implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String idx = request.getParameter("idx");
		MembersVO mvo = GuestDAO.getMoneList(idx);
		request.setAttribute("mvo", mvo);
		return "guestbook/members_detail.jsp";
		
	
	}
}
