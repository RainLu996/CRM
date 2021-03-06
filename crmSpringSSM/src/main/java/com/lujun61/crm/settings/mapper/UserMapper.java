package com.lujun61.crm.settings.mapper;

import com.lujun61.crm.settings.domain.User;

import java.util.Map;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Sat Oct 17 10:03:12 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Sat Oct 17 10:03:12 CST 2020
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Sat Oct 17 10:03:12 CST 2020
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Sat Oct 17 10:03:12 CST 2020
     */
    User selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Sat Oct 17 10:03:12 CST 2020
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Sat Oct 17 10:03:12 CST 2020
     */
    int updateByPrimaryKey(User record);

    /**
     * @param map 封装的参数
     * @return com.lujun61.crm.settings.domain.User
     * @description 根据登录用户名及密码查询数据库信息
     * @author Jun Lu
     * @date 2022-05-05 17:50:40
     */
    User queryUserByLoginActAndPwd(Map<String, Object> map);
}