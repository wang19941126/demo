package com.ht.controller;

import java.util.List;
import com.ht.model.*;
import com.ht.service.TestService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ht.base.ExportExcel;


@Controller
@RequestMapping(value="poi")
public class PoiTest{
	
	@Resource(name="testServiceImpl")
	private TestService testService;
	


	@ResponseBody
	@RequestMapping("/abcs")
	public String save() throws Exception
	{
	    String sheetName="图书列表";
	    String titleName="我的图书";
	    String[] headers = { "用户id", "用户名称", "用户密码", "用户名字","性别","生日","说明"};
	    List<Test> dataSet = testService.list();
	    String resultUrl="E:\\book.xls";
	    String pattern="yyyy-MM-dd";
	    ExportExcel.exportExcel(sheetName, titleName, headers, dataSet, resultUrl, pattern);

	    return "success";
	}
	
}
