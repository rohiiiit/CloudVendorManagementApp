package com.rodo.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodo.restdemo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{
    
    
}
