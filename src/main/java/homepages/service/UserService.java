package homepages.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import homepages.mapper.UserMapper;
import homepages.model.User;


@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	
	public User getUserInfo() {
		
		User user = userMapper.findUserInfo();
		
		return user;
	}

}
