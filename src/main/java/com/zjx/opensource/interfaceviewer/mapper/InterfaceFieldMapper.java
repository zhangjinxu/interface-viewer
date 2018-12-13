package com.zjx.opensource.interfaceviewer.mapper;

import com.zjx.opensource.interfaceviewer.model.InterfaceField;
import com.zjx.opensource.interfaceviewer.model.InterfaceFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterfaceFieldMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interface_field
     *
     * @mbg.generated
     */
    long countByExample(InterfaceFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interface_field
     *
     * @mbg.generated
     */
    int deleteByExample(InterfaceFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interface_field
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interface_field
     *
     * @mbg.generated
     */
    int insert(InterfaceField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interface_field
     *
     * @mbg.generated
     */
    int insertSelective(InterfaceField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interface_field
     *
     * @mbg.generated
     */
    List<InterfaceField> selectByExample(InterfaceFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interface_field
     *
     * @mbg.generated
     */
    InterfaceField selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interface_field
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") InterfaceField record, @Param("example") InterfaceFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interface_field
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") InterfaceField record, @Param("example") InterfaceFieldExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interface_field
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(InterfaceField record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table interface_field
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(InterfaceField record);
}