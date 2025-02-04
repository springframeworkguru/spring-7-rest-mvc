package guru.springframework.spring6restmvc.repositories;

import guru.springframework.spring6restmvc.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

<<<<<<< Updated upstream
/**
 * Created by jt, Spring Framework Guru.
 */
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
=======
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
>>>>>>> Stashed changes
