package project.daihao18.panel.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import project.daihao18.panel.entity.DetectLog;
import project.daihao18.panel.mapper.DetectLogMapper;
import project.daihao18.panel.service.DetectLogService;

/**
 * @ClassName: DetectLogServiceImpl
 * @Description:
 * @Author: code18
 * @Date: 2020-10-07 21:25
 */
@Service
@Slf4j
public class DetectLogServiceImpl extends ServiceImpl<DetectLogMapper, DetectLog> implements DetectLogService {
}