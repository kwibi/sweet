package com.example.sweat.Implements;

import com.example.sweat.domain.Register;
import com.example.sweat.repos.RegisterDao;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;


import java.sql.*;

@Controller
@Repository("mysql")
public class RegisterDaoImpl implements RegisterDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public long userInsert(Register register) {
        PreparedStatementCreator preparedStatementCreator = new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(SQL_INSERT, new String[] { Register.ID_COLUMN });
                ps.setString(1, register.getUsername());
                ps.setString(2, register.getUserprename());
                ps.setString(3, register.getPass());
                ps.setString(4, register.getNickname());
                ps.setString(5, register.getPhoneNumber());

                return ps;
            }
        };
        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(preparedStatementCreator, holder);
        return holder.getKey().longValue();

    }

    @Override
    public void userUpdate(Register register) {

    }

    @Override
    public void userDelete(Register register) {

    }


}
