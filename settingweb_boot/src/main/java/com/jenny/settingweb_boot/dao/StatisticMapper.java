package com.jenny.settingweb_boot.dao;

import java.util.HashMap;

public interface StatisticMapper {

	// 년도별 로그인 수 
	public HashMap<String, Object> selectYearLogin(String year);
	
	// 월별 로그인 수 
	public HashMap<String, Object> selectMonthLogin(String month);

	// 일자별 로그인 수 
	public HashMap<String, Object> selectDailyLogin(String daily);
	
	// 일별 평균 로그인 수 
	public HashMap<String, Object> selectDailyAvgLogin(String month);
	
	// 휴일을 제외한 월별 로그인 수
	public HashMap<String, Object> selectExcHolidayLogin(String yearMonth);
	
	// 부서별 월별 로그인 수 
	public HashMap<String, Object> selectDeptcodeLogin(String deptcode, String yearMonth);


}