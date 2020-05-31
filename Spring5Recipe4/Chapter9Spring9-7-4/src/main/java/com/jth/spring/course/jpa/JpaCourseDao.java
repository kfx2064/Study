package com.jth.spring.course.jpa;

import com.jth.spring.course.Course;
import com.jth.spring.course.CourseDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.zip.CheckedOutputStream;

public class JpaCourseDao implements CourseDao {

    private final EntityManagerFactory entityManagerFactory;

    public JpaCourseDao(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public Course store(Course course) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();
        try {
            tx.begin();
            Course persisted = manager.merge(course);
            tx.commit();
            return persisted;
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        } finally {
            manager.close();
        }
    }

    @Override
    public void delete(Long courseId) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        EntityTransaction tx = manager.getTransaction();
        try {
            tx.begin();
            Course course = manager.find(Course.class, courseId);
            manager.remove(course);
            tx.commit();
        } catch (RuntimeException e) {
            tx.rollback();
            throw e;
        } finally {
            manager.close();
        }
    }

    @Override
    public Course findById(Long courseId) {
        EntityManager manager = entityManagerFactory.createEntityManager();
        try {
            return manager.find(Course.class, courseId);
        } finally {
            manager.close();
        }
    }

    @Override
    public List<Course> findAll() {
        EntityManager manager = entityManagerFactory.createEntityManager();
        try {
            TypedQuery<Course> query = manager.createQuery("select course from Course corse", Course.class);
            return query.getResultList();
        } finally {
            manager.close();
        }
    }
}
