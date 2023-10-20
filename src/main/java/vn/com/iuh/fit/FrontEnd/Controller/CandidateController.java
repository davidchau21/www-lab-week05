package vn.com.iuh.fit.FrontEnd.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.com.iuh.fit.BackEnd.repositories.CandidateReponsitory;
import vn.com.iuh.fit.BackEnd.services.CandidateService;

@Controller
public class CandidateController {
    @Autowired
    private CandidateReponsitory candidateRepository;
    @Autowired
    private CandidateService candidateServices;

    @GetMapping("/list")
    public String showCandidateList(Model model) {
        model.addAttribute("candidates", candidateRepository.findAll());
        return "candidates/candidates";
    }

}
