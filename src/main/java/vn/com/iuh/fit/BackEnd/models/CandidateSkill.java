package vn.com.iuh.fit.BackEnd.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.com.iuh.fit.BackEnd.enums.SkillLevel;
import vn.com.iuh.fit.BackEnd.ids.CandidateSkill_ID;

import java.util.Objects;

@Entity
@Table(name = "candidate_skill")
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CandidateSkill_ID.class)
@Data
public class CandidateSkill {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private Candidate candidate;

    @Id
    @ManyToOne
    private Skill skill;

    @Enumerated
    private SkillLevel skillLevel;

    private String moreInfo;

    public CandidateSkill(Candidate candidate, Skill skill) {
        this.candidate = candidate;
        this.skill = skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandidateSkill that = (CandidateSkill) o;
        return Objects.equals(candidate, that.candidate) && Objects.equals(skill, that.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candidate, skill);
    }
}
