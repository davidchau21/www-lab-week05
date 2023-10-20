package vn.com.iuh.fit.BackEnd.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "job")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Job {
    @Id
    private long id;
    private String name;
    private String description;

    @ManyToOne
    private Company company;

    @OneToMany(mappedBy = "job")
    private List<JobSkill> jobSkills;
}
