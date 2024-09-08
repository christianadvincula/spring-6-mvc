package guru.springframework.spring6mvc.model;

import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class BeerValue {
    UUID id;
    Integer version;
    String beerName;
    BeerStyle beerStyle;
    String upc;
    Integer qualityOnHand;
    BigDecimal price;
    LocalDateTime createdDate;
    LocalDateTime updateDate;
}
