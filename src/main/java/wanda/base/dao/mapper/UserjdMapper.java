package wanda.base.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wanda.base.pojo.po.Userjd;
import wanda.base.pojo.po.UserjdExample;

public interface UserjdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERJD
     *
     * @mbggenerated Wed Mar 22 10:46:08 CST 2017
     */
    int countByExample(UserjdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERJD
     *
     * @mbggenerated Wed Mar 22 10:46:08 CST 2017
     */
    int deleteByExample(UserjdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERJD
     *
     * @mbggenerated Wed Mar 22 10:46:08 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERJD
     *
     * @mbggenerated Wed Mar 22 10:46:08 CST 2017
     */
    int insert(Userjd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERJD
     *
     * @mbggenerated Wed Mar 22 10:46:08 CST 2017
     */
    int insertSelective(Userjd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERJD
     *
     * @mbggenerated Wed Mar 22 10:46:08 CST 2017
     */
    List<Userjd> selectByExample(UserjdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERJD
     *
     * @mbggenerated Wed Mar 22 10:46:08 CST 2017
     */
    Userjd selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERJD
     *
     * @mbggenerated Wed Mar 22 10:46:08 CST 2017
     */
    int updateByExampleSelective(@Param("record") Userjd record, @Param("example") UserjdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERJD
     *
     * @mbggenerated Wed Mar 22 10:46:08 CST 2017
     */
    int updateByExample(@Param("record") Userjd record, @Param("example") UserjdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERJD
     *
     * @mbggenerated Wed Mar 22 10:46:08 CST 2017
     */
    int updateByPrimaryKeySelective(Userjd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USERJD
     *
     * @mbggenerated Wed Mar 22 10:46:08 CST 2017
     */
    int updateByPrimaryKey(Userjd record);
}