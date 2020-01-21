package dev.fuxing.sqw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Fuxing Loh
 * @since 2020-01-21 at 17:36
 */
@EnableWebMvc
@Configuration
public class ServiceConfiguration {

    private final DispatcherServlet servlet;

    @Autowired
    public ServiceConfiguration(DispatcherServlet servlet) {
        this.servlet = servlet;
    }

    @Bean
    public CommandLineRunner getCommandLineRunner(ApplicationContext context) {
        servlet.setThrowExceptionIfNoHandlerFound(true);
        return args -> {
        };
    }
}
