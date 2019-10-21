package com.capstonesam.springcapstoneplzwebservice.domainForFunction;

import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@NoArgsConstructor
@Getter
@Entity
@Table(name="competition_info")
public class Competition_info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long competition_ID;
    @Column(nullable = false, length = 45)
   private String competition_name;
    @Column(nullable = false, length = 45)
    private Integer competition_score;
    @Column(nullable = false)
    private Date competition_date;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "user_num")
    private User_info userinfo;


    @Builder//construct 생성자??
    public Competition_info(String competition_name, Integer competition_score, Date competition_date, User_info user_info) {
        //this.user_num=user_num;
        //this.competition_ID= competition_ID;
      this.competition_name = competition_name;
        this.competition_score = competition_score;
        this.competition_date = competition_date;
        this.userinfo= user_info;


    }
}