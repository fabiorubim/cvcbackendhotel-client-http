package br.com.leisuretravel.cvcbackendhotel.client.http.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"br.com.leisuretravel.cvcbackendhotel.client.http.config"})
@EnableFeignClients(basePackages = {"br.com.leisuretravel.cvcbackendhotel.client.http.hotels"})
public class CvcbackendhotelClientHttpConfig {

}
