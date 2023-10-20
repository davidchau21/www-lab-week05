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
    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String moreInfos=null;

    @Enumerated
    @Column(name = "skill_level")
    private SkillLevel skillLevel=null;

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    public JobSkill(Job job, Skill skill) {
        this.job = job;
        this.skill = skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobSkill jobSkill = (JobSkill) o;
        return Objects.equals(job, jobSkill.job) && Objects.equals(skill, jobSkill.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job, skill);
    }

}
