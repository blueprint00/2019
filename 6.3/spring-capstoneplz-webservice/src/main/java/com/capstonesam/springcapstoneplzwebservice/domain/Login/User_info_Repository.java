package com.capstonesam.springcapstoneplzwebservice.domain.Login;

import com.capstonesam.springcapstoneplzwebservice.DTO.FilterResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;


//@Repository
public interface User_info_Repository extends JpaRepository<User_info, Long> {

    @Query(value = "SELECT user_name, user_num FROM user_info u where u.user_major= :user_major ", nativeQuery = true)
    Stream<User_info> findmajor(@Param("user_major")String user_major);

    @Query(value = "SELECT user_name, user_num FROM user_info where user_admyear= :user_admyear ", nativeQuery = true)
    Stream<User_info> findadmyear(@Param("user_admyear")String user_admyear);

}

