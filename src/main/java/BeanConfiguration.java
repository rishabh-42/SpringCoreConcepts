import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import restaurant.Tea;

@Configuration
public class BeanConfiguration {

    @Bean
    Tea tea (){
        Tea tea = new Tea();
        tea.setPrice(55);
        return tea;
    }
}
