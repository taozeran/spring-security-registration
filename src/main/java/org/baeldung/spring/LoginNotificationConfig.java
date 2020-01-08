package org.baeldung.spring;

import com.maxmind.geoip2.DatabaseReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import ua_parser.Parser;

import java.io.IOException;

@Configuration
public class LoginNotificationConfig {

    @Bean
    public Parser uaParser() throws IOException {
        return new Parser();
    }

    @Bean
    public DatabaseReader databaseReader(ResourceLoader resourceLoader) throws IOException {
        Resource resource = resourceLoader
                .getResource("classpath:maxmind/GeoLite2-City.mmdb");
        return new DatabaseReader.Builder(resource.getInputStream())
                .build();
    }
}
