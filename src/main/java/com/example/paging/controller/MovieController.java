package com.example.paging.controller;

import com.example.paging.page.PageRequest;
import com.example.paging.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 15:57 2020/2/23
 */
@RestController
public class MovieController {

    @Autowired
    private MovieServiceImpl movieService;

    @PostMapping("/pageAll")
    public Object findPage(@RequestBody PageRequest pageQuery){
        return movieService.findPage(pageQuery);
    }
}
