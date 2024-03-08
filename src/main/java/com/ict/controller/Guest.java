package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.MembersVO;
import com.ict.model.Command;
import com.ict.model.DeleteCommand;
import com.ict.model.DeleteOkCommand;
import com.ict.model.IndexCommand;
import com.ict.model.ListCommand;
import com.ict.model.LoginCommand;
import com.ict.model.Login_PageCommand;
import com.ict.model.OnelistCommand;
import com.ict.model.Pwd_ConfirmCommand;
import com.ict.model.Pwd_ConfirmCommand2;
import com.ict.model.Reg_PageCommand;
import com.ict.model.RegisterCommand;
import com.ict.model.SaveCommand;
import com.ict.model.UpdateCommand;
import com.ict.model.UpdateOkCommand;
import com.ict.model.WriteCommand;

@WebServlet("/Guest")
public class Guest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String cmd = request.getParameter("cmd");
		System.out.println("111111");
		Command comm = null;
		switch (cmd) {
		case "list":
			comm = new ListCommand();
			break;
		case "write":
			comm = new WriteCommand();
			break;
		case "save":
			comm = new SaveCommand();
			break;
		case "onelist":
			comm = new OnelistCommand();
			break;
		case "delete":
			comm = new DeleteCommand();
			break;
		case "delete_ok":
			comm = new DeleteOkCommand();
			break;
		case "update":
			comm = new UpdateCommand();
			break;
		case "update_ok":
			comm = new UpdateOkCommand();
			break;
		case "register":
			comm = new RegisterCommand();
			break;
		case "reg_page":
			comm = new Reg_PageCommand();
			break;
		case "index":
			comm = new IndexCommand();
			break;
		case "login":
			System.out.println("2222");
			comm = new LoginCommand();
			break;
		case "login_page":
			comm = new Login_PageCommand();
			break;
		case "pwd_confirm":
			comm = new Pwd_ConfirmCommand();
			break;
		case "pwd_confirm2":
			comm = new Pwd_ConfirmCommand2();
			break;
		}
		String path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}

}
