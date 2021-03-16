package egov.mytest.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egov.mytest.service.MyTestService; 
import egov.mytest.service.MyTestVO;




@Controller
public class MyTestController {

	@Resource(name="mytestService")
	private MyTestService mytestService;
	
	@RequestMapping("article/list.do")
	public String list(@ModelAttribute("mytestVO") MyTestVO mytestVO, Model model) {
		List<?> list = mytestService.list(mytestVO);
		model.addAttribute("list", list);
		return "article/list";
	}

}
