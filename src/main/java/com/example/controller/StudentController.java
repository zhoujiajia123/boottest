package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entry.Student;
import com.example.service.StudentService;

@Controller
@ResponseBody
public class StudentController {
	@Resource
	private StudentService studentService;
	
	@RequestMapping(value="showTable",method=RequestMethod.POST)
	public Map<String, Object> getTable(@RequestParam(value="limit") Integer limit,@RequestParam(value="offset") Integer offset) {
		return studentService.PageShow(limit, offset);
	}
	
	@RequestMapping(value="insertStudent",method=RequestMethod.POST)
	public int insertStudent(@RequestBody Student student) {					
		return studentService.insertStudent(student);
	}
	
	@RequestMapping(value="deleteStudent",method=RequestMethod.POST)
	public int deleteStudent(@RequestParam(value="id") String id) {
		return studentService.deleteStudent(id);
	}
	
	@RequestMapping(value="updateStudent",method=RequestMethod.POST)
	public int updateStudent(@RequestBody HashMap<String, Object> map) {
		return studentService.updateStudent(map);
	}
	
	@RequestMapping(value="searchById",method=RequestMethod.POST)
	public Student searchById(@RequestParam(value="id") String id) {
		return studentService.searchById(id);
	}
}
