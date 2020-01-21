package dev.fuxing.sqw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author Fuxing Loh
 * @since 2020-01-21 at 14:53
 */
@SpringBootApplication
@Import({
        QueueConfiguration.class,
        ServiceConfiguration.class,
})
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
