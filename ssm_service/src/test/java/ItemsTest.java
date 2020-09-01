import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @program: ssm_parent
 * @description: xxx
 * @author: Mr.Zhou
 * @create: 2020-08-31 19:16
 **/
public class ItemsTest {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemsService = classPathXmlApplicationContext.getBean("itemsServiceImpl", ItemsService.class);
        Items items = new Items();
        items.setName("Python");
        items.setPrice(15F);
        items.setCreatetime(new Date());
        items.setDetail("天天向上");
        List<Items> lists = itemsService.list();
        for (Items list : lists) {
            System.out.println(list);
        }
        itemsService.insert(items);
    }
}
