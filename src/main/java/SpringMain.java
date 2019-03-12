import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {

        //Answer 1
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");


        //Answer 2
        Database databaseObj = (Database) ctx.getBean("database");
        System.out.println("Name : " +databaseObj.getName() + " || Port : " +databaseObj.getPort());

    }
}
