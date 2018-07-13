package com.example.demoshiro.repository;

import com.example.demoshiro.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * @author HQ
 * @InterfaceName UserInfoRepository
 * @date 2018/7/8
 */
public interface UserInfoRepository extends CrudRepository<UserInfo,Long> {
    //通过username查找用户信息
    public UserInfo findByUsername(String username);
}
