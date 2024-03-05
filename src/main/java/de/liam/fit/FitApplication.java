package de.liam.fit;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication

public class FitApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FitApplication.class, args);
    }

}
