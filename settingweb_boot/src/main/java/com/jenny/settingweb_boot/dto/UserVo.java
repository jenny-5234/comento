package com.jenny.settingweb_boot.dto;

public class UserVo {
	private int totCnt;
	private int year;
	private String is_success;
	
	public int getTotCnt() {
		return totCnt;
	}
	public void setTotCnt(int totCnt) {
		this.totCnt = totCnt;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getIs_success() {
		return is_success;
	}
	public void setIs_success(String is_success) {
		this.is_success = is_success;
	}
	
	@Override
	public String toString() {
		return "UserVo [totCnt=" + totCnt + ", year=" + year + ", is_success=" + is_success + "]" ;
	}

}
