package in.strikes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appConfig.xml");

        // get bean by id/name
        //OrderService orderService = (OrderService) context.getBean("orderService");

         //get bean by type
        //OrderService orderService = context.getBean(OrderService.class);

//        OrderService orderService =
//                context.getBean("orderService" ,OrderService.class);
//
//        orderService.placeOrder();

        UserService user = context.getBean(UserService.class);

        context.close();
    }
}