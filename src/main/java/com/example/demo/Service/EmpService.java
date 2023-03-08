package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.EmpDetails;

import com.example.demo.Repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	EmpRepository e;
	
	//add details
	public String add(EmpDetails m) {
		e.save(m);
		return "Added";
	}
	
	//get details
	public List<EmpDetails> getDetail(){
		return e.findAll();
	}
	
	//update details
	public  EmpDetails updateDetail(EmpDetails e1) {
		return e.saveAndFlush(e1);
	}
	
	//delete details	

	public void deleteDetail(int empid) {
		e.deleteById(empid);
	}
	
	//sorting
	public List<EmpDetails> getSort(String file){
		return e.findAll(Sort.by(Sort.Direction.ASC,file));
	}
	
	//pagination
	public List<EmpDetails> getPaging(@PathVariable int offset,@PathVariable int pageSize){
		Page<EmpDetails> page=e.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
	

}
