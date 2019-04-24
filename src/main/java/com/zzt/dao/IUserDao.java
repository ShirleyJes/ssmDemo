package com.zzt.dao;

import com.zzt.model.User;

public interface IUserDao {

    User selectUser(long id);
}
