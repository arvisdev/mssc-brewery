/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.msscbrewery.web.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import java.util.UUID;
import org.springframework.stereotype.Service;

/**
 *
 * @author arvisdev
 */
@Service
public class CustomerServiceImpl implements CustomerService
{
    @Override
    public CustomerDto getCustomer(UUID id)
    {
        return CustomerDto.builder()
                .firstName("John")
                .lastName("Doe")
                .id(UUID.randomUUID())
                .build();
                
                
    }
}
