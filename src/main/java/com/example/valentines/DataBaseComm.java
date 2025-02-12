/*package com.example.valentines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class DataBaseComm{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public int insert(String name){
        String sql = "INSERT INTO inputtednames (name) VALUES (?)";
        return jdbcTemplate.update(sql, name);
    }
}
*/