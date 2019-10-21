package com.capstonesam.springcapstoneplzwebservice.domainForFunction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface Education_info_Repository extends JpaRepository<Education_info, Long> {

//    List<Education_info> findByUserinfo(Long usernum);

    @Query(value = "SELECT * FROM education_info e where e.user_num = :user_num ", nativeQuery = true)
    Stream<Education_info> findEducation(@Param("user_num")Long user_num);

    @Query(value ="SELECT COUNT(education_ID) FROM education_info e WHERE e.user_num=:usernum", nativeQuery = true)
    long CountEducation(@Param("usernum")Long user_num);

    @Query(value ="SELECT COUNT(education_ID) FROM education_info e WHERE e.user_num=:usernum and e.education_period=:education_period", nativeQuery = true)
    long CountEducationwithPeriod(@Param("usernum")Long user_num, @Param("education_period")String education_period);

}
