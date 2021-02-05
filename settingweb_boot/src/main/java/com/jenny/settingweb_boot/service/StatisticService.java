package com.jenny.settingweb_boot.service;

import java.util.HashMap;

public interface StatisticService {
	// 년도별 로그인 수
	public HashMap<String, Object> yearloginNum(String year);

	// 월별 로그인 수
	public HashMap<String, Object> MonthLoginNum(String month);

	// 일자별 로그인 수
	public HashMap<String, Object> DailyLoginNum(String daily);

	// 일별 평균 로그인 수
	public HashMap<String, Object> DailyAvgLoginNum(String month);
	
	// 휴일을 제외한 월별 로그인 수
	public HashMap<String, Object> ExcHolidayLoginNum(String yearMonth);

	// 부서별 로그인 수
	public HashMap<String, Object> DeptcodeLoginNum(String deptcode, String yearMonth);

}