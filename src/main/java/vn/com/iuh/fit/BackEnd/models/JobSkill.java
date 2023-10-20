package vn.com.iuh.fit.BackEnd.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.com.iuh.fit.BackEnd.enums.SkillLevel;

import java.util.Objects;

@Entity
@Table(name = "job_skill")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;

    @Column(name = "more_infos", length = 1000)
    private String moreInfo;

}
