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
	public HashMap<String, Object> selectDailyAvgLogin(String dailyavg);
	
	// 부서별 로그인 수 
	public HashMap<String, Object> selectDepcodeLogin(String depcode);
}