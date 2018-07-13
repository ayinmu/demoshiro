package com.example.demoshiro.service;

import com.example.demoshiro.entity.UserInfo;

/**
 * @author HQ
 * @InterfaceName UserInfoService
 * @date 2018/7/8
 */
public interface UserInfoService {
    //通过uaername查找用户信息
    public UserInfo findByUsername(String username);
}
