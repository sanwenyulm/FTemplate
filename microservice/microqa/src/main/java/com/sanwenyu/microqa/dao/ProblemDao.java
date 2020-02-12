package com.sanwenyu.microqa.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sanwenyu.microqa.pojo.Problem;
import org.springframework.data.jpa.repository.Query;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface ProblemDao extends JpaRepository<Problem,String>,JpaSpecificationExecutor<Problem>{

    @Query(value = "SELECT * from tb_problem,tb_pl WHERE id = problemid and  labelid = ? ORDER BY replytime DESC",nativeQuery = true)
    public Page<Problem> newProblemList(String labelid, Pageable pageable);

    @Query(value = "SELECT * from tb_problem,tb_pl WHERE id = problemid and  labelid = ? ORDER BY reply DESC",nativeQuery = true)
    public Page<Problem> hostProblemList(String labelid, Pageable pageable);

    @Query(value = "SELECT * from tb_problem,tb_pl WHERE id = problemid and  labelid = ? and reply = 0 ORDER BY createtime DESC",nativeQuery = true)
    public Page<Problem> waitProblemList(String labelid, Pageable pageable);
}
