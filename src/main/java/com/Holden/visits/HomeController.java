package com.Holden.visits;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(HttpSession session) {
    	session.setAttribute("count", 0);
        return "index.jsp";
    }
    
    @RequestMapping("/counter")
    public String user(HttpSession session){
        session.getAttribute("count");
        Integer count = (Integer) session.getAttribute("count");
        count++;
        session.setAttribute("count", count);
        return "counter.jsp";
    }
}    
