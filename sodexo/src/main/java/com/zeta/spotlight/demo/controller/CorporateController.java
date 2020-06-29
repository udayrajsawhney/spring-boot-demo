package com.zeta.spotlight.demo.controller;

import com.zeta.spotlight.demo.model.Corporate;
import com.zeta.spotlight.demo.model.CorporateAdmin;
import com.zeta.spotlight.demo.service.CorporateAdminService;
import com.zeta.spotlight.demo.service.CorporateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/management/corp")
public class CorporateController {

    @Autowired
    private CorporateService corporateService;

    @Autowired
    private CorporateAdminService corporateAdminService;

    @PostMapping("/add")
    public @ResponseBody
    String addCorporate(@RequestBody Corporate corporate, @RequestParam String token) {
        return corporateService.addCorporate(corporate, token);
    }

    @PostMapping("/admin")
    public ResponseEntity<Object> addCorporateAdmin(@RequestBody CorporateAdmin corporateAdmin) {
        corporateAdminService.addCorporateAdmin(corporateAdmin);
        HashMap<String, String> data = new HashMap<>();
        data.put("message", "New Admin User Created");
        return new ResponseEntity<>(data, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("")
    public @ResponseBody
    List<Corporate> getAllCorporates() {
        return corporateService.getAllCorporates();
    }

    @GetMapping("/{corpId}")
    public ResponseEntity<Object> getCorporateById(@PathVariable Integer corpId) {
        Optional<Corporate> corporate = corporateService.getCorporateById(corpId);
        HashMap<String, String> msg = new HashMap<>();
        return corporate
                .map(value -> new ResponseEntity<Object>(value, HttpStatus.FOUND))
                .orElseGet(() -> {
                    msg.put("Message", "Not Found");
                    return new ResponseEntity<>(msg, new HttpHeaders(), HttpStatus.NOT_FOUND);
                });
    }

    @DeleteMapping("/delete/{corpId}")
    public @ResponseBody
    String deleteCorporationById(@PathVariable Integer corpId) {
        return corporateService.deleteCorporate(corpId);
    }
}
