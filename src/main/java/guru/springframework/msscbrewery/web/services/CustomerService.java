/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.msscbrewery.web.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import java.util.UUID;

/**
 *
 * @author arvisdev
 */
public interface CustomerService
{

    CustomerDto getCustomer(UUID id);
    
}
