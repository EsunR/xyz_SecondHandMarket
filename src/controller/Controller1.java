package controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import pojo.Item;
import pojo.User;
import pojo.UserAndItem;
import pojo.Want;
import service.Service;

@Controller
public class Controller1 {
	
	@Autowired
	private Service service;
	
	@RequestMapping("/Items/{itemid}")
	public ModelAndView item(@PathVariable Integer itemid){
		ModelAndView mav = new ModelAndView();
		UserAndItem userAndItem=service.findItemById(itemid);
		mav.addObject("list", userAndItem);
		mav.setViewName("../Item/item");
		return mav;
	} 
	@RequestMapping("/Users/{userid}")
	public ModelAndView userjsp(@PathVariable Integer userid){
		ModelAndView mav = new ModelAndView();
		List<Item> item=service.findItemBySellerId(userid);
		List<UserAndItem> userAndItem=service.findUserWantByUserId(userid);
		mav.addObject("userpublish", item);
		mav.addObject("userwant", userAndItem);
		mav.setViewName("../User/user");
		return mav;
	} 
	@RequestMapping("/Searchs/{title}")
	public ModelAndView userjsp(@PathVariable String title){
		ModelAndView mav = new ModelAndView();
		List<UserAndItem> item=service.findItemBySellerTitle(title);
		mav.addObject("searchItem", item);
		mav.setViewName("../Search/search");
		return mav;
	} 
	
	@ResponseBody
	@RequestMapping("login")
	public Map<String,Object> login( User user,Model model,HttpSession session){
		Map<String, Object> map=new HashMap<String, Object>();
		try {
			User user1=service.findUserByUserName(user);
			if(user1!=null&&user1.getPassword().equals(user.getPassword())) {
				session.setAttribute("user",user1);
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
	@RequestMapping("loginOut")
	public Map<String,Object> loginOut(HttpSession session ){
		Map<String, Object> map=new HashMap<String, Object>();
		try {
			session.invalidate();
				map.put("msg","1");
				return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	} 
	@ResponseBody
	@RequestMapping("ipublishDelete")
	public Map<String,Object> ipublishDelete( Integer id){
		Map<String, Object> map=new HashMap<String, Object>();
		try {
			 service.ipublishDelete(id);
				map.put("msg","1");
				return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	} 
	@ResponseBody
	@RequestMapping("iwantDelete")
	public Map<String,Object> iwantDelete( Want want){
		Map<String, Object> map=new HashMap<String, Object>();
		try {
			service.iwantDelete(want);
			map.put("msg","1");
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	} 
	
  
	@ResponseBody
	@RequestMapping("register")
	public Map<String,Object> register( User user){
		Map<String, Object> map=new HashMap<String, Object>();
		try {
			User user1=service.findUserByUserName(user);
			if(user1!=null) {
				map.put("msg","2");
				return map;
			}else {
				user.setLevel("良好");
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
		List<UserAndItem> item=service.findAllItem();
		mav.addObject("list",item);
		mav.setViewName("Index/index");
		return mav;
	}  
	@RequestMapping("iwant")
	public void iwant(Want want){
		service.addWant(want);
	}  
	@ResponseBody
	@RequestMapping("userUpdate")
	public Map<String, Object> userUpdate(User user, HttpSession session){
		try {
			Map<String, Object> map=new HashMap<String, Object>();
			service.userUpdate(user);
			session.setAttribute("user",user);
			map.put("msg", 1);
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		 
	}  
	@RequestMapping(value="publishs", produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
	public ModelAndView publish(Item item,@RequestParam(value = "file", required = false) MultipartFile file,@RequestParam(value = "files", required = false) List<MultipartFile> files,HttpServletRequest request){
		try {
			ModelAndView mav = new ModelAndView();
			int id = service.addItem(item);
			String realPath=request.getSession().getServletContext().getRealPath("/Data/SecondHand/Item/"+id+"/");
			System.out.println("11111111111111111111111111111111111"+request.getSession().getServletContext().getRealPath("/"));
			File file1=new File(realPath);
	        if(!file1.isDirectory())
	        {
	            //创建文件夹
	            file1.mkdirs();
	        }
	        String fileName=file.getOriginalFilename();// 文件原名称
	        String type=fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf("."),fileName.length()):null;
			file.transferTo(new File(realPath+"cover"));
			int i=1;
			for (MultipartFile multipartFile : files) {
				String fileName1=multipartFile.getOriginalFilename();// 文件原名称
				String type1=fileName1.indexOf(".")!=-1?fileName1.substring(fileName1.lastIndexOf("."),fileName1.length()):null;
				multipartFile.transferTo(new File(realPath+id+"_"+i));
				i++;
			}
			mav.addObject("msg","1");
			mav.setViewName("Publish/publish");
			return mav;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}  
}
