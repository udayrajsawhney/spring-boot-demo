package com.zeta.spotlight.demo.repository;

import com.zeta.spotlight.demo.model.IssuanceHistory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IssuanceHistoryRepository extends CrudRepository<IssuanceHistory, Integer> {

    List<IssuanceHistory> findByBeneficiaryIdAndCorpId(Integer beneficiaryId, Integer corpId);

    List<IssuanceHistory> findByTeamIdAndCorpId(Integer teamId, Integer corpId);
}
