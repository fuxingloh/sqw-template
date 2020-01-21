package dev.fuxing.sqw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

/**
 * @author Fuxing Loh
 * @since 2020-01-21 at 15:53
 */
@SpringBootApplication
@Import({
        QueueConfiguration.class,
})
public class WorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkerApplication.class, args);
    }

}
