package com.ssafy.happyhouse.repository.mapper;

import java.util.List;

import com.ssafy.happyhouse.repository.dto.Member;

public interface AdminMapper {
	List<Member> select();
	int visitCount10();
	int visitCount20();
	int visitCount30();
	int visitCount40();
	int visitCount50();
	int visitCount60();
}
