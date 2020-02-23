package com.example.paging.dao;

import com.example.paging.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 15:44 2020/2/23
 */
@Mapper
public interface MovieMapper {

    @Select("select * from movie")
    List<Movie> pageAll();
}
