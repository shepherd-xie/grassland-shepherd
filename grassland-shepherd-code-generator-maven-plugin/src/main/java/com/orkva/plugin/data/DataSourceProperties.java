package com.orkva.plugin.data;

import com.mysql.cj.jdbc.MysqlDataSource;
import lombok.Data;
import org.apache.maven.plugins.annotations.Parameter;

import javax.sql.DataSource;

@Data
public class DataSourceProperties {
    @Parameter(required = true)
    private String url;
    @Parameter(required = true)
    private String username;
    @Parameter(required = true)
    private String password;

    public DataSource getDataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setUrl(url);
        mysqlDataSource.setUser(username);
        mysqlDataSource.setPassword(password);
        return mysqlDataSource;
    }

}
