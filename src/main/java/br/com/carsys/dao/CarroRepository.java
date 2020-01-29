package br.com.carsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.carsys.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
