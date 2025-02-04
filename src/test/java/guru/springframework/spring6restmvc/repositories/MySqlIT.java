package guru.springframework.spring6restmvc.repositories;

import guru.springframework.spring6restmvc.entities.Beer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

<<<<<<< Updated upstream
/**
 * Created by jt, Spring Framework Guru.
 */
=======
>>>>>>> Stashed changes
@Testcontainers
@SpringBootTest
@ActiveProfiles("localmysql")
public class MySqlIT {

    @Container
    @ServiceConnection
<<<<<<< Updated upstream
    static MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:9");
=======
    static MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:8.0");
>>>>>>> Stashed changes

    @Autowired
    BeerRepository beerRepository;

    @Test
    void testListBeers() {
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
        List<Beer> beers = beerRepository.findAll();

        assertThat(beers.size()).isGreaterThan(0);
    }
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
