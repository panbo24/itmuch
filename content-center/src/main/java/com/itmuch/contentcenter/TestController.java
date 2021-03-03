package com.itmuch.contentcenter;

import com.itmuch.contentcenter.dao.content.ShareMapper;
import com.itmuch.contentcenter.domain.entity.content.Share;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 类名: TestController
 * 描述: TODO
 * 姓名: 阿法
 * 日期: 2021-02-08 15:36
 **/
@RestController
public class TestController {
    @Autowired
    private ShareMapper shareMapper;
    @GetMapping("/test")
    public Share testInsert() {
        Share share = new Share();
        share.setAuthor("tetsAuthor");
        share.setCreateTime(new Date());
        share.setUpdateTime(new Date());
        share.setTitle("XXX");
        share.setCover("XXX");
        share.setBuyCount(1);
        this.shareMapper.insertSelective(share);

        return share;

    }
}
