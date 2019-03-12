package restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Restaurant {

    @Autowired
    private HotDrink hotDrink;



    @Autowired
//    @Qualifier("hotDrinkQualifier")
    private HotDrink hotDrinkQuali;

    public HotDrink getHotDrinkQuali() {
        return hotDrinkQuali;
    }

    @Autowired
    public void setHotDrinkQuali(@Qualifier("hotDrinkQualifierMethod") HotDrink hotDrinkQuali) {
        this.hotDrinkQuali = hotDrinkQuali;
    }


    public Restaurant() {


    }

    @Autowired
    public Restaurant( @Qualifier("hotDrinkQualifierConstructor") HotDrink hotDrink) {

        this.hotDrink = hotDrink;
    }

    public HotDrink getHotDrink() {
        return hotDrink;
    }

//Uncomment line 29 for 8th answer
    //    @Required

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        //getting hotDrink restaurnat
        Restaurant tea = (Restaurant) ctx.getBean("teaRestaurant");
        tea.hotDrink.prepareHotDrink();

        //getting expressTeaRestaurant , inner bean
        Restaurant expressTea = (Restaurant) ctx.getBean("expressTeaRestaurant");
        expressTea.hotDrink.prepareHotDrink();


        //ANSWER 6

        //byName
        Restaurant byNameTea = (Restaurant) ctx.getBean("restaurantName");
        byNameTea.hotDrink.prepareHotDrink();

        //byType
        Restaurant byTypeTea = (Restaurant) ctx.getBean("restaurantType");
        byNameTea.hotDrink.prepareHotDrink();

        //        byConstructor
        Restaurant byConsTea = (Restaurant) ctx.getBean("teaConstructor");
        byNameTea.hotDrink.prepareHotDrink();

        //        END---------END ANSWER 6


        //After prototype
        System.out.println("After Prototype");
        Restaurant tea1 = (Restaurant) ctx.getBean("teaRestaurant");

        System.out.println(tea);
        System.out.println(tea1);


        //Answer 9
        //Using Qualifier
        // Uncomment "@Qualifier" at different places to see different result
        Restaurant byQuali = (Restaurant) ctx.getBean("resQualifier");
        byNameTea.hotDrinkQuali.prepareHotDrink();




    }
}
