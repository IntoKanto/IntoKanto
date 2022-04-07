package com.example.palvelintyo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.palvelintyo.domain.Havainto;

@Controller
public class havaintoController {
	List<Havainto> havainto = new ArrayList<Havainto>();
	
	@GetMapping("/eka")
	public String sivu(Model model) {
		model.addAttribute("tyhja", new Havainto());
		return "eka";
	}
	
	@PostMapping("/eka")
	public String asetus (@ModelAttribute Havainto hava, Model model) {
		System.out.println("##################kasittely#################");
		havainto.add(hava);
		model.addAttribute("lista", havainto);
		model.addAttribute("tyhja", new Havainto());
		
		return "lista";
	}
	
	

}
