package io.data.trading.forex;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ForexRepository extends  JpaRepository<Forex,Integer>{

	
}
