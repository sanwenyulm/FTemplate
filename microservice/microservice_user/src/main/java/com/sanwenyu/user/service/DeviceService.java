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

import com.sanwenyu.user.dao.DeviceDao;
import com.sanwenyu.user.pojo.Device;

/**
 * 服务层
 * 
 * @author Administrator
 *
 */
@Service
@Transactional
public class DeviceService {

	@Autowired
	private DeviceDao deviceDao;
	
	@Autowired
	private IdWorker idWorker;

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Device> findAll() {
		return deviceDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Device> findSearch(Map whereMap, int page, int size) {
		Specification<Device> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return deviceDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Device> findSearch(Map whereMap) {
		Specification<Device> specification = createSpecification(whereMap);
		return deviceDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param id
	 * @return
	 */
	public Device findById(String id) {
		return deviceDao.findById(id).get();
	}

	/**
	 * 增加
	 * @param device
	 */
	public void add(Device device) {
		device.setId( idWorker.nextId()+"" );
		deviceDao.save(device);
	}

	/**
	 * 修改
	 * @param device
	 */
	public void update(Device device) {
		deviceDao.save(device);
	}

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(String id) {
		deviceDao.deleteById(id);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Device> createSpecification(Map searchMap) {

		return new Specification<Device>() {

			@Override
			public Predicate toPredicate(Root<Device> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
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
                if (searchMap.get("device_name")!=null && !"".equals(searchMap.get("device_name"))) {
                	predicateList.add(cb.like(root.get("device_name").as(String.class), "%"+(String)searchMap.get("device_name")+"%"));
                }
                // 
                if (searchMap.get("device_sn")!=null && !"".equals(searchMap.get("device_sn"))) {
                	predicateList.add(cb.like(root.get("device_sn").as(String.class), "%"+(String)searchMap.get("device_sn")+"%"));
                }
                // 
                if (searchMap.get("device_os_version")!=null && !"".equals(searchMap.get("device_os_version"))) {
                	predicateList.add(cb.like(root.get("device_os_version").as(String.class), "%"+(String)searchMap.get("device_os_version")+"%"));
                }
                // 
                if (searchMap.get("device_location")!=null && !"".equals(searchMap.get("device_location"))) {
                	predicateList.add(cb.like(root.get("device_location").as(String.class), "%"+(String)searchMap.get("device_location")+"%"));
                }
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
