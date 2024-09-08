package guru.springframework.spring6mvc.controller;

import guru.springframework.spring6mvc.model.BeerData;
import guru.springframework.spring6mvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public BeerData getBeerById(UUID id) {
        log.debug("BeerController: getBeerById");
        return beerService.getBeerById(id);
    }
}
