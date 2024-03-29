package loadmap.jpapractice.jpql;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
public class Address {
    private String city;
    private String street;
    private String zipcode;

}
