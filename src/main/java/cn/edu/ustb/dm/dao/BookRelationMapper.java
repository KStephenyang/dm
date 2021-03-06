package cn.edu.ustb.dm.dao;

import cn.edu.ustb.dm.model.BookRelation;
import cn.edu.ustb.dm.model.BookRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_relation
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int countByExample(BookRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_relation
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int deleteByExample(BookRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_relation
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int insert(BookRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_relation
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int insertSelective(BookRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_relation
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    List<BookRelation> selectByExample(BookRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_relation
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExampleSelective(@Param("record") BookRelation record, @Param("example") BookRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_relation
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    int updateByExample(@Param("record") BookRelation record, @Param("example") BookRelationExample example);
}