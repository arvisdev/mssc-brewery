/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.msscbrewery.web.model;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author arvisdev
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto
{
    private UUID id;
    private String firstName;
    private String lastName;
    
}
