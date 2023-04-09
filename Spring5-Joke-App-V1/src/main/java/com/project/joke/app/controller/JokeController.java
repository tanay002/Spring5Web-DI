package com.project.joke.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.joke.app.service.JokeService;

@Controller
public class JokeController {

	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping(value = "/")
	public String showJoke(Model model)
	{
		model.addAttribute("joke",jokeService.getJoke());
		return "index";
	}
	
}
