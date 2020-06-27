package com.zeta.spotlight.demo.service;

import com.zeta.spotlight.demo.model.Badge;
import com.zeta.spotlight.demo.model.Program;
import com.zeta.spotlight.demo.repository.BadgeRepository;
import com.zeta.spotlight.demo.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BadgeService {

    @Autowired
    private BadgeRepository badgeRepository;

    @Autowired
    private ProgramRepository programRepository;

    public void addBadge(Badge badge, Integer programId) {
        System.out.println(programId);
        Optional<Program> program = programRepository.findById(programId);
        if (program.isPresent()) {
            badge.setProgram(program.get());
            badgeRepository.save(badge);
            program.get().addBadge(badge);
            programRepository.save(program.get());
        }
    }
}
