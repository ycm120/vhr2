package vhr2.dao;

import java.util.List;

import vhr2.entity.Menu;

/**
 * Created by sang on 2017/12/28.
 */
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
