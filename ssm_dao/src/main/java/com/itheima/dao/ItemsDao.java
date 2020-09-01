package com.itheima.dao;
import com.itheima.pojo.Items;
import java.util.List;
public interface ItemsDao {
    /**
     * 查询所有商品列表
     *
     * @return
     */
    List<Items> list();
    /**
     * 添加商品
     *
     * @param items
     */
    void insert(Items items);
}