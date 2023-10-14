package vn.com.iuh.fit.models;

import com.neovisionaries.i18n.CountryCode;
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

}
