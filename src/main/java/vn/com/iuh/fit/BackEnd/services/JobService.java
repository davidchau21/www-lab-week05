package vn.com.iuh.fit.BackEnd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.iuh.fit.BackEnd.repositories.JobReponsitory;

@Service
public class JobService {
    @Autowired
    JobReponsitory reponsitory;
}
