package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mapper.ItemMapper;
import mapper.UserMapper;
import pojo.Item;
import pojo.ItemExample;
import pojo.User;
import pojo.UserExample;
import pojo.UserExample.Criteria;
import service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ItemMapper itemMapper;
	@Override
	public User findUserByUserName(User user) {
		UserExample example=new UserExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(user.getName());
		List<User> list = userMapper.selectByExample(example);
		if(list!=null &&list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	@Transactional
	public void addUser(User user) {
		userMapper.insertSelective(user);
		
	}
	@Override
	public Item findItemById(Integer itemid) {
		userMapper.selectByItemId();
		return list.get(0);
	}

}
