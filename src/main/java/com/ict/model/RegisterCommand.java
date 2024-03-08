package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.GuestDAO;
import com.ict.db.MembersVO;
import com.ict.model.Command;

public class RegisterCommand implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		MembersVO mvo = new MembersVO();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String addr = request.getParameter("addr");
		String phone = request.getParameter("phone");

		mvo.setId(id);
		mvo.setPwd(pwd);
		mvo.setName(name);
		mvo.setEmail(email);
		mvo.setAddr(addr);
		mvo.setPhone(phone);

		int res = GuestDAO.mInsert(mvo);

		return "Guest?cmd=index";
	}
}
