package br.com.leisuretravel.cvcbackendhotel.client.http.hotels;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.leisuretravel.canonical.hotels.city.HotelResource;
import br.com.leisuretravel.cvcbackendhotel.client.http.config.CvcbackendhotelClientHttpConfig;

@ExtendWith(SpringExtension.class)
@TestMethodOrder(OrderAnnotation.class)
@TestInstance(PER_CLASS)
@ContextConfiguration(classes = { CvcbackendhotelClientHttpConfig.class })
class CvcbackendhotelClientHttpApplicationTests {

	@Autowired
	private HotelsClient client;

	@Test
	void deve_retornar_hoteis_determinada_cidade() {
		ResponseEntity<List<HotelResource>> hoteis = client.getHoteisPorCidade("7110");
		assertEquals(OK, hoteis.getStatusCode());
	}

	@Test
	void deve_retornar_detalhes_de_um_hotel() {
		ResponseEntity<List<HotelResource>> detalhesHotel = client.getDetalhesHotel("1");
		assertEquals(OK, detalhesHotel.getStatusCode());
	}

}
