package vn.com.iuh.fit.BackEnd.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "company")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {

    @Id
    private long id;
    private String name;
    private String about;
    private String phone;
    private String webURL;
    private String email;

    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "company")
    private List<Job> jobs;
}
