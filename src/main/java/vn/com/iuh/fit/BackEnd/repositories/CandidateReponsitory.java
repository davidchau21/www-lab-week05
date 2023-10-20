package vn.com.iuh.fit.BackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.com.iuh.fit.BackEnd.models.Candidate;

@RepositoryRestResource(path = "Candidate")
public interface CandidateReponsitory extends JpaRepository<Candidate, Long> {
}
