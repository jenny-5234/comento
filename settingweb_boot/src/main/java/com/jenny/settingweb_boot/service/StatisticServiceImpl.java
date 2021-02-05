package com.jenny.settingweb_boot.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.io.*;

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
		HashMap<String, Object> retVal = new HashMap<String, Object>();

		try {
			retVal = uMapper.selectMonthLogin(month);
			retVal.put("month", month);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("month", month);
			retVal.put("is_success", false);
		}
		return retVal;
	}

	// 일별 접속자 수
	@Override
	public HashMap<String, Object> DailyLoginNum(String daily) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();

		try {
			retVal = uMapper.selectDailyLogin(daily);
			retVal.put("daily", daily);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("daily", daily);
			retVal.put("is_success", false);
			e.printStackTrace();
		}
		return retVal;
	}

	// 월별 평균 하루 로그인 수
	@Override
	public HashMap<String, Object> DailyAvgLoginNum(String month) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();

		try {
			retVal = uMapper.selectDailyAvgLogin(month);
			retVal.put("month", month);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("dailyAvgLogin", -999);
			retVal.put("month", month);
			retVal.put("is_success", false);
			e.printStackTrace();
		}
		return retVal;
	}

	// 휴일을 제외한 로그인 수
	@Override
	public HashMap<String, Object> ExcHolidayLoginNum(String yearMonth) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();

		try {
			retVal = uMapper.selectExcHolidayLogin(yearMonth);
			retVal.put("yearMonth", yearMonth);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("yearMonth", yearMonth);
			retVal.put("is_success", false);
		}
		return retVal;

	}

	// 부서별 접속자 수
	@Override
	public HashMap<String, Object> DeptcodeLoginNum(String deptcode, String yearMonth) {
		HashMap<String, Object> retVal = new HashMap<String, Object>();

		try {
			retVal = uMapper.selectDeptcodeLogin(deptcode, yearMonth);
			retVal.put("deptcode", deptcode);
			retVal.put("yearMonth", yearMonth);
			retVal.put("is_success", true);
		} catch (Exception e) {
			retVal.put("totCnt", -999);
			retVal.put("deptcode", deptcode);
			retVal.put("yearMonth", yearMonth);
			retVal.put("is_success", false);
		}
		return retVal;
	}

//	// txt 파일을 읽어 DB에 insert
//	public static void main(String[] args) throws Exception {
//		String Hnum, Hdate, Hname;
//
//		PreparedStatement pstmt = null;
//
//		try {
//			//파일 경로 (인코딩 x)
//			File file = new File("C:\\Users\\jenny\\OneDrive\\바탕 화면\\Holiday.txt");
//			// 입력 스트림 생성
//			FileReader filereader = new FileReader(file);
//			// 입력 버퍼 생성
//			BufferedReader bufReader = new BufferedReader(filereader);
//
//			// DB 정보 입력
//			Class.forName("org.mariadb.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/statistc?user=root&password=753421");
//	
//			// DB 연결 실패
//			if (conn == null) {
//				System.out.println("DB 연결 실패");
//			} else {
//				System.out.println("DB 연결");
//
//				// insert 쿼리
//				String sql = "INSERT INTO holiday(Hnum, Hdate) values (?,?)";
//
//				pstmt = conn.prepareStatement(sql);
//
//				String s;
//
//				while ((s = bufReader.readLine()) != null) {
//					
//					// txt 파일 내용을 탭으로 구분하여 분리
//					String[] split = s.split("\t");
//
//					Hnum = split[0];
//					Hdate = split[1];
////					Hname = split[2];
//
////				System.out.println(Hnum);
////				System.out.println(Hdate.substring(3));
////				System.out.println(Hname);
//					pstmt.setString(1, split[0]);
//					pstmt.setString(2, split[1]);
////					pstmt.setString(3, split[2]);
//
//					pstmt.executeUpdate();
//				}
//				System.out.println("DB insert success");
//
//				pstmt.close();
//				conn.close();
//				bufReader.close();
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
