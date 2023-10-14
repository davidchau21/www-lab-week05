package vn.com.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.com.iuh.fit.models.Candidate;

@RepositoryRestResource(path = "Candidate")
public interface CandidateResponsitory extends JpaRepository<Candidate, Long> {
}
