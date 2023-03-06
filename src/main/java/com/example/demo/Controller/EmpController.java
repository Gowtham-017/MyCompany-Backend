package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.EmpDetails;
import com.example.demo.Service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService s;
	
	@GetMapping("/getmap")
	public List<EmpDetails> showDetail(){
		return s.getDetail();
	}
	
	@PostMapping("/postmap")
	public String addDetail(@RequestBody EmpDetails t) {
		s.add(t);
		return "Added details "+ t.getEmpid();
	}
	
	@PutMapping("/putmap")
	public EmpDetails updateInfo(@RequestBody EmpDetails st) {
		return s.updateDetail(st);
	
	}
//	@DeleteMapping("/deletemap/{empid}")
//	String deleteinfo() {
//		return "Deleted the element";
//	}
	@DeleteMapping("/deletemap")
	public  String deleteInfo(@RequestBody EmpDetails st) {
		 s.deleteDetail(st);
		 return "Deleted the element";
	}

	//sorting
	@GetMapping("/employee/{file}")
	public List<EmpDetails> getWithSort(@PathVariable String file){
		return s.getSort(file);
	}
	
	//pagination
	@GetMapping("/employee/{offset}/{pageSize}")
	public List<EmpDetails> employeeWithPaging(@PathVariable int offset,@PathVariable int pageSize){
		return s.getPaging(offset, pageSize);
	}

}
