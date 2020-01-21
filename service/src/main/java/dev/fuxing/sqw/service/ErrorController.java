package dev.fuxing.sqw.service;

import dev.fuxing.err.RateLimitException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fuxing Loh
 * @since 2020-01-21 at 18:42
 */
@RestController
public class ErrorController {

    @GetMapping("/error/RateLimitException")
    public void rate() {
        throw new RateLimitException();
    }

    @GetMapping("/error/RuntimeException")
    public void runtime() {
        throw new RuntimeException();
    }
}
