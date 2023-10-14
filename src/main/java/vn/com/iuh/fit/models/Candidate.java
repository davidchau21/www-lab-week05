package vn.com.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "candidate")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "can_id", nullable = false)
    private long id;

    @Column(nullable = false,unique = true)
    private Date dob;

    @Column(columnDefinition = "varchar(255)")
    private String email;

    @Column(name = "full_name", columnDefinition = "varchar(255)")
    private  String fullName;

    @Column(columnDefinition = "varchar(15)")
    private  String phone;

    @ManyToOne()
    @JoinColumn(name = "address")
    private  Address address;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private List<Experiences> experiences;

    @OneToMany(mappedBy = "candidate", fetch = FetchType.LAZY)
    private List<CandidateSkill> candidateSkills;


    public Candidate(String s, LocalDate of, Address add, String s1, String s2) {
    }


}
