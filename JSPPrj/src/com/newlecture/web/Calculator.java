package com.newlecture.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator")
public class Calculator extends HttpServlet{
/*	@Override //��� �Ǵ� ��� �Ʒ� doget, dopost�� ���
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		if(req.getMethod().equals("GET")) {
			System.out.println("GET ��û�� �Խ��ϴ�.");
		}
		else if(req.getMethod().equals("POST")) {
			System.out.println("POST ��û�� �Խ��ϴ�.");
		}
		
		super.service(req, res);
	}*/

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGET �޼ҵ尡 ȣ�� �Ǿ����ϴ�.");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPOST �޼ҵ尡 ȣ�� �Ǿ����ϴ�.");
	}
	

}
