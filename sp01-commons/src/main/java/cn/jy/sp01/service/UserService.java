package cn.jy.sp01.service;

import cn.jy.sp01.pojo.User;

public interface UserService {
	//根据id查询用户
	User getUser(Integer id);
	//根据id给用户添加成绩
	void addScore(Integer id, Integer score);
}
