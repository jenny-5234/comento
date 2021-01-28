package com.jenny.dao;

import java.util.List;

import com.jenny.vo.MovieVO;
 
public interface MovieDAO {
    
    public List<MovieVO> selectMovie() throws Exception;
}