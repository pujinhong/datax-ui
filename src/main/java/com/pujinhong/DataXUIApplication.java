package com.pujinhong;

import java.net.InetAddress;
import java.net.UnknownHostException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@Slf4j
@SpringBootApplication
public class DataXUIApplication extends SpringBootServletInitializer {

        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(DataXUIApplication.class);
        }

        public static void main(String[] args) throws UnknownHostException {
                ConfigurableApplicationContext application = SpringApplication.run(DataXUIApplication.class, args);
                Environment env = application.getEnvironment();
                String ip = InetAddress.getLocalHost().getHostAddress();
                String port = env.getProperty("server.port");
                log.info("datax-ui started, ip:"+ ip+ " port:"+port);

        }

}
