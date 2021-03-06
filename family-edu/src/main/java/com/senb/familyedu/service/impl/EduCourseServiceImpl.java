package com.senb.familyedu.service.impl;

import com.senb.familyedu.entity.EduCourse;
import com.senb.familyedu.dao.EduCourseDao;
import com.senb.familyedu.entity.vo.EduCourseVO;
import com.senb.familyedu.service.EduCourseService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author senb
 * @since 2019-01-03
 */
@Service
public class EduCourseServiceImpl extends ServiceImpl<EduCourseDao, EduCourse> implements EduCourseService {
    @Autowired
    private EduCourseDao eduCourseDao;

    @Override
    public EduCourseVO showCourseById(Integer courseId) {
        return eduCourseDao.showCourseById(courseId);
    }
}
