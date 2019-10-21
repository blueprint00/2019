package com.capstonesam.springcapstoneplzwebservice.domainForFunction;

import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "Education_info")
public class Education_info {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long education_ID;

    @Column(nullable = false, length = 45)
    private String education_name;

    @Column(nullable = false, length = 45)
    private String education_period;

    @Column(columnDefinition = "TEXT")
    private String education_content;

    @ManyToOne
    @JoinColumn(name = "user_num")
    private User_info userinfo;

    @Builder
    public Education_info(Long education_ID, String education_name, String education_period, String education_content, User_info user_info){
        this.education_ID = education_ID;
        this.education_name = education_name;
        this.education_period = education_period;
        this.education_content = education_content;
        this.userinfo = user_info;
    }
}
