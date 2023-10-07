package vn.com.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import vn.com.iuh.fit.enums.Country;

@Entity
@EqualsAndHashCode(of = {"id"})
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private long id;

    @Column(name = "street", columnDefinition = "varchar(150)")
    private String street;

    @Column(name = "city", columnDefinition = "varchar(50)")
    private String city;

    @Column(name = "country", columnDefinition = "varchar(30)")
    private Country country;

    @Column(name = "number", columnDefinition = "varchar(20)")
    private String number;

    @Column(name = "zipcode", columnDefinition = "varchar(30)")
    private String zipcode;

    public Address(String street, String city, Country country, String number, String zipcode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.zipcode = zipcode;
    }
}
