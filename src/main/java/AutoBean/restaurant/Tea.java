package AutoBean.restaurant;

import org.springframework.stereotype.Service;

@Service
public class Tea implements HotDrink {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void prepareHotDrink() {
        System.out.println("Preparing Tea, price : "+price);

    }
}
