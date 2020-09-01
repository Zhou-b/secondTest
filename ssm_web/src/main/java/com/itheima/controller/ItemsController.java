package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: ssm_parent
 * @description: xxx
 * @author: Mr.Zhou
 * @create: 2020-08-31 20:13
 **/
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/list")
    public String list(Model model ) {
        List<Items> list = itemsService.list();
        model.addAttribute("items",list);
        return "items";
    }
    @RequestMapping("/save")
    public String save(Items items ) {
        System.out.println(items);
        System.out.println("jrebel部署成功!");
        itemsService.insert(items);
        return "redirect:/items/list";

    }
}
