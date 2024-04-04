package com.ecomm.nhom4.Service.Repository;

import com.ecomm.nhom4.Service.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.emailUser = :emailUser")
    User findByEmail(String emailUser);

    @Query("SELECT u FROM User u WHERE u.emailUser = :email AND u.password = :password")
    User customLogin(@Param("email") String email, @Param("password") String password);
    boolean existsByEmailUser(String emailUser);
}
