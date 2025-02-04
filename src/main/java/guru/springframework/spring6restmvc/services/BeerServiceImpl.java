package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.BeerDTO;
import guru.springframework.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

<<<<<<< Updated upstream
/**
 * Created by jt, Spring Framework Guru.
 */
=======
>>>>>>> Stashed changes
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    private Map<UUID, BeerDTO> beerMap;

    public BeerServiceImpl() {
        this.beerMap = new HashMap<>();

<<<<<<< Updated upstream
        BeerDTO beer1 = BeerDTO.builder()
=======
        BeerDTO beerDTO1 = BeerDTO.builder()
>>>>>>> Stashed changes
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
<<<<<<< Updated upstream
                .upc("12356")
=======
                .upc("123456")
>>>>>>> Stashed changes
                .price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

<<<<<<< Updated upstream
        BeerDTO beer2 = BeerDTO.builder()
=======
        BeerDTO beerDTO2 = BeerDTO.builder()
>>>>>>> Stashed changes
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Crank")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("12356222")
                .price(new BigDecimal("11.99"))
                .quantityOnHand(392)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

<<<<<<< Updated upstream
        BeerDTO beer3 = BeerDTO.builder()
=======
        BeerDTO beerDTO3 = BeerDTO.builder()
>>>>>>> Stashed changes
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Sunshine City")
                .beerStyle(BeerStyle.IPA)
                .upc("12356")
                .price(new BigDecimal("13.99"))
                .quantityOnHand(144)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

<<<<<<< Updated upstream
        beerMap.put(beer1.getId(), beer1);
        beerMap.put(beer2.getId(), beer2);
        beerMap.put(beer3.getId(), beer3);
    }

    @Override
    public Optional<BeerDTO> patchBeerById(UUID beerId, BeerDTO beer) {
        BeerDTO existing = beerMap.get(beerId);

        if (StringUtils.hasText(beer.getBeerName())){
            existing.setBeerName(beer.getBeerName());
        }

        if (beer.getBeerStyle() != null) {
            existing.setBeerStyle(beer.getBeerStyle());
        }

        if (beer.getPrice() != null) {
            existing.setPrice(beer.getPrice());
        }

        if (beer.getQuantityOnHand() != null){
            existing.setQuantityOnHand(beer.getQuantityOnHand());
        }

        if (StringUtils.hasText(beer.getUpc())) {
            existing.setUpc(beer.getUpc());
        }
=======
        beerMap.put(beerDTO1.getId(), beerDTO1);
        beerMap.put(beerDTO2.getId(), beerDTO2);
        beerMap.put(beerDTO3.getId(), beerDTO3);
    }

    @Override
    public List<BeerDTO> listBeers(){
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Optional<BeerDTO> getBeerById(UUID id) {

        log.debug("Get BeerDTO by Id - in service. Id: " + id.toString());

        return Optional.ofNullable(beerMap.get(id));
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beerDTO){
        BeerDTO savedBeerDTO = BeerDTO.builder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName(beerDTO.getBeerName())
                .beerStyle(beerDTO.getBeerStyle())
                .quantityOnHand(beerDTO.getQuantityOnHand())
                .upc(beerDTO.getUpc())
                .price(beerDTO.getPrice())
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        beerMap.put(savedBeerDTO.getId(), savedBeerDTO);

        return savedBeerDTO;
    }

    @Override
    public Optional<BeerDTO> updateBeerById(UUID beerId, BeerDTO beerDTO) {
        BeerDTO existing = beerMap.get(beerId);

        existing.setBeerName(beerDTO.getBeerName());
        existing.setPrice(beerDTO.getPrice());
        existing.setUpc(beerDTO.getUpc());
        existing.setQuantityOnHand(beerDTO.getQuantityOnHand());
>>>>>>> Stashed changes

        return Optional.of(existing);
    }

    @Override
    public Boolean deleteById(UUID beerId) {
        beerMap.remove(beerId);

        return true;
    }

    @Override
<<<<<<< Updated upstream
    public Optional<BeerDTO> updateBeerById(UUID beerId, BeerDTO beer) {
        BeerDTO existing = beerMap.get(beerId);
        existing.setBeerName(beer.getBeerName());
        existing.setPrice(beer.getPrice());
        existing.setUpc(beer.getUpc());
        existing.setQuantityOnHand(beer.getQuantityOnHand());
        return Optional.of(existing);
    }

    @Override
    public List<BeerDTO> listBeers(){
        return new ArrayList<>(beerMap.values());
    }

    @Override
    public Optional<BeerDTO> getBeerById(UUID id) {

        log.debug("Get Beer by Id - in service. Id: " + id.toString());

        return Optional.of(beerMap.get(id));
    }

    @Override
    public BeerDTO saveNewBeer(BeerDTO beer) {

        BeerDTO savedBeer = BeerDTO.builder()
                .id(UUID.randomUUID())
                .version(1)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .beerName(beer.getBeerName())
                .beerStyle(beer.getBeerStyle())
                .quantityOnHand(beer.getQuantityOnHand())
                .upc(beer.getUpc())
                .price(beer.getPrice())
                .build();

        beerMap.put(savedBeer.getId(), savedBeer);

        return savedBeer;
    }
}

















=======
    public Optional<BeerDTO> patchBeerById(UUID beerId, BeerDTO beerDTO) {
        BeerDTO existing = beerMap.get(beerId);

        if(StringUtils.hasText(beerDTO.getBeerName())){
            existing.setBeerName(beerDTO.getBeerName());
        }

        if(beerDTO.getBeerStyle() != null){
            existing.setBeerStyle(beerDTO.getBeerStyle());
        }

        if(beerDTO.getPrice() != null){
            existing.setPrice(beerDTO.getPrice());
        }

        if(beerDTO.getQuantityOnHand() != null){
            existing.setQuantityOnHand(beerDTO.getQuantityOnHand());
        }

        if(StringUtils.hasText(beerDTO.getUpc())){
            existing.setUpc(beerDTO.getUpc());
        }

        return Optional.of(existing);
    }
}
>>>>>>> Stashed changes
