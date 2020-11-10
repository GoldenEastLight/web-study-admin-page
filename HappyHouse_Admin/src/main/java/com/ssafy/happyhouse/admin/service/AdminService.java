package com.ssafy.happyhouse.admin.service;

import java.util.List;

import com.ssafy.happyhouse.repository.dto.HouseInfoLike;
import com.ssafy.happyhouse.repository.dto.Member;

public interface AdminService {
	List<Member> select() throws Exception;
	List<HouseInfoLike> selectHouseInfoLike() throws Exception;
}
