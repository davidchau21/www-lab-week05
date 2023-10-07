package vn.com.iuh.fit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.com.iuh.fit.enums.SkillLevel;
import vn.com.iuh.fit.ids.CandidateSkillID;
import vn.com.iuh.fit.models.Skill;

@Entity
@Table(name = "candidate_skill")
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CandidateSkillID.class)
@Data
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;


    @Column(name = "more_infos", columnDefinition = "varchar(1000)")
    private String more_infos = null;

    @Column(name = "skill_level")
    private SkillLevel skillLevel =null;
}
