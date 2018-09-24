package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.entry.Student;

@Service
public class StudentService {
	@Resource
	private StudentDao studentDao;	
		
	public Map<String, Object> PageShow(int limit,int offset){
		Map<String, Object> map=new HashMap<>();
		List<Student> page=new ArrayList<>();
		List<Student> all=studentDao.allStudent();
		for (int i = offset; i < offset+limit; i++) {
			if (i<all.size()) {
				page.add(all.get(i));
			}
		}
		map.put("rows", page);
		map.put("total", all.size());
		return map;
	}
	
	public int insertStudent(Student student) {
		return studentDao.insertStudent(student);
	}
	
	public int deleteStudent(String id) {
		return studentDao.deleteStudent(id);
	}
	
	public int updateStudent(HashMap<String, Object> map) {
		System.err.println(map);
		return studentDao.updateStudent(map);
	}
	
	public Student searchById(String id) {
		return studentDao.searchById(id);
	}
}
