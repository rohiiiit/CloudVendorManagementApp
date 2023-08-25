package com.rodo.restdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rodo.restdemo.exception.CloudVendorNotFoundException;
import com.rodo.restdemo.model.CloudVendor;
import com.rodo.restdemo.repository.CloudVendorRepository;
import com.rodo.restdemo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService{
    
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
         // More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
         // More Business Logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
         // More Business Logic
         if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested Cloud Vendor does not exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
         // More Business Logic
        return cloudVendorRepository.findAll();
    }

    

    

}
