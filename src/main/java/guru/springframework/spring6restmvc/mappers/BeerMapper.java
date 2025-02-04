package guru.springframework.spring6restmvc.mappers;

import guru.springframework.spring6restmvc.entities.Beer;
import guru.springframework.spring6restmvc.model.BeerDTO;
<<<<<<< Updated upstream
import org.mapstruct.Mapper;

/**
 * Created by jt, Spring Framework Guru.
 */
=======
import org.mapstruct.*;

>>>>>>> Stashed changes
@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

<<<<<<< Updated upstream
}
=======
    @Mapping(target = "id", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateBeerFromDto(BeerDTO dto, @MappingTarget Beer beer);

}
>>>>>>> Stashed changes
