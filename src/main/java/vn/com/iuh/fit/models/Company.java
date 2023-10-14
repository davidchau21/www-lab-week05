package vn.com.iuh.fit.models;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_id")
    private long id;

    @Column(columnDefinition = "varchar(2000)")
    private String about;

    @Column(columnDefinition = "varchar(255)", name = "comp_name")
    private String compName;

    @Column(columnDefinition = "varchar(255)")
    private String phone;

    @Column(columnDefinition = "varchar(255)", name = "web_url")
    private String webUrl;

    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "company")
    private List<Job> jobs;
}
