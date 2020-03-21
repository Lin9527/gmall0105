package com.atguigu.gmall.gmalluser.controller;


import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    //查询所有 ums-Member
    @RequestMapping("getUserAll")
    @ResponseBody
    public List<UmsMember> getUserAll(){
        List<UmsMember> userAll = userService.getUserAll();
        return userAll;
    }

    @RequestMapping("getReceiveAddressByMember")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMember(BigInteger memberId){
        List<UmsMemberReceiveAddress> umra = userService.getReceiveAddressByMember(memberId);
        return umra;
    }


}
