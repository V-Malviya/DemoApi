package com.YashSharma.demoApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tenant")
public class tenantcontroller {
    @GetMapping()
    public String getTenantString(@RequestParam(name = "tenantId") String tenantId)
    {
        return "Hello we succesfully recived request from" + tenantId;
    }
}
