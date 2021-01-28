package com.jenny.settingweb_boot.service;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jenny.settingweb_boot.dao.StatisticMapper;

@Service
public class StatisticServiceImpl implements StatisticService {

	@Autowired
	private StatisticMapper uMapper;

	// 년도별 접속자 수
	@Override
	public HashMap<String, Object> yearloginNum(String year) {
		// TODO Auto-generated method stub
		HashMap<String, Object> retVal = new HashMap<String, Object>();

		try {
			retVal = uMapper.selectYearLogin(year);
			retVal.put("year", year);
			retVal.put("is_success", true);

		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("year", year);
			retVal.put("is_success", false);
		}
		return retVal;
	}

	// 월별 접속자 수
	@Override
	public HashMap<String, Object> MonthLoginNum(String month) {
		HashMap<String, Object> retVal1 = new HashMap<String, Object>();

		try {
			retVal1 = uMapper.selectMonthLogin(month);
			retVal1.put("month", month);
			retVal1.put("is_success", true);
		} catch (Exception e) {
			retVal1.put("totCnt", -999);
			retVal1.put("month", month);
			retVal1.put("is_success", false);
		}
		return retVal1;
	}
	
	// 일별 접속자 수
	@Override
	public HashMap<String, Object> DailyLoginNum(String daily) {
		HashMap<String, Object> retVal2 = new HashMap<String, Object>();
		
		try {
			retVal2 = uMapper.selectDailyLogin(daily);
			retVal2.put("daily", daily);
			retVal2.put("is_success", true);
		} catch (Exception e) {
			retVal2.put("totCnt", -999);
			retVal2.put("daily", daily);
			retVal2.put("is_success", false);
		}
		return retVal2;
	}
	
	// 평균 하루 로그인 수 
	@Override
	public HashMap<String, Object> DailyAvgLoginNum(String dailyavg) {
		HashMap<String, Object> retVal3 = new HashMap<String, Object>();
		
		try {
			retVal3 = uMapper.selectDailyLogin(dailyavg);
			retVal3.put("dailyAvg", dailyavg);
			retVal3.put("is_success", true);
		} catch (Exception e) {
			retVal3.put("totCnt", -999);
			retVal3.put("dailyAvg", dailyavg);
			retVal3.put("is_success", false);
		}
		return retVal3;
	}
	
	// 부서별 접속자 수
	@Override
	public HashMap<String, Object> DepcodeLoginNum(String depcode) {
		HashMap<String, Object> retVal4 = new HashMap<String, Object>();
		
		try {
			retVal4 = uMapper.selectDepcodeLogin(depcode);
			retVal4.put("depcode", depcode);
			retVal4.put("is_success", true);
		} catch (Exception e) {
			retVal4.put("totCnt", -999);
			retVal4.put("depcode", depcode);
			retVal4.put("is_success", false);
		}
		return retVal4;
	}
	
}
