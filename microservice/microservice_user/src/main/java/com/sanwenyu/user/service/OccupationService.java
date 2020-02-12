package com.sanwenyu.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.IdWorker;

import com.sanwenyu.user.dao.OccupationDao;
import com.sanwenyu.user.pojo.Occupation;

/**
 * 服务层
 * 
 * @author Administrator
 *
 */
@Service
@Transactional
public class OccupationService {

	@Autowired
	private OccupationDao occupationDao;
	
	@Autowired
	private IdWorker idWorker;

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Occupation> findAll() {
		return occupationDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Occupation> findSearch(Map whereMap, int page, int size) {
		Specification<Occupation> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return occupationDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Occupation> findSearch(Map whereMap) {
		Specification<Occupation> specification = createSpecification(whereMap);
		return occupationDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param id
	 * @return
	 */
	public Occupation findById(String id) {
		return occupationDao.findById(id).get();
	}

	/**
	 * 增加
	 * @param occupation
	 */
	public void add(Occupation occupation) {
		occupation.setId( idWorker.nextId()+"" );
		occupationDao.save(occupation);
	}

	/**
	 * 修改
	 * @param occupation
	 */
	public void update(Occupation occupation) {
		occupationDao.save(occupation);
	}

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(String id) {
		occupationDao.deleteById(id);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Occupation> createSpecification(Map searchMap) {

		return new Specification<Occupation>() {

			@Override
			public Predicate toPredicate(Root<Occupation> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 
                if (searchMap.get("id")!=null && !"".equals(searchMap.get("id"))) {
                	predicateList.add(cb.like(root.get("id").as(String.class), "%"+(String)searchMap.get("id")+"%"));
                }
                // 
                if (searchMap.get("uid")!=null && !"".equals(searchMap.get("uid"))) {
                	predicateList.add(cb.like(root.get("uid").as(String.class), "%"+(String)searchMap.get("uid")+"%"));
                }
                // 
                if (searchMap.get("home")!=null && !"".equals(searchMap.get("home"))) {
                	predicateList.add(cb.like(root.get("home").as(String.class), "%"+(String)searchMap.get("home")+"%"));
                }
                // 
                if (searchMap.get("company")!=null && !"".equals(searchMap.get("company"))) {
                	predicateList.add(cb.like(root.get("company").as(String.class), "%"+(String)searchMap.get("company")+"%"));
                }
                // 
                if (searchMap.get("occupation")!=null && !"".equals(searchMap.get("occupation"))) {
                	predicateList.add(cb.like(root.get("occupation").as(String.class), "%"+(String)searchMap.get("occupation")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
