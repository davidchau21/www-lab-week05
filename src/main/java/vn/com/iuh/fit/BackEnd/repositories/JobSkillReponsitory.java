package vn.com.iuh.fit.BackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.com.iuh.fit.BackEnd.ids.JobSkill_ID;
import vn.com.iuh.fit.BackEnd.models.JobSkill;

@RepositoryRestResource
public interface JobSkillReponsitory extends JpaRepository<JobSkill, JobSkill_ID> {
}