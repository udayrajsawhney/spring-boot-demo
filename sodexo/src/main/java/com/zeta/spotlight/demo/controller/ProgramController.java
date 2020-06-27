package com.zeta.spotlight.demo.controller;

import com.zeta.spotlight.demo.model.Badge;
import com.zeta.spotlight.demo.model.Program;
import com.zeta.spotlight.demo.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/management")
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @PostMapping("/program")
    public @ResponseBody
    String addProgram(@RequestBody Program program) {
        programService.addProgram(program);
        return "Saved";
    }

    @GetMapping("/program/{programId}/badges")
    public @ResponseBody
    List<Badge> getAllBadgesByProgram(@PathVariable Integer programId) {
        return programService.getAllBadgesByProgram(programId);
    }
}
