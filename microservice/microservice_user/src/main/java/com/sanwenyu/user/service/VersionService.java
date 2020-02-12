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

import com.sanwenyu.user.dao.VersionDao;
import com.sanwenyu.user.pojo.Version;

/**
 * 服务层
 * 
 * @author Administrator
 *
 */
@Service
@Transactional
public class VersionService {

	@Autowired
	private VersionDao versionDao;
	
	@Autowired
	private IdWorker idWorker;

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Version> findAll() {
		return versionDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Version> findSearch(Map whereMap, int page, int size) {
		Specification<Version> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return versionDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Version> findSearch(Map whereMap) {
		Specification<Version> specification = createSpecification(whereMap);
		return versionDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param id
	 * @return
	 */
	public Version findById(String id) {
		return versionDao.findById(id).get();
	}

	/**
	 * 增加
	 * @param version
	 */
	public void add(Version version) {
		version.setId( idWorker.nextId()+"" );
		versionDao.save(version);
	}

	/**
	 * 修改
	 * @param version
	 */
	public void update(Version version) {
		versionDao.save(version);
	}

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(String id) {
		versionDao.deleteById(id);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Version> createSpecification(Map searchMap) {

		return new Specification<Version>() {

			@Override
			public Predicate toPredicate(Root<Version> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
                // 
                if (searchMap.get("id")!=null && !"".equals(searchMap.get("id"))) {
                	predicateList.add(cb.like(root.get("id").as(String.class), "%"+(String)searchMap.get("id")+"%"));
                }
                // 
                if (searchMap.get("appname")!=null && !"".equals(searchMap.get("appname"))) {
                	predicateList.add(cb.like(root.get("appname").as(String.class), "%"+(String)searchMap.get("appname")+"%"));
                }
                // 
                if (searchMap.get("appversion")!=null && !"".equals(searchMap.get("appversion"))) {
                	predicateList.add(cb.like(root.get("appversion").as(String.class), "%"+(String)searchMap.get("appversion")+"%"));
                }
                // 
                if (searchMap.get("version_des")!=null && !"".equals(searchMap.get("version_des"))) {
                	predicateList.add(cb.like(root.get("version_des").as(String.class), "%"+(String)searchMap.get("version_des")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
