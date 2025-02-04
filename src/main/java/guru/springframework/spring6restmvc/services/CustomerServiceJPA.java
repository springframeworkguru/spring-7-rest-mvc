package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.mappers.CustomerMapper;
import guru.springframework.spring6restmvc.model.CustomerDTO;
import guru.springframework.spring6restmvc.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
<<<<<<< Updated upstream
import org.springframework.util.StringUtils;
=======
>>>>>>> Stashed changes

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
<<<<<<< Updated upstream
import java.util.stream.Collectors;

/**
 * Created by jt, Spring Framework Guru.
 */
=======

>>>>>>> Stashed changes
@Service
@Primary
@RequiredArgsConstructor
public class CustomerServiceJPA implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
<<<<<<< Updated upstream
    public Optional<CustomerDTO> getCustomerById(UUID uuid) {
        return Optional.ofNullable(customerMapper
                .customerToCustomerDto(customerRepository.findById(uuid).orElse(null)));
=======
    public Optional<CustomerDTO> getCustomerById(UUID id) {
        return customerRepository.findById(id)
                .map(customerMapper::customerToCustomerDto);
>>>>>>> Stashed changes
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
<<<<<<< Updated upstream
        return customerRepository.findAll().stream()
                .map(customerMapper::customerToCustomerDto)
                .collect(Collectors.toList());
=======
        return customerRepository.findAll()
                .stream()
                .map(customerMapper::customerToCustomerDto)
                .toList();
>>>>>>> Stashed changes
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO customer) {
<<<<<<< Updated upstream
        return customerMapper.customerToCustomerDto(customerRepository
                .save(customerMapper.customerDtoToCustomer(customer)));
=======
        return customerMapper.customerToCustomerDto(customerRepository.save(customerMapper.customerDtoToCustomer(customer)));
>>>>>>> Stashed changes
    }

    @Override
    public Optional<CustomerDTO> updateCustomerById(UUID customerId, CustomerDTO customer) {
        AtomicReference<Optional<CustomerDTO>> atomicReference = new AtomicReference<>();

        customerRepository.findById(customerId).ifPresentOrElse(foundCustomer -> {
            foundCustomer.setName(customer.getName());
            atomicReference.set(Optional.of(customerMapper
                    .customerToCustomerDto(customerRepository.save(foundCustomer))));
        }, () -> {
            atomicReference.set(Optional.empty());
        });

        return atomicReference.get();
    }

    @Override
    public Boolean deleteCustomerById(UUID customerId) {
<<<<<<< Updated upstream
        if(customerRepository.existsById(customerId)){
=======
        if (customerRepository.existsById(customerId)) {
>>>>>>> Stashed changes
            customerRepository.deleteById(customerId);
            return true;
        }
        return false;
<<<<<<< Updated upstream
    }

    @Override
    public Optional<CustomerDTO> patchCustomerById(UUID customerId, CustomerDTO customer) {
        AtomicReference<Optional<CustomerDTO>> atomicReference = new AtomicReference<>();

        customerRepository.findById(customerId).ifPresentOrElse(foundCustomer -> {
            if (StringUtils.hasText(customer.getName())){
                foundCustomer.setName(customer.getName());
            }
            atomicReference.set(Optional.of(customerMapper
                    .customerToCustomerDto(customerRepository.save(foundCustomer))));
=======

    }

    @Override
    public Optional<CustomerDTO> patchCustomerById(UUID customerId, CustomerDTO customerDTO) {
        AtomicReference<Optional<CustomerDTO>> atomicReference = new AtomicReference<>();

        customerRepository.findById(customerId).ifPresentOrElse(foundCustomer -> {
            // Use MapStruct to update the foundBeer with non-null fields from beerDTO
            customerMapper.updateCustomerFromDto(customerDTO, foundCustomer);

            // Save the updated beer and return the result
            atomicReference.set(Optional.of(customerMapper.customerToCustomerDto(customerRepository
                    .save(foundCustomer))));
>>>>>>> Stashed changes
        }, () -> {
            atomicReference.set(Optional.empty());
        });

        return atomicReference.get();
    }
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
