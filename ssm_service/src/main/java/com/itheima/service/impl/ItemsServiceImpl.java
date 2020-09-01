package com.itheima.service.impl;
import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * @program: ssm_parent
 * @description: xxx
 * @author: Mr.Zhou
 * @create: 2020-08-31 19:48
 **/
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<Items> list() {
        return itemsDao.list();
    }
    @Override
    public void insert(Items items) {
        itemsDao.insert(items);
    }
}