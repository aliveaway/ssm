package com.you.ssm.service;

import com.you.ssm.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2016/12/12.
 */
public interface UserService {
    /**
     * 查找所有用户
     *
     * @return
     * @throws Exception
     */
    List<User> findUser() throws Exception;
}
