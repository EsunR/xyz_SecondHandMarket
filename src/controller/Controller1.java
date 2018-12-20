package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pojo.Item;
import pojo.User;
import service.Service;

@Controller
public class Controller1 {
	
	@Autowired
	private Service service;
	
	@RequestMapping("/Item")
	public ModelAndView item(Integer itemid){
		ModelAndView mav = new ModelAndView();
		Item item=service.findItemById(itemid);
		
		return mav;
	} 
	
	@ResponseBody
	@RequestMapping("login")
	public Map<String,Object> login( User user,Model model){
		Map<String, Object> map=new HashMap<String, Object>();
		try {
			User user1=service.findUserByUserName(user);
			if(user1!=null&&user1.getPassword().equals(user.getPassword())) {
				map.put("msg","1");
			return map;
			}else {
				map.put("msg","2");
				return map;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}  
	@ResponseBody
	@RequestMapping("register")
	public Map<String,Object> register( User user,Model model){
		Map<String, Object> map=new HashMap<String, Object>();
		try {
			User user1=service.findUserByUserName(user);
			if(user1!=null) {
				map.put("msg","2");
				return map;
			}else {
				service.addUser(user);
				map.put("msg","1");
				return map;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}  
	@RequestMapping("indexs")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView();
		List<Item> item=service.findAllItem();
		mav.addObject("list",item);
		mav.setViewName("Index/index");
		return mav;
	}  
}
