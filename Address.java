package Test.example.Test.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Address {
    private Long addressId;
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}
