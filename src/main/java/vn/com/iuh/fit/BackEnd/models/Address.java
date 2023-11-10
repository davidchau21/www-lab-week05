package vn.com.iuh.fit.BackEnd.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
<<<<<<< HEAD
import lombok.*;

@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private long id;
    @Column(name = "number", length = 20)
    private String number;
    @Column(name = "Street", length = 150)
    private String street;
    @Column(name = "city", length = 50)
    private String city;
    @Column(name = "zipcode", length = 7)
    private String zipcode;
    @Column(name = "country", length = 30)
    private CountryCode country = CountryCode.VN;

    public Address(String number, String street, String city, String zipcode, CountryCode country) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

=======
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(of = {"id"})
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "varchar(150)")
    private String street= null;
    @Column(columnDefinition = "varchar(50)")
    private String city= null;
    @Column(columnDefinition = "smallint(6)")
    private CountryCode country = null;
    @Column(columnDefinition = "varchar(20)")
    private String number= null;
    @Column(columnDefinition = "varchar(7)")
    private String zipcode= null;

    public Address(CountryCode country) {
        this.country = country;
    }

    public Address(String street, String city, CountryCode country, String number, String zipcode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.number = number;
        this.zipcode = zipcode;
    }

>>>>>>> 573571e00878c205a8a4e49aa5f1751dc16145b5
}
