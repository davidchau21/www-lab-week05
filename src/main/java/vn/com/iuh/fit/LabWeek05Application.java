package vn.com.iuh.fit;

import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.com.iuh.fit.enums.Country;
import vn.com.iuh.fit.models.Address;
import vn.com.iuh.fit.models.Candidate;
import vn.com.iuh.fit.repositories.AddressRepository;
import vn.com.iuh.fit.repositories.CandidateResponsitory;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class LabWeek05Application {

    public static void main(String[] args) {
        SpringApplication.run(LabWeek05Application.class, args);
    }
    @Autowired
    private CandidateResponsitory candidateRepository;

    @Autowired
    private AddressRepository addressRepository;
    @Bean
    CommandLineRunner initData(){
        return args -> {
            Random rnd =new Random();
            for (int i = 1; i < 1000; i++) {
                Address add = new Address(rnd.nextInt(1,1000),"Quang Trung","HCM", Country.VIETNAM,
                        rnd.nextInt(70000,80000)+""," abc");
                addressRepository.save(add);
                Candidate can=new Candidate("Name #"+i,
                        LocalDate.of(1998,rnd.nextInt(1,13),rnd.nextInt(1,29)),
                        add,
                        rnd.nextLong(1111111111L,9999999999L)+"",
                        "email_"+i+"@gmail.com");
                candidateRepository.save(can);
                System.out.println("Added: " +can);
            }
        };
    }

}
