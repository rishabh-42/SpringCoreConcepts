package AutoBean.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class Restaurant {

    @Autowired
            @Qualifier("tea")
    HotDrink hotDrink;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        Tea tea = ctx.getBean("tea",Tea.class);
        tea.setPrice(43);

        Restaurant restaurant = ctx.getBean("restaurant",Restaurant.class);

        restaurant.hotDrink.prepareHotDrink();



    }
}
