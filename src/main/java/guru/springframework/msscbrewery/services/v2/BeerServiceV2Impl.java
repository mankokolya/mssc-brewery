package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        log.debug("Getting beer V2");
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2) {
        log.debug("Creating new beer V2");
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {
        log.debug("Updating beer V2");
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting beer by id V2");
    }
}
