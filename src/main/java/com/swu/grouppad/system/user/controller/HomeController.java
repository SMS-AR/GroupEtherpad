package com.swu.grouppad.system.user.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.swu.grouppad.system.user.service.UserService;

import net.gjerull.etherpad.client.EPLiteClient;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private UserService UserService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		/*
				EPLiteClient client = new EPLiteClient("http://localhost:9001", "96c5e2204c886c93f1c2b4f74ff826169490131558d486ddfaa11f512006a158");
		
				// Create pad and set text
				client.createPad("my_pad");
				client.setText("my_pad", "foo!!");
		
				// Get pad text
				String text = client.getText("my_pad").get("text").toString();
		
				// Get list of all pad ids
				Map result = client.listAllPads();
				List padIds = (List) result.get("padIDs");
				*/
//		EPLiteClient client = new EPLiteClient("http://localhost:9001", "96c5e2204c886c93f1c2b4f74ff826169490131558d486ddfaa11f512006a158");
//		Map groupMap = client.createGroupPad("hahagroup", "hahatext", "哈哈小组的pad初始内容");
//		for (Object a : groupMap.keySet()) {
//			System.out.println(groupMap.get(a));
//		}
//		Map authorMap = client.createAuthorIfNotExistsFor("123", "哈哈1");
//		Map sessionMap = client.createSession(groupMap.get("groupId").toString(), authorMap.get("authorId").toString(), new Date());
//		
		model.addAttribute("serverTime", formattedDate);
//		model.addAllAttributes("url","http://localhost:9001/p/"++"");
		return "/grouppad/index";
	}
	
	@RequestMapping(value = "/pad")
	public String pad(Model model,HttpServletRequest request, HttpServletResponse response,HttpSession session){
		/*
		EPLiteClient client = new EPLiteClient("http://localhost:9001", "8f2f95ba0babc4a151d970b8acfbc00869cf3dce5b5ca6893343303d86049cd8");
		Map groupMap = client.createGroupIfNotExistsFor("hahagroup111444");
		Map groupPadMap = client.createGroupPad(groupMap.get("groupID").toString(), "haha01", "哈哈小组的pad初始内容");
		Map authorMap = client.createAuthorIfNotExistsFor("123415", "哈哈11");
		Map sessionMap = client.createSession(groupMap.get("groupID").toString(), authorMap.get("authorID").toString(), (int)new Date().getTime()/1000);
		model.addAttribute("url","http://localhost:9001/p/"+groupPadMap.get("padID").toString());
		Cookie cookie = getCookieByName(request,"sessionID");
        if (null==cookie) {
        	cookie = new Cookie("sessionID", sessionMap.get("sessionID").toString());
            cookie.setPath("/");  
            cookie.setMaxAge(30 * 60);// 设置为30min  
            response.addCookie(cookie);
        } else {  
            cookie.setValue(sessionMap.get("sessionID").toString());  
            cookie.setPath("/");  
            cookie.setMaxAge(30 * 60);// 设置为30min  
            response.addCookie(cookie);  
        }
        */
		return "/grouppad/common/home";
	}
	public  Cookie getCookieByName(HttpServletRequest request,String name){
        Map<String,Cookie> cookieMap = ReadCookieMap(request);
        if(cookieMap.containsKey(name)){
            Cookie cookie = (Cookie)cookieMap.get(name);
            return cookie;
        }else{
            return null;
        }   
    }
      
      
      
    /**
     * 将cookie封装到Map里面
     * @param request
     * @return
     */
    private  Map<String,Cookie> ReadCookieMap(HttpServletRequest request){  
        Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();
        Cookie[] cookies = request.getCookies();
        if(null!=cookies){
            for(Cookie cookie : cookies){
                cookieMap.put(cookie.getName(), cookie);
            }
        }
        return cookieMap;
    }
}

