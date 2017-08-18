package cn.itcast.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	
	
	@Autowired
	private UserMapper userMapper;
	
	
	public void saveUser(User user) {
		
		userMapper.saveUser(user);
		//int i=1/0;
	}
	
}
