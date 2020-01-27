package com.orkva.plugin.service;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class DataAccessService {

    public void foo(String jdbcURL, String jdbcUser, String jdbcPassword) {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setUrl(jdbcURL);
        mysqlDataSource.setUser(jdbcUser);
        mysqlDataSource.setPassword(jdbcPassword);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(mysqlDataSource);
        String sql = "SELECT * FROM information_schema.TABLES WHERE TABLE_NAME = 'tb_sys_menu'";
        Map<String, Object> map = jdbcTemplate.queryForMap(sql);
        map.entrySet().forEach(System.out::println);
    }

}
