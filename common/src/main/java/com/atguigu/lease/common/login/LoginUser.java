package com.atguigu.lease.common.login;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author lhz
 * @Date 2024/6/3 19:14
 */
@Data
@AllArgsConstructor
public class LoginUser {

    private Long userId;
    private String username;
}