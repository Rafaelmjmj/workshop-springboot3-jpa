package com.educandoweb.course.repositories;

import com.educandoweb.course.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OderItemRepository extends JpaRepository<OrderItem, Long> {

}
