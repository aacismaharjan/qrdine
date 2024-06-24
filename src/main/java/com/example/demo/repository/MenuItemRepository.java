package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
}
