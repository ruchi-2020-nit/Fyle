package com.Ruchi.fyle.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.servlet.ModelAndView;

import com.Ruchi.fyle.entities.Branch;
import com.Ruchi.fyle.services.BranchServiceImpl;
@Controller
public class BranchController {
	
	@Autowired
	private BranchServiceImpl bs;
	
	@GetMapping("/")
    public String viewHomePage(Model model) {
		List<Branch> listbranch = new ArrayList<Branch>();
		model.addAttribute("branch", new Branch());
        model.addAttribute("listbranch", listbranch); 
        return "branches";
    }
	
	/*@GetMapping("/find")
    public String find(Model model) {
       
        return "find";
    }
	*/
	@GetMapping("/branches")
    public ModelAndView findlist(@ModelAttribute("city") String data) {
		ModelAndView mav=new ModelAndView("branches");
		if(data==null) {
   		List<Branch> listbranch = new ArrayList<Branch>();
   		mav.addObject("listbranch", listbranch); 
   		mav.addObject("branch", new Branch());
     
   	 }else {
        List<Branch> listbranch = bs.getResult(data);
        List<Branch> listBranch = new ArrayList<>(); 
        if(listbranch.size()>3) {
        	for(int i=0;listBranch.size()<=3&&i<listbranch.size();i++) {
        		if(!listBranch.contains(listbranch.get(i))) {
        			listBranch.add(listbranch.get(i));
        		}
        	}
        mav.addObject("listbranch", listBranch);
        }else {
        mav.addObject("listbranch", listbranch); 
        }
        mav.addObject("branch", new Branch());
   		 
   	 }
   	 return mav;
    }
}
