package com.example.dao;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.entry.Student;

@Mapper
public interface StudentDao {
	public Student searchById(String id);
	public List<Student> allStudent();
	public int insertStudent(Student student);
	public int deleteStudent(String id);
	public int updateStudent(HashMap<String,Object> map);
}
