package com.senb.familyedu.service.impl;

import com.senb.familyedu.entity.EduSelect;
import com.senb.familyedu.dao.EduSelectDao;
import com.senb.familyedu.entity.vo.EduSelectVO;
import com.senb.familyedu.service.EduSelectService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author senb
 * @since 2019-01-03
 */
@Service
public class EduSelectServiceImpl extends ServiceImpl<EduSelectDao, EduSelect> implements EduSelectService {
    @Autowired
    private EduSelectDao eduSelectDao;

    @Override
    public List<EduSelectVO> selectCourseByUserId(Integer userId) {
        return eduSelectDao.selectCourseByUserId(userId);
    }
}
