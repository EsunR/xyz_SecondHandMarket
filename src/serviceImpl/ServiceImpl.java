package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mapper.Item1Mapper;
import mapper.ItemMapper;
import mapper.UserMapper;
import pojo.Item;
import pojo.ItemExample;
import pojo.User;
import pojo.UserAndItem;
import pojo.UserExample;
import pojo.UserExample.Criteria;
import service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ItemMapper itemMapper;
	@Autowired 
	private Item1Mapper item1Mapper;
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
	public UserAndItem findItemById(Integer itemid) {
		List<UserAndItem> list=item1Mapper.findItemById(itemid);
		return list.get(0);
	}
	@Override
	public List<UserAndItem> findAllItem() {
		ItemExample example=new ItemExample();
		List<UserAndItem> list = item1Mapper.findAllItem();
		return list;
	}
	@Transactional
	public int addItem(Item item) {
		 itemMapper.insertSelective(item);
		int ss= item.getId();
		return ss;
		
	}

}
