package com.vides.hotel_api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vides.hotel_api.dao.AmenityRepository;
import com.vides.hotel_api.dto.Amenity.AmenityRequest;
import com.vides.hotel_api.dto.Amenity.AmenityResponse;
import com.vides.hotel_api.models.Amenity;

@Service
public class AmenityService {

    @Autowired
    private AmenityRepository amenityRepository;

    public AmenityResponse create(AmenityRequest amenityRequest) throws Exception{
        if(amenityRequest == null){
            throw new Exception("Request null");
        }

        if(amenityRequest.getName() == null || amenityRequest.getDescription() == null){
            throw new Exception("Invalid Amenity request");
        }

        Amenity amenity = new Amenity();
        amenity.setName(amenityRequest.getName());
        amenity.setDescription(amenityRequest.getDescription());
        amenity.setPrice(amenityRequest.getPrice());

        amenityRepository.save(amenity);

        return new AmenityResponse(amenity.getName(), amenity.getPrice(), "Amenity created");
    }

    public AmenityResponse getAmenity(Long id) throws Exception{
        if(id == null){
            throw new Exception("Request null");
        }

        Optional<Amenity> amenity = amenityRepository.findById(id);

        if(!amenity.isPresent()){
            throw new Exception("Amenity not found");
        }

        Amenity foundAmenity = amenity.get();
        return new AmenityResponse(foundAmenity.getName(), foundAmenity.getPrice(), "Amenity found");
    }


}
