package mapper;

import java.util.List;

import pojo.UserAndItem;

public interface Item1Mapper {

	List<UserAndItem> findItemById(Integer itemid);

}
