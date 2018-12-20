package service;

import java.util.List;

import pojo.Item;
import pojo.User;


public interface Service {

	User findUserByUserName(User user);

	void addUser(User user);

	Item findItemById(Integer itemid);

	List<Item> findAllItem();

}
