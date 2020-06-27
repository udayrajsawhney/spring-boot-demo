package com.zeta.spotlight.demo.controller;

import com.zeta.spotlight.demo.model.IssuanceHistory;
import com.zeta.spotlight.demo.service.RecognitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/management")
public class RecognitionController {

    @Autowired
    private RecognitionService recognitionService;


    @PostMapping("/recognition/{corpId}/employee")
    public @ResponseBody
    String addEmployeeRecognition(@RequestBody IssuanceHistory issuance, @PathVariable Integer corpId) {
        System.out.println(issuance);
        recognitionService.addRecognition(issuance);
        return "Saved";
    }

    @GetMapping("/recognition/{corpId}/employee/{empId}")
    public @ResponseBody
    List<IssuanceHistory> getEmployeeRecognitions(@PathVariable Integer empId, @PathVariable Integer corpId) {
        return recognitionService.getRecognitionByEmployee(empId, corpId);
    }

    @GetMapping("/recognition/{corpId}/team/{teamId}")
    public @ResponseBody
    List<IssuanceHistory> getTeamRecognitions(@PathVariable Integer teamId, @PathVariable Integer corpId) {
        return recognitionService.getRecognitionsByTeam(teamId, corpId);
    }
}
