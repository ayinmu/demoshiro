package com.example.demoshiro.service.impl;

import com.example.demoshiro.entity.UserInfo;
import com.example.demoshiro.repository.UserInfoRepository;
import com.example.demoshiro.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author HQ
 * @ClassNama UserInfoServiceImpl
 * @date 2018/7/8
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoRepository.findByUsername(username);
    }
}
