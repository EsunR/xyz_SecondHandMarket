package service;

import java.util.List;

import pojo.Item;
import pojo.User;
import pojo.UserAndItem;


public interface Service {

	User findUserByUserName(User user);

	void addUser(User user);

	UserAndItem findItemById(Integer itemid);

	List<Item> findAllItem();

	int addItem(Item item);

}
