package service;

import java.util.List;

import pojo.Item;
import pojo.User;
import pojo.UserAndItem;
import pojo.Want;


public interface Service {

	User findUserByUserName(User user);

	void addUser(User user);

	UserAndItem findItemById(Integer itemid);

	List<UserAndItem> findAllItem();

	int addItem(Item item);

	void userUpdate(User user);

	void addWant(Want want);

	List<Item> findItemBySellerId(Integer userid);

	List<UserAndItem> findUserWantByUserId(Integer userid);

	List<UserAndItem> findItemBySellerTitle(String title);

}
