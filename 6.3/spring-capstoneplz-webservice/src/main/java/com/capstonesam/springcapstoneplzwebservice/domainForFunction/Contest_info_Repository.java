package com.capstonesam.springcapstoneplzwebservice.domainForFunction;

import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.stream.Stream;

public interface Contest_info_Repository extends JpaRepository<Contest_info, Long> {
//    Stream<Contest_info> findByUserinfo(User_info user_info);

    @Query(value = "SELECT * FROM contest_info c where c.user_num = :user_num ", nativeQuery = true)
    Stream<Contest_info> findContest(@Param("user_num")Long user_num);


    @Query(value ="SELECT COUNT(contest_ID) FROM contest_info c WHERE c.user_num=:usernum", nativeQuery = true)
    long CountContest(@Param("usernum")Long user_num);

    @Query(value ="SELECT COUNT(contest_record) FROM contest_info c WHERE c.user_num=:usernum", nativeQuery = true)
    long CountContestwithRecord(@Param("usernum")Long user_num);

}
