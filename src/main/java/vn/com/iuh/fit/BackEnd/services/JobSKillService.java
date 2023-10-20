package vn.com.iuh.fit.BackEnd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.iuh.fit.BackEnd.repositories.JobReponsitory;
import vn.com.iuh.fit.BackEnd.repositories.JobSkillReponsitory;
import vn.com.iuh.fit.BackEnd.repositories.SkillReponsitory;

@Service
public class JobSKillService {
    private final JobSkillReponsitory reponsitory;
    private final JobReponsitory jobReponsitory;
    private final SkillReponsitory skillReponsitory;

    @Autowired

    public JobSKillService(JobSkillReponsitory reponsitory, JobReponsitory jobReponsitory, SkillReponsitory skillReponsitory) {
        this.reponsitory = reponsitory;
        this.jobReponsitory = jobReponsitory;
        this.skillReponsitory = skillReponsitory;
    }
}
