package AutoBean.restaurant;

import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service
public class ExpressTea implements HotDrink {

    private int price;
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing ExpressTea, price : "+price);

    }
}
