package com.zdd.risk.dao;

import com.zdd.risk.bean.Certification;
import com.zdd.risk.bean.CertificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICertificationDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    long countByExample(CertificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    int insert(Certification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    int insertSelective(Certification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    List<Certification> selectByExampleWithBLOBs(CertificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    List<Certification> selectByExample(CertificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    Certification selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    int updateByExampleSelective(@Param("record") Certification record, @Param("example") CertificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Certification record, @Param("example") CertificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    int updateByExample(@Param("record") Certification record, @Param("example") CertificationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    int updateByPrimaryKeySelective(Certification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Certification record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table risk_certification
     *
     * @mbg.generated Tue Nov 06 15:00:47 CST 2018
     */
    int updateByPrimaryKey(Certification record);
}