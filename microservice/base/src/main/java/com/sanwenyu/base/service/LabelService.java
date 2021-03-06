package com.sanwenyu.base.service;

import com.sanwenyu.base.dao.LabelDao;
import com.sanwenyu.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.IdWorker;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class LabelService {
    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;
    public List<Label> findAll(){
        return labelDao.findAll();
    }

    public Label findById(String id){
        return labelDao.findById(id).get();
    }

    public void save(Label label){
        label.setId(idWorker.nextId()+"");
        labelDao.save(label);
    }
    public void update(Label labelId){
        labelDao.save(labelId);
    }
    public void deleteById(String id){
         labelDao.deleteById(id);
    }

    public  List<Label>  findSearch(Label label) {
        return labelDao.findAll(new Specification<Label>() {
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list  = new ArrayList<>();
                if(label.getLabelname() != null && !"".equals(label.getLabelname())){
                    Predicate predicate = criteriaBuilder.like(root.get("labelname").as(String.class),"%"+label.getLabelname()+"%");
                    list.add(predicate);
                }
                if(label.getState() != null && !"".equals(label.getState())){
                    Predicate predicate = criteriaBuilder.like(root.get("state").as(String.class),label.getState());
                    list.add(predicate);
                }
                Predicate[] parr = new Predicate[list.size()];
                parr = list.toArray(parr);
                return criteriaBuilder.and(parr);
            }
        });
    }

    public Page<Label> findSearchByPage(int page, int size, Label label) {
        //jpa 页数从第0页开始  但是UI一般是第一页开始
        Pageable pageable = PageRequest.of(page-1,size);
        return labelDao.findAll(new Specification<Label>() {
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list  = new ArrayList<>();
                if(label.getLabelname() != null && !"".equals(label.getLabelname())){
                    Predicate predicate = criteriaBuilder.like(root.get("labelname").as(String.class),"%"+label.getLabelname()+"%");
                    list.add(predicate);
                }
                if(label.getState() != null && !"".equals(label.getState())){
                    Predicate predicate = criteriaBuilder.like(root.get("state").as(String.class),label.getState());
                    list.add(predicate);
                }
                Predicate[] parr = new Predicate[list.size()];
                parr = list.toArray(parr);
                return criteriaBuilder.and(parr);
            }
        },pageable);
    }

    public List<Label> recommandLabel(){
        return labelDao.findByRecommend("1");
    }

}
