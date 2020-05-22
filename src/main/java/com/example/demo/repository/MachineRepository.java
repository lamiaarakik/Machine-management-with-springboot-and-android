package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Machine;

public interface MachineRepository extends JpaRepository<Machine, Integer> {

	Machine findById(int id);
}
