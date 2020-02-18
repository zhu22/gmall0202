package com.atguigu.gmall0202.service;

import com.atguigu.gmall00202.bean.UserAddress;
import com.atguigu.gmall00202.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> getUserInfoList();
    //跟进userId查询用户地址列表
    List<UserAddress> getUserAddressList(String userId);
}
