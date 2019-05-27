package com.lsheng.boo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lsheng.boo.entity.User;

import java.util.List;

/**
 * User 表数据服务层接口
 */
public interface IUserService extends IService<User> {

    public List<User> selectListBySQL();

    public List<User> selectListByWrapper(Wrapper wrapper);
}