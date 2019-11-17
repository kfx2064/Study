package com.jth.spring.course;

import java.util.List;

public interface CourseDao {

    Course store(Course course);

    void delete(Long coureId);

    Course findById(Long courseId);

    List<Course> findAll();

}
