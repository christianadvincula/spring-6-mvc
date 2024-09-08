package guru.springframework.spring6mvc.services;

import guru.springframework.spring6mvc.model.BeerData;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public interface BeerService {
    public BeerData getBeerById(UUID id);
}
