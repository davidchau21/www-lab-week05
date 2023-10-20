package vn.com.iuh.fit.BackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.com.iuh.fit.BackEnd.ids.CandidateSkill_ID;
import vn.com.iuh.fit.BackEnd.models.CandidateSkill;

@RepositoryRestResource
public interface CandidateSkillReponsitory extends JpaRepository<CandidateSkill, CandidateSkill_ID> {
}
