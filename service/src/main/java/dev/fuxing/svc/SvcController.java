package dev.fuxing.svc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Fuxing Loh
 * @since 2020-01-21 at 15:08
 */
@RestController
public class SvcController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/named")
    public SvcObject named(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new SvcObject(counter.incrementAndGet(), String.format(template, name));
    }

}
