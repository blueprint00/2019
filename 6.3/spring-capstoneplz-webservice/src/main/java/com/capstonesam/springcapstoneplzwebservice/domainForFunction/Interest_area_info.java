package com.capstonesam.springcapstoneplzwebservice.domainForFunction;

import javax.persistence.*;

import com.capstonesam.springcapstoneplzwebservice.domain.Login.User_info;
import lombok.*;

import java.util.stream.Stream;

/*
 *@Author : Ayeon
 *@Date : 2019.05.05
 *@Description : Interest_area_info table object //관심 분야 정보
*/

@NoArgsConstructor
@Getter
@Entity
//@Table(name = "interest_area_info")
public class Interest_area_info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long interest_area_ID;

	@Column(nullable = false, length=45)
	private String interest_area_1;

	@Column(nullable = false, length=45)
	private String interest_area_2;

	@Column(nullable = false, length=45)
	private String interest_area_3;

	@ManyToOne
	@JoinColumn(name = "user_num")
	private User_info userinfo;

	@Builder
	public Interest_area_info(String interest_area_1, String interest_area_2, String interest_area_3, User_info user_info){
		this.interest_area_1 = interest_area_1;
		this.interest_area_2 = interest_area_2;
		this.interest_area_3 = interest_area_3;
		this.userinfo=user_info;
	}

}
