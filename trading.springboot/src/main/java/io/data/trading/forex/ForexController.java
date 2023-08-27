package io.data.trading.forex;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {
	
	@Autowired
	private ForexRepository forexRepository;
	
	@GetMapping("/forex")
	public List<Forex> getAllTrades(){
		List<Forex> forexs = new ArrayList<>();
		forexRepository.findAll()
		.forEach(forexs::add);
		return forexs;
	}
	
	@PostMapping("/forex")
	public Forex createTrade(@RequestBody Forex forex) {
		return forexRepository.save(forex);
	}
	
	@GetMapping("/forex/{id}")
	public Optional<Forex> getTradeById(@PathVariable int id) {
		return forexRepository.findById(id);
	}
	@PutMapping("/forex/{id}")
	public Forex updateForex(@PathVariable int id, @RequestBody Forex forex){
		return forexRepository.save(forex);
	}
	
	@DeleteMapping("/forex/{id}")
	public void deleteCar(@PathVariable int id){		
		forexRepository.deleteById(id);
	}
	
	
}





