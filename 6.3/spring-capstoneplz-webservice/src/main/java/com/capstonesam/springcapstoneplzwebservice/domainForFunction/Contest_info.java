package com.capstonesam.springcapstoneplzwebservice.domainForFunction;

import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Contest_info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contest_ID;

    @Column(nullable = false, length = 45)
    private String contest_topic;


    @Column(nullable = false, length=45)
    private String contest_record;

    @Column(nullable = false)
    private Long contest_doc_ID;

    @Column(nullable = false, length=45)
    private String planguage_name;
    //fk

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "user_num")
    private User_info userinfo;

    @Builder
    public Contest_info(String contest_topic, String contest_record, Long contest_doc_ID, String planguage_name, User_info user_info){
        this.contest_topic = contest_topic;
        this.contest_record = contest_record;
        this.contest_doc_ID = contest_doc_ID;
        this.planguage_name = planguage_name;
        this.userinfo=user_info;

    }

}
