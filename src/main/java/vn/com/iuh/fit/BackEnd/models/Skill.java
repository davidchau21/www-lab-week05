package vn.com.iuh.fit.BackEnd.models;

import jakarta.persistence.*;
import vn.com.iuh.fit.BackEnd.enums.SkillType;

import java.util.List;

@Entity
public class Skill {
    @Id
    private long id;
    private String skillName;
    private String skillDescription;

    @Enumerated
    private SkillType skillType;

    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;

}
