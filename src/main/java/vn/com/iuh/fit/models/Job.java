package vn.com.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long id;

    @Column(name = "job_desc", columnDefinition = "varchar(2000)")
    private String jobDesc=null;

    @Column(name = "job_name", columnDefinition = "varchar(255)")
    private String jobName = null;

    @ManyToOne
    @JoinColumn(name = "company")
    private Company company = null;
}