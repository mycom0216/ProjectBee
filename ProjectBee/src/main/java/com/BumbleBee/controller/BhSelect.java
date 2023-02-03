package com.BumbleBee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BumbleBee.model.TbBeehiveDAO;
import com.BumbleBee.model.TbBeehiveDTO;

public class BhSelect implements Command {
	private static final long serialVersionUID = 1L;

	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TbBeehiveDAO dao = new TbBeehiveDAO();
		List<TbBeehiveDTO> list = null;
		
		list = dao.bhselect();
		
		if(list != null) {
			request.setAttribute("list", list);
			return "bhinfo.jsp";
		}
		else {
			return "main.jsp";
		}
		
		
	}

}
