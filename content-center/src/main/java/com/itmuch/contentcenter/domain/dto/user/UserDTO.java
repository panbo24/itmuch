package com.itmuch.contentcenter.domain.dto.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类名: UserDTO
 * 描述: TODO
 * 姓名: 阿法
 * 日期: 2021-03-02 17:57
 **/
@Data
public class UserDTO {

    private Integer id;


    private String wxId;


    private String wxNickname;


    private String roles;


    private String avatarUrl;



    private Date createTime;

    private Date updateTime;

    /**
     * 积分
     */
    private Integer bonus;

    /**
     * 获取Id
     *
     * @return id - Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置Id
     *
     * @param id Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取微信id
     *
     * @return wx_id - 微信id
     */
    public String getWxId() {
        return wxId;
    }

    /**
     * 设置微信id
     *
     * @param wxId 微信id
     */
    public void setWxId(String wxId) {
        this.wxId = wxId;
    }

    /**
     * 获取微信昵称
     *
     * @return wx_nickname - 微信昵称
     */
    public String getWxNickname() {
        return wxNickname;
    }

    /**
     * 设置微信昵称
     *
     * @param wxNickname 微信昵称
     */
    public void setWxNickname(String wxNickname) {
        this.wxNickname = wxNickname;
    }

    /**
     * 获取角色
     *
     * @return roles - 角色
     */
    public String getRoles() {
        return roles;
    }

    /**
     * 设置角色
     *
     * @param roles 角色
     */
    public void setRoles(String roles) {
        this.roles = roles;
    }

    /**
     * 获取头像地址
     *
     * @return avatar_url - 头像地址
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 设置头像地址
     *
     * @param avatarUrl 头像地址
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取积分
     *
     * @return bonus - 积分
     */
    public Integer getBonus() {
        return bonus;
    }

    /**
     * 设置积分
     *
     * @param bonus 积分
     */
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
}
