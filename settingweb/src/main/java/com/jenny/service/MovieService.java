package com.jenny.service;

import java.util.List;

import com.jenny.vo.MovieVO;
 
public interface MovieService {
    
    public List<MovieVO> selectMovie() throws Exception;
}
 