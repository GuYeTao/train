package com.example.train.batch.controller.admin;

import com.example.train.common.context.LoginMemberContext;
import com.example.train.common.resp.CommonResp;
import com.example.train.common.resp.PageResp;
import com.example.train.batch.req.MemberQueryReq;
import com.example.train.batch.req.MemberSaveReq;
import com.example.train.batch.resp.MemberQueryResp;
import com.example.train.batch.service.MemberService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/member")
public class MemberAdminController {

    @Resource
    private MemberService memberService;

    @PostMapping("/save")
    public CommonResp<Object> save(@Valid @RequestBody MemberSaveReq req) {
        memberService.save(req);
        return new CommonResp<>();
    }

    @GetMapping("/query-list")
    public CommonResp<PageResp<MemberQueryResp>> queryList(@Valid MemberQueryReq req) {
        PageResp<MemberQueryResp> list = memberService.queryList(req);
        return new CommonResp<>(list);
    }

    @DeleteMapping("/delete/{id}")
    public CommonResp<Object> delete(@PathVariable Long id) {
        memberService.delete(id);
        return new CommonResp<>();
    }

}
