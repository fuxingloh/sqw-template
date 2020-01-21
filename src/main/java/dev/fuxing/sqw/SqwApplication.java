package dev.fuxing.sqw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author Fuxing Loh
 * @since 2020-01-21 at 17:05
 */
@SpringBootApplication
@Import({
        QueueConfiguration.class,
        ServiceConfiguration.class,
})
public class SqwApplication {
    public static void main(String[] args) {
        SpringApplication.run(SqwApplication.class, args);
    }
}
