package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.tag.common.fmt.RequestEncodingSupport;

import com.ict.db.GuestDAO;
import com.ict.db.MembersVO;

public class Pwd_ConfirmCommand implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String idx = request.getParameter("idx");
		MembersVO mvo = GuestDAO.getMoneList(idx);
		request.setAttribute("mvo", mvo);
		return "guestbook/members_pwd.jsp";
	}
}
