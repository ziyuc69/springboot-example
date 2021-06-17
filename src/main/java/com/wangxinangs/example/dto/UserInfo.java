package com.wangxinangs.example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangxingang
 * @date 2021/6/17 14:31
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private String name;
    private Integer age;
    private String job;
}
