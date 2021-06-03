package test.controller;

import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import test.controller.LoginController;
import test.controller.Controller;

public class FrontController extends HttpServlet{
	HashMap<String, Controller> map = null;
	private Object path;
	@Override
	public void init() throws ServletException {
		map = new HashMap<String, Controller>();
		map.put("/login.do", new LoginController());
	}
}
