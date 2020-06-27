package com.zeta.spotlight.demo.service;

import com.zeta.spotlight.demo.model.IssuanceHistory;
import com.zeta.spotlight.demo.repository.IssuanceHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecognitionService {

    @Autowired
    private IssuanceHistoryRepository issuanceHistoryRepository;

    public void addRecognition(IssuanceHistory issuance) {
        issuanceHistoryRepository.save(issuance);
    }

    public List<IssuanceHistory> getRecognitionByEmployee(Integer empId, Integer coprId) {
        return issuanceHistoryRepository.findByBeneficiaryIdAndCorpId(empId, coprId);
    }

    public List<IssuanceHistory> getRecognitionsByTeam(Integer teamId, Integer corpId) {
        return issuanceHistoryRepository.findByTeamIdAndCorpId(teamId, corpId);
    }
}
