package mapper;

import java.util.List;

import pojo.UserAndItem;

public interface Item1Mapper {

	List<UserAndItem> findItemById(Integer itemid);

	List<UserAndItem> findAllItem();

	List<UserAndItem> findUserWantByUserId();

	List<UserAndItem> findItemBySellerTitle(String title);

}
