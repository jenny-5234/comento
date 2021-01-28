package com.jenny.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jenny.settingweb_boot.dto.UserVo;

@RestController
public class HomeController {
	@RequestMapping(value = "/uservo")
	public UserVo userVo() {
		
		UserVo user = new UserVo();
		user.setTotCnt(3);
		user.setYear(20);
		user.setIs_success("true");
		
		return user;
	}
	
}
