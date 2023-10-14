package vn.com.iuh.fit.models;

import jakarta.persistence.*;
import vn.com.iuh.fit.enums.SkillType;

import java.util.List;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id", nullable = false)
    private long id;

    @Column(name = "skill_desc", columnDefinition = "varchar(255)")
    private String skillDescription=null;

    @Column(name = "skill_name", columnDefinition = "varchar(255)")
    private String skillName=null;

    @Enumerated
    @Column(name = "skill_type")
    private SkillType type;

    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;

}
