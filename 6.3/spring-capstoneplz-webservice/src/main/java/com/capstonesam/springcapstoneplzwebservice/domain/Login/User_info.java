package com.capstonesam.springcapstoneplzwebservice.domain.Login;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;



@NoArgsConstructor //기본 생성자
@Getter
@Entity
public class User_info {
    @Id
    @GeneratedValue
    private  Long user_num;

    @Column(nullable = false, length = 45)
    private String user_name;
    @Column(nullable = false, length = 45)
    private String user_pw;
    @Column(nullable = false, length = 10)
    private String user_admyear;
    @Column(nullable = false, length = 30)
    private String user_major;
    @Column(nullable = false, length = 45)
    private String user_type;

    //for 로그인 유지를 위해서 추가하는 세션 항목
    //@Column(nullable = false, length = 50, columnDefinition = "none")
   // private String session_key;

    //@Column
    //private session_limit;

    @Builder//construct 생성자??
    public User_info(Long user_num, String user_name, String user_pw, String user_admyear, String user_major, String user_type) {
        this.user_num=user_num;
        this.user_name= user_name;
        this.user_pw = user_pw;
        this.user_admyear = user_admyear;
        this.user_major = user_major;
        this.user_type = user_type;

    }
    @Builder//construct 생성자??
    public User_info(Long user_num, String user_name) {
        this.user_num=user_num;
        this.user_name= user_name;

    }


}
