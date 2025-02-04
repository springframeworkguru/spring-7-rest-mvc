package guru.springframework.spring6restmvc.controller;

import guru.springframework.spring6restmvc.model.BeerDTO;
import guru.springframework.spring6restmvc.services.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

<<<<<<< Updated upstream
/**
 * Created by jt, Spring Framework Guru.
 */
=======
>>>>>>> Stashed changes
@Slf4j
@RequiredArgsConstructor
@RestController
public class BeerController {
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    public static final String BEER_PATH = "/api/v1/beer";
    public static final String BEER_PATH_ID = BEER_PATH + "/{beerId}";

    private final BeerService beerService;

    @PatchMapping(BEER_PATH_ID)
<<<<<<< Updated upstream
    public ResponseEntity updateBeerPatchById(@PathVariable("beerId")UUID beerId, @RequestBody BeerDTO beer){

        beerService.patchBeerById(beerId, beer);
=======
    public ResponseEntity patchBeerById(@PathVariable("beerId") UUID beerId,
                                        @RequestBody BeerDTO beerDTO) {

        if (beerService.patchBeerById(beerId, beerDTO).isEmpty()) {
            throw new NotFoundException();
        }
>>>>>>> Stashed changes

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(BEER_PATH_ID)
    public ResponseEntity deleteById(@PathVariable("beerId") UUID beerId){

        if(! beerService.deleteById(beerId)){
            throw new NotFoundException();
        }

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping(BEER_PATH_ID)
<<<<<<< Updated upstream
    public ResponseEntity updateById(@PathVariable("beerId")UUID beerId, @Validated @RequestBody BeerDTO beer){

        if( beerService.updateBeerById(beerId, beer).isEmpty()){
=======
    public ResponseEntity updateById(@PathVariable("beerId")UUID beerId,
                                     @Validated @RequestBody BeerDTO beerDto){

        if( beerService.updateBeerById(beerId, beerDto).isEmpty()){
>>>>>>> Stashed changes
            throw new NotFoundException();
        }

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PostMapping(BEER_PATH)
<<<<<<< Updated upstream
    public ResponseEntity handlePost(@Validated @RequestBody BeerDTO beer){

        BeerDTO savedBeer = beerService.saveNewBeer(beer);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", BEER_PATH + "/" + savedBeer.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @GetMapping(value = BEER_PATH)
    public List<BeerDTO> listBeers(){
        return beerService.listBeers();
    }


    @GetMapping(value = BEER_PATH_ID)
    public BeerDTO getBeerById(@PathVariable("beerId") UUID beerId){

        log.debug("Get Beer by Id - in controller");
=======
    public ResponseEntity<BeerDTO> handlePost(@Validated @RequestBody BeerDTO beerDTO) {
        BeerDTO savedBeerDTO = beerService.saveNewBeer(beerDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", BEER_PATH + "/" + savedBeerDTO.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @GetMapping(BEER_PATH)
    public List<BeerDTO> listBeers() {
        return beerService.listBeers();
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handleNotFoundException(){
        return ResponseEntity.notFound().build();
    }

    @GetMapping(BEER_PATH_ID)
    public BeerDTO getBeerById(@PathVariable("beerId") UUID beerId){

        log.debug("Get BeerDTO by Id - in controller");
>>>>>>> Stashed changes

        return beerService.getBeerById(beerId).orElseThrow(NotFoundException::new);
    }

<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
