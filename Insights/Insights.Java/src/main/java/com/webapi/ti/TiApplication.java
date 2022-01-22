package com.webapi.ti;

import java.util.Properties;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.webapi.insightsengine.proxy")
public class TiApplication {

	public static void main(String[] args) {

        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(TiApplication.class);
        springApplicationBuilder.sources(TiApplication.class)
                .properties(getProperties())
                .run(args);
    }

    static Properties getProperties() {
        Properties props = new Properties();
        //for linux
//        props.put("spring.config.additional-location", "/app/config/TI-REGISTRATION-SERVICE/");
        //for Windows
        props.put("spring.config.additional-location", "../../Insights/cfg/");
        props.put("spring.config.name", "appconfig");

        return props;
    }
}
