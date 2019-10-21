package com.capstonesam.springcapstoneplzwebservice.domainForFunction;

import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.stream.Stream;

public interface Hackathon_info_Repository extends JpaRepository<Hackathon_info, Long> {
//    Stream<Hackathon_info> findByUserinfo(User_info user_info);

    @Query(value = "SELECT * FROM hackathon_info h where h.user_num = :user_num ", nativeQuery = true)
    Stream<Hackathon_info> findHackathon(@Param("user_num")Long user_num);


    @Query(value ="SELECT COUNT(hack_ID) FROM hackathon_info h WHERE h.user_num=:usernum", nativeQuery = true)
    long CountHackathon(@Param("usernum")Long user_num);

    @Query(value ="SELECT COUNT(hack_record) FROM hackathon_info h WHERE h.user_num=:usernum", nativeQuery = true)
    long CountHackathonwithRecord(@Param("usernum")Long user_num);

}
