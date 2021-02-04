package com.jenny.settingweb_boot.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jenny.settingweb_boot.service.StatisticService;

@RestController
public class settingTest {

	@Autowired
	private StatisticService service;

	// 년도별 접속자
	@ResponseBody
	@RequestMapping("/sqlyearStatistic")
	public Map<String, Object> sqltest(String year) throws Exception {

		return service.yearloginNum(year);
	}
	
	// 월별 접속자
	@ResponseBody
	@RequestMapping("/sqlmonthStatistic")
	public Map<String, Object> sqltest1(String month) throws Exception {

		return service.MonthLoginNum(month);
	}
	
	// 일자별 접속자
	@ResponseBody
	@RequestMapping("/sqldailyStatistic")
	public Map<String, Object> sqltest2(String daily) throws Exception {

		return service.DailyLoginNum(daily);
	}
	
	// 월별 평균 하루 로그인 수
	@ResponseBody
	@RequestMapping("/sqldailyAvgStatistic")
	public Map<String, Object> sqltest3(String month) throws Exception {

		return service.DailyAvgLoginNum(month);
	}
	
	// 휴일을 제외한 월별 로그인 수
	@ResponseBody
	@RequestMapping("/sqlexcHolidayStatistic")
	public Map<String, Object> sqltest4(String yearMonth) throws Exception {
		
		return service.ExcHolidayLoginNum(yearMonth);
	}
	
	
	//부서별 접속자
	@ResponseBody
	@RequestMapping("/sqldepcodeStatistic")
	public Map<String, Object> sqltest5(String depcode) throws Exception {

		return service.DepcodeLoginNum(depcode);
	}

	// test 페이지
	@RequestMapping("/test")
	public ModelAndView test() throws Exception {
		ModelAndView mav = new ModelAndView("test");
		mav.addObject("name", "jenny");
		List<String> resultList = new ArrayList<String>();
		resultList.add("!!!HELLO WORLD!!!");
		resultList.add("설정 TEST!!!");
		resultList.add("설정 TEST!!!");
		resultList.add("설정 TEST!!!!!");
		resultList.add("설정 TEST!!!!!!");
		mav.addObject("list", resultList);
		return mav;
	}

}