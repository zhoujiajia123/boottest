package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.entry.Admin;

@Mapper
public interface AdminDao {
	public Admin loginCheck(String id);
}
