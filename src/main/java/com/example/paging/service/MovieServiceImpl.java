package com.example.paging.service;

import com.example.paging.dao.MovieMapper;
import com.example.paging.entity.Movie;
import com.example.paging.page.PageRequest;
import com.example.paging.page.PageResult;
import com.example.paging.page.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 15:53 2020/2/23
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest,getPageInfo(pageRequest));
    }

    /*调用分页插件完成分页*/
    private PageInfo<Movie> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Movie> sysMenus = movieMapper.pageAll();
        return new PageInfo<Movie>(sysMenus);
    }
}
