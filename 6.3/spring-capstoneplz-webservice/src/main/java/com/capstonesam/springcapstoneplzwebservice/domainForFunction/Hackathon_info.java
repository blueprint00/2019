package com.capstonesam.springcapstoneplzwebservice.domainForFunction;

import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Hackathon_info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long hack_ID;

    @Column(nullable = false, length = 45)
    private String hack_topic;

    @Column(nullable = false, length=45)
    private String hack_record;

    @Column(nullable = false)
    private Long hack_doc_ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_num")
    private User_info userinfo;


    @Builder
    public Hackathon_info(String hack_topic, String hack_record, Long hack_doc_ID, User_info user_info){
        this.hack_topic = hack_topic;
        this.hack_record = hack_record;
        this.hack_doc_ID = hack_doc_ID;
        this.userinfo=user_info;
    }

}
