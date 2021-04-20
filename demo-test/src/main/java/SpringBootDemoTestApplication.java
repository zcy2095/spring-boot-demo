import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zcy")
public class SpringBootDemoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoTestApplication.class, args);
    }
}
