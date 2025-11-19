package com.eezd.main.controller;

import com.eezd.common.core.BaseController;
import com.eezd.common.core.domain.R;
import com.eezd.main.domain.Test;
import com.eezd.main.service.ITestService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class HelloController extends BaseController {

    private final ITestService testService;

    @GetMapping("/")
    public R<String> hello() {
        return R.ok("Hello, World!");
    }

    @GetMapping("/test/1")
    public R<Test> test() {
        return R.ok(testService.queryById(1L));
    }
}
