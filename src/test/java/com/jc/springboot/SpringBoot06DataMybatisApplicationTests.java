package com.jc.springboot;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class SpringBoot06DataMybatisApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        System.out.println("----------------------------" + dataSource.getClass());

        final Connection connection = dataSource.getConnection();
        System.out.println("-------------------------------------" + connection);
        connection.close();
    }

}
