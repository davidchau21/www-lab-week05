package vn.com.iuh.fit.BackEnd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import vn.com.iuh.fit.BackEnd.models.Candidate;
import vn.com.iuh.fit.BackEnd.repositories.CandidateReponsitory;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {
    @Autowired
    CandidateReponsitory candidateRepository;
    public boolean add(Candidate candidate) {return candidateRepository.save(candidate).equals(candidate);}
    public boolean addAll(List<Candidate> candidates) {return candidateRepository.saveAll(candidates).equals(candidates);}
    public List<Candidate> getAll() {return (List<Candidate>) candidateRepository.findAll();}
    public Optional<Candidate> getByID(long id) {return candidateRepository.findById(id);}
    public void delete(long id) {candidateRepository.deleteById(id);}

    public Page<Candidate> findAll(int pageNo, int pageSize, String sortBy,
                                   String sortDirection) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return candidateRepository.findAll(pageable);//findFirst.../findTop...
    }
}
