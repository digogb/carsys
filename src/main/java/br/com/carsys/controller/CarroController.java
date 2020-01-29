package br.com.carsys.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carsys.dao.CarroRepository;
import br.com.carsys.model.Carro;

@RestController
@RequestMapping(path = "/carros")
public class CarroController {
	
	 private CarroRepository carroRepository;

	   CarroController(CarroRepository carroRepository) {
	       this.carroRepository = carroRepository;
	   }

	   @GetMapping
	   public List<Carro> findAll(){
	      return carroRepository.findAll();
	   }
	   

}
