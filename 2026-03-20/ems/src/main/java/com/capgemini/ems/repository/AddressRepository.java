package com.capgemini.ems.repository;

import com.capgemini.ems.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}