package com.ht.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ht.model.User;
import com.ht.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userServiceImpl")
	private UserService userService;
	
	@RequestMapping("/list")
	public String list(Model model){
		List<User> userList = userService.list();
		model.addAttribute("userList", userList);
		return "user/userList";
	}
	@RequestMapping("/openUserAdd")
	public String openUserAdd(){
		return "user/userAdd";
	}
	
	@RequestMapping("/insert")
	public String insert(User user){
		userService.insert(user);
		return "redirect:/user/list";
		
	}
	@RequestMapping("/openUserEdit/{id}")
	public String openUserEdit(@PathVariable Integer id,Model model){
		User user = userService.getById(id);
		model.addAttribute("user", user);
		return "user/userEdit";
	}
	@RequestMapping("/update")
	public String update(User user){
		userService.update(user);
		return "redirect:user/list";
	}
	@RequestMapping("/delete/{id}")
   public String delete(@PathVariable Integer id){
		userService.delete(id);
		return "redirect:user/list";
	}
}
