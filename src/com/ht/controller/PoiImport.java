package com.ht.controller;

import java.awt.print.Book;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.base.ImportExcel;
import com.ht.model.Test;
import com.ht.service.TestService;

@Controller
@RequestMapping("import")
public class PoiImport {
	

	@Resource(name="testServiceImpl")
	private TestService testService;
	
	
	@ResponseBody
	@RequestMapping("/tests")
	public String save() throws Exception
	{
		
		 String originUrl="E:\\book.xls";
		    int startRow=2;
		    int endRow=0;
		    List<Test> testList = (List<Test>) ImportExcel.importExcel(originUrl, startRow, endRow, Test.class);
		    for (Test test : testList) {
		    	testService.insert(test);
		    	
		    }
		
		return "success";
	}
	
}
