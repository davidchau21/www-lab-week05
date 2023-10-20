package vn.com.iuh.fit.BackEnd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.iuh.fit.BackEnd.repositories.CandidateReponsitory;
import vn.com.iuh.fit.BackEnd.repositories.CandidateSkillReponsitory;
import vn.com.iuh.fit.BackEnd.repositories.SkillReponsitory;

@Service
public class CandidateSkillService {
    CandidateSkillReponsitory reponsitory;
    CandidateReponsitory candidateReponsitory;
    SkillReponsitory skillReponsitory;

    @Autowired
    public CandidateSkillService(CandidateSkillReponsitory reponsitory, CandidateReponsitory candidateReponsitory, SkillReponsitory skillReponsitory) {
        this.reponsitory = reponsitory;
        this.candidateReponsitory = candidateReponsitory;
        this.skillReponsitory = skillReponsitory;
    }
}
