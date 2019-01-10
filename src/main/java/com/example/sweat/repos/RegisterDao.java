package com.example.sweat.repos;

import com.example.sweat.domain.Register;


public interface RegisterDao {
      String SQL_UPDATE = "UPDATE...";
      String SQL_DELETE = "DELETE...";
      String SQL_INSERT = "INSERT INTO spring.users(" +Register.USERNAME_COLUMN + "," + Register          .PASSWORD_COLUMN+","+ Register.NICKNAME_COLUMN + ") VALUES(?,?,?)" ;

      void userUpdate(Register register);
      void userDelete(Register register);
      long userInsert(Register register) ;

}
