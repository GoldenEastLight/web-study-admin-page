package com.ssafy.happyhouse.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssafy.happyhouse.admin.service.AdminService;
import com.ssafy.happyhouse.repository.dto.Member;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/main")
	public void adminForm(Model model) {
		try {
			List<Member> members = adminService.select();
			model.addAttribute("members", members);
			int visit10 = adminService.visit10s();
			model.addAttribute("visit10", visit10);
			int visit20 = adminService.visit20s();
			model.addAttribute("visit20", visit20);
			int visit30 = adminService.visit30s();
			model.addAttribute("visit30", visit30);
			int visit40 = adminService.visit40s();
			model.addAttribute("visit40", visit40);
			int visit50 = adminService.visit50s();
			model.addAttribute("visit50", visit50);
			int visit60 = adminService.visit60s();
			model.addAttribute("visit60", visit60);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
