package guru.springframework.spring6mvc.services;

import guru.springframework.spring6mvc.model.BeerData;

import java.util.UUID;

public interface BeerService {
    public BeerData getBeerById(UUID id);
}
