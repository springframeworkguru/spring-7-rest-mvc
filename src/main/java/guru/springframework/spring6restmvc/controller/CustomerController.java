package guru.springframework.spring6restmvc.controller;

import guru.springframework.spring6restmvc.model.CustomerDTO;
import guru.springframework.spring6restmvc.services.CustomerService;
import lombok.RequiredArgsConstructor;
<<<<<<< Updated upstream
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
=======
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
>>>>>>> Stashed changes
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

<<<<<<< Updated upstream
/**
 * Created by jt, Spring Framework Guru.
 */

=======
@Slf4j
>>>>>>> Stashed changes
@RequiredArgsConstructor
@RestController
public class CustomerController {
    public static final String CUSTOMER_PATH = "/api/v1/customer";
    public static final String CUSTOMER_PATH_ID = CUSTOMER_PATH + "/{customerId}";

    private final CustomerService customerService;

    @PatchMapping(CUSTOMER_PATH_ID)
    public ResponseEntity patchCustomerById(@PathVariable("customerId") UUID customerId,
<<<<<<< Updated upstream
                                                @RequestBody CustomerDTO customer){

        customerService.patchCustomerById(customerId, customer);
=======
                                         @RequestBody CustomerDTO customerDTO) {
        customerService.patchCustomerById(customerId, customerDTO);
>>>>>>> Stashed changes

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(CUSTOMER_PATH_ID)
<<<<<<< Updated upstream
    public ResponseEntity deleteCustomerById(@PathVariable("customerId") UUID customerId){

        if (!customerService.deleteCustomerById(customerId)){
=======
    public ResponseEntity deleteById(@PathVariable("customerId") UUID customerId) {
        if (! customerService.deleteCustomerById(customerId)){
>>>>>>> Stashed changes
            throw new NotFoundException();
        }

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping(CUSTOMER_PATH_ID)
<<<<<<< Updated upstream
    public ResponseEntity updateCustomerByID(@PathVariable("customerId") UUID customerId,
                                             @RequestBody CustomerDTO customer){

        if (customerService.updateCustomerById(customerId, customer).isEmpty()){
=======
    public ResponseEntity<CustomerDTO> updateById(@PathVariable("customerId") UUID customerId,
                                                  @Validated @RequestBody CustomerDTO customerDTO) {
        if (customerService.updateCustomerById(customerId, customerDTO).isEmpty()){
>>>>>>> Stashed changes
            throw new NotFoundException();
        }

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PostMapping(CUSTOMER_PATH)
<<<<<<< Updated upstream
    public ResponseEntity handlePost(@RequestBody CustomerDTO customer){
        CustomerDTO savedCustomer = customerService.saveNewCustomer(customer);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", CUSTOMER_PATH + "/" + savedCustomer.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @GetMapping(CUSTOMER_PATH)
    public List<CustomerDTO> listAllCustomers(){
=======
    public ResponseEntity<CustomerDTO> handlePost(@Validated @RequestBody CustomerDTO customerDTO) {
        CustomerDTO savedCustomerDTO = customerService.saveNewCustomer(customerDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", CUSTOMER_PATH + "/" + savedCustomerDTO.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @GetMapping(CUSTOMER_PATH)
    public List<CustomerDTO> listCustomers() {
>>>>>>> Stashed changes
        return customerService.getAllCustomers();
    }

    @GetMapping(value = CUSTOMER_PATH_ID)
<<<<<<< Updated upstream
    public CustomerDTO getCustomerById(@PathVariable("customerId") UUID id){
        return customerService.getCustomerById(id).orElseThrow(NotFoundException::new);
    }

=======
    public CustomerDTO getCustomerById(@PathVariable("customerId") UUID id) {

        log.debug("Get customer by id: {}", id);

        return customerService.getCustomerById(id).orElseThrow(NotFoundException::new);
    }
>>>>>>> Stashed changes
}
