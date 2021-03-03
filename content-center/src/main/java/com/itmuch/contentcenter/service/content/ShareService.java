package com.itmuch.contentcenter.service.content;

import com.itmuch.contentcenter.dao.content.ShareMapper;
import com.itmuch.contentcenter.domain.dto.content.ShareDTO;
import com.itmuch.contentcenter.domain.dto.user.UserDTO;
import com.itmuch.contentcenter.domain.entity.content.Share;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 类名: ShareService
 * 描述: TODO
 * 姓名: 阿法
 * 日期: 2021-03-02 17:18
 **/
@Service
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class ShareService {
    private final ShareMapper shareMapper;
    private final RestTemplate restTemplate;
    public ShareDTO findById(Integer id) {

        Share share = this.shareMapper.selectByPrimaryKey(id);

        Integer userId = share.getUserId();

        //怎么调用usercontent微服务呢？ 1、restTemplate 轻量级httpClient
        UserDTO userDTO = this.restTemplate.getForObject(
                "http://localhost:8081/users/1",
                UserDTO.class, userId);

        //消息的装配
        ShareDTO shareDTO = new ShareDTO();
        BeanUtils.copyProperties(share, shareDTO);
        shareDTO.setWxNickname(userDTO.getWxNickname());
        return shareDTO;

    }

}
