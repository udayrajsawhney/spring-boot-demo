package com.zeta.spotlight.demo.service;

import com.zeta.spotlight.demo.model.Badge;
import com.zeta.spotlight.demo.model.Program;
import com.zeta.spotlight.demo.repository.BadgeRepository;
import com.zeta.spotlight.demo.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProgramService {

    @Autowired
    private ProgramRepository programRepository;

    @Autowired
    private BadgeRepository badgeRepository;

    public void addProgram(Program program) {
        programRepository.save(program);
    }

    public List<Badge> getAllBadgesByProgram(Integer programId) {
        Optional<Program> program = programRepository.findById(programId);
        return program.map(value -> badgeRepository.findByProgram(value)).orElseGet(ArrayList::new);
    }
}
