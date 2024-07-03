package com.foodgenie.restaurant.repository;

import com.foodgenie.restaurant.entities.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant,Integer> {

}
