package com.example.paging.service;

import com.example.paging.page.PageRequest;
import com.example.paging.page.PageResult;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 15:47 2020/2/23
 */
public interface MovieService {

    PageResult findPage(PageRequest pageRequest);
}
