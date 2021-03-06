package com.maciekbulanda.h2test.config;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;
@Configuration
public class H2Config {
    @Bean(initMethod = "start", destroyMethod = "stop")
    Server createServer() throws SQLException {
        return Server.createTcpServer("-tcp");
    }
}
