package br.usjt.hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.model.Temperatura;
import br.usjt.hellospringboot.repository.TemperaturasRepository;
<<<<<<< HEAD
import br.usjt.hellospringboot.service.TemperaturasService;

@Controller
public class TemperaturaController {
	//@Autowired
	//private TemperaturasRepository temperaturasRepo;
	
	@Autowired
	private TemperaturasService temperaturasService;

=======

@Controller
public class TemperaturaController {
	@Autowired
	private TemperaturasRepository temperaturasRepo;
	
>>>>>>> d31927fb551c206c02b6c5de1890931dd1eb1a6b
	@GetMapping("/temperaturas")
	public ModelAndView listarTemperaturas() {
		
		ModelAndView mv = new ModelAndView("lista_temperaturas");
<<<<<<< HEAD
		List<Temperatura> temperaturas = temperaturasService.listarTodos();
=======
		List<Temperatura> temperaturas = temperaturasRepo.findAll();
>>>>>>> d31927fb551c206c02b6c5de1890931dd1eb1a6b
		mv.addObject("temperaturas", temperaturas);
		mv.addObject(new Temperatura());
		
		return mv;
	}
	
<<<<<<< HEAD

=======
	@PostMapping("/temperaturas")
	public String salvar(Temperatura temperatura) {
		temperaturasRepo.save(temperatura);
		return "redirect:/alunos";
	}
>>>>>>> d31927fb551c206c02b6c5de1890931dd1eb1a6b

}
