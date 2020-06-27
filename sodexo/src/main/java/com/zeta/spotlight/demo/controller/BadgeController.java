package com.zeta.spotlight.demo.controller;

import com.zeta.spotlight.demo.model.Badge;
import com.zeta.spotlight.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/management")
public class BadgeController {

    @Autowired
    private BadgeService badgeService;

    @PostMapping("/{programId}/badge")
    public @ResponseBody
    String addBadge(@RequestBody Badge badge, @PathVariable Integer programId) {
        badgeService.addBadge(badge, programId);
        return "Badge Added";
    }
}
