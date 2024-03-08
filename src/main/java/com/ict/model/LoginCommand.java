package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.GuestDAO;
import com.ict.db.MembersVO;

public class LoginCommand implements Command {
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		MembersVO mvo = new MembersVO();
		
		try {
			mvo = GuestDAO.login(id);
			System.out.println(mvo.getPwd());
			System.out.println(pwd);
			if (pwd.equalsIgnoreCase(mvo.getPwd())) {
				request.setAttribute("mvo", mvo);
				request.setAttribute("display", "none");
				request.setAttribute("display_b", "block");
				request.setAttribute("name", mvo.getName());
				return "guestbook/index.jsp";
			} else {
				System.out.println("실패");
				return "";
			}
		} catch (Exception e) {
			return "";
		}
		
	
	}
}
