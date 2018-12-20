package service;

import pojo.Item;
import pojo.User;


public interface Service {

	User findUserByUserName(User user);

	void addUser(User user);

	Item findItemById(Integer itemid);

}
