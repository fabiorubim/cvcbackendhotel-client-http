package br.com.leisuretravel.cvcbackendhotel.client.http.hotels;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties.FeignClientConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.leisuretravel.canonical.hotels.city.HotelResource;

@FeignClient(name = "hotels", configuration = FeignClientConfiguration.class, url = "https://cvcbackendhotel.herokuapp.com/hotels")
public interface HotelsClient {

	@GetMapping(value = "/avail/{cityCode}") 
	ResponseEntity<List<HotelResource>> getHoteisPorCidade(@PathVariable(name="cityCode") String cityCode);
	
	@GetMapping(value = "/{hotelCode}") 
	ResponseEntity<List<HotelResource>> getDetalhesHotel(@PathVariable(name="hotelCode") String hotelCode);
	
}
