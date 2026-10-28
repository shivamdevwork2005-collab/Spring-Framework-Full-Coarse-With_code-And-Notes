package in.strikes;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {

    OrderService orderService;

    public PaymentService(OrderService orderService) {
        this.orderService = orderService;
    }

    public void pay() {
        System.out.println("Payment successful");

        orderService.getOrderDetails();
    }
}
