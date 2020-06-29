package com.zeta.spotlight.demo.service;

import com.zeta.spotlight.demo.model.CorporateAdmin;
import com.zeta.spotlight.demo.repository.CorporateAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CorporateAdminService {

    @Autowired
    private CorporateAdminRepository corporateAdminRepository;

    public void addCorporateAdmin(CorporateAdmin corporateAdmin) {
        corporateAdminRepository.save(corporateAdmin);
    }

    public Optional<CorporateAdmin> getCorporateAdmin(String email) {
        return corporateAdminRepository.findByEmail(email);
    }
}
