package com.baidu.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.entity.TbCriminal;
import com.baidu.service.TbCriminalService;
import com.baidu.util.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class TbCriminalController {

	@Resource
	private TbCriminalService service;
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="")String name,@RequestParam(defaultValue="1")Integer page,HttpServletRequest request) {
		int pageSize=2;
		
		PageHelper.startPage(page, pageSize);
		List<Map<String,Object>> list = service.selectList(name);
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
		
		PageUtil.page(request, "/list?name="+name, pageSize, list, (int)pageInfo.getTotal(), page);
		
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		return "list";
	}
	
	@RequestMapping("toadd")
	public String toadd() {
		return "add";
	}
	
	@ResponseBody
	@RequestMapping("add")
	public boolean add(TbCriminal tbCriminal) {
		return service.insertSelective(tbCriminal)>0;
	}
	
	@RequestMapping("toupdate")
	public String toupdate(Integer id,Model model) {
		TbCriminal tbCriminal = service.selectByPrimaryKey(id);
		model.addAttribute("tb", tbCriminal);
		return "update";
	}
	
	
	@ResponseBody
	@RequestMapping("update")
	public boolean update(TbCriminal tbCriminal) {
		return service.updateByPrimaryKeySelective(tbCriminal)>0;
	}
	
	@ResponseBody
	@RequestMapping("deletebyid")
	public boolean deletebyid(Integer cid) {
		return service.deleteByPrimaryKey(cid)>0;
	}
	
	
	@RequestMapping("tosee")
	public String tosee(Integer id,Model model) {
		TbCriminal tbCriminal = service.selectByPrimaryKey(id);
		model.addAttribute("tb", tbCriminal);
		return "look";
	}
	
	
	
}
