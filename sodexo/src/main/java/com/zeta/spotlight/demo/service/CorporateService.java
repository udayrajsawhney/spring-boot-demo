package com.zeta.spotlight.demo.service;

import com.zeta.spotlight.demo.model.Corporate;
import com.zeta.spotlight.demo.repository.CorporateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CorporateService {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private CorporateRepository corporateRepository;

    public String addCorporate(Corporate corporate, String authToken) {
        if (authToken.equals(authenticationService.getAdminToken())) {
            corporateRepository.save(corporate);
            return "Corporate Added";
        } else {
            return "Invalid Auth Token";
        }
    }

    public Optional<Corporate> getCorporateById(Integer corpId) {
        return corporateRepository.findById(corpId);
    }

    public List<Corporate> getAllCorporates() {
        return (List<Corporate>) corporateRepository.findAll();
    }

    public String deleteCorporate(Integer corpId) {
        if (corporateRepository.existsById(corpId)) {
            corporateRepository.deleteById(corpId);
            return "Deleted";
        } else {
            return "Does not Exist";
        }
    }
}
