package com.boot.bookingrestaurantapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableJpaRepositories("/booking-restaurant-api/src/main/java/com/boot/bookingrestaurantapi/respositories")
public class BookingRestaurantApiApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(BookingRestaurantApiApplication2.class, args);
	}

}
