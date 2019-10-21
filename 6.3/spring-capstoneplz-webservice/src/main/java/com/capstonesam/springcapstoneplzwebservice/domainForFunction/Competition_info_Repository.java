package com.capstonesam.springcapstoneplzwebservice.domainForFunction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.stream.Stream;

public interface Competition_info_Repository extends JpaRepository<Competition_info, Long> {

    @Query(value = "SELECT competition_id, competition_name, competition_score, competition_date, user_num FROM competition_info c where c.user_num = :user_num ", nativeQuery = true)
    Stream<Competition_info> findCompetition(@Param("user_num")Long user_num);

    @Query(value = "SELECT competition_id, competition_name, competition_score, competition_date, user_num FROM competition_info c where c.user_num = :user_num and c.competition_name = :competition_name", nativeQuery = true)
    Stream<Competition_info> findCompetitionWithCompetitionName(@Param("user_num")Long user_num,@Param("competition_name")String competition_name);//이수성적 모니터링 페이지 내 그래프 중 C언어인증


    @Query(value ="SELECT COUNT(competition_ID) FROM competition_info c WHERE c.user_num=:usernum", nativeQuery = true)
    long CountCompetition(@Param("usernum")Long user_num);


//  long countByUserinfo(User_info user_info);
}
