package com.wangxinangs.example.controller;

import com.wangxinangs.example.dto.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxingang
 * @date 2021/6/17 14:26
 */
@RestController
@RequestMapping("/result")
public class MapResultController {

    @GetMapping("/map")
    public UserInfo result() {
        return UserInfo.builder()
                .name("张三").age(29).job("挨踢")
                .build();
    }
}
