package guru.springframework.spring6mvc.services;

import guru.springframework.spring6mvc.model.BeerData;
import guru.springframework.spring6mvc.model.BeerStyle;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public BeerData getBeerById(UUID id) {
        return BeerData.builder()
                .id(id)
                .version(1)
                .beerStyle(BeerStyle.LAGER)
                .upc("4801032111025")
                .price(new BigDecimal("43.0"))
                .qualityOnHand(100)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
