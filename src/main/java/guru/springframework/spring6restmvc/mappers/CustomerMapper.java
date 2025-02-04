package guru.springframework.spring6restmvc.mappers;

import guru.springframework.spring6restmvc.entities.Customer;
import guru.springframework.spring6restmvc.model.CustomerDTO;
<<<<<<< Updated upstream
import org.mapstruct.Mapper;

/**
 * Created by jt, Spring Framework Guru.
 */
=======
import org.mapstruct.*;

>>>>>>> Stashed changes
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

<<<<<<< Updated upstream
}
=======
    @Mapping(target = "id", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCustomerFromDto(CustomerDTO dto, @MappingTarget Customer customer);

}
>>>>>>> Stashed changes
