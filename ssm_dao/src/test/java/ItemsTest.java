
import java.util.Date;
import java.util.List;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: ssm_parent
 * @description: xxx
 * @author: Mr.Zhou
 * @create: 2020-08-31 19:16
 **/
public class ItemsTest {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = classPathXmlApplicationContext.getBean("itemsDao", ItemsDao.class);
        Items items = new Items();
        items.setName("java");
        items.setPrice(20F);
        items.setCreatetime(new Date());
        items.setDetail("天天向上");
        List<Items> lists = itemsDao.list();
        for (Items list : lists) {
            System.out.println(list);
        }
        itemsDao.insert(items);
    }
}
