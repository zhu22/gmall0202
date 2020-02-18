package com.atguigu.gmall0202.order.controller;

import com.atguigu.gmall00202.bean.UserAddress;
import com.atguigu.gmall0202.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserAddressController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> getUserAddressList(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        List<UserAddress> userAddressList = userInfoService.getUserAddressList(userId);
        return userAddressList;

    }
}
