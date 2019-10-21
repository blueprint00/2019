package com.capstonesam.springcapstoneplzwebservice.domainForFunction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.stream.Stream;

public interface Interest_area_info_Repository extends JpaRepository<Interest_area_info, Long> {

    @Query(value = "SELECT * FROM interest_area_info i where i.user_num = :user_num ", nativeQuery = true)
    Stream<Interest_area_info> findInteretArea(@Param("user_num")Long user_num);

    @Query(value = "SELECT interest_area_1 FROM interest_area_info i where i.user_num = :user_num ", nativeQuery = true)
    String findMostInteretArea(@Param("user_num")Long user_num);

    @Query(value = "SELECT user_num FROM interest_area_info i where i.interest_area_1 = :interest_area_1 ", nativeQuery = true)
    Stream<Long> findUser1(@Param("interest_area_1")String interest_area);

    @Query(value = "SELECT user_num FROM interest_area_info i where i.interest_area_2 = :interest_area_2 ", nativeQuery = true)
    Stream<Long> findUser2(@Param("interest_area_2")String interest_area);

    @Query(value = "SELECT user_num FROM interest_area_info i where i.interest_area_3 = :interest_area_3 ", nativeQuery = true)
    Stream<Long> findUser3(@Param("interest_area_3")String interest_area);

}
