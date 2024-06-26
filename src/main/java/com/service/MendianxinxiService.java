package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MendianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MendianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MendianxinxiView;


/**
 * 门店信息
 *
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
public interface MendianxinxiService extends IService<MendianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MendianxinxiVO> selectListVO(Wrapper<MendianxinxiEntity> wrapper);
   	
   	MendianxinxiVO selectVO(@Param("ew") Wrapper<MendianxinxiEntity> wrapper);
   	
   	List<MendianxinxiView> selectListView(Wrapper<MendianxinxiEntity> wrapper);
   	
   	MendianxinxiView selectView(@Param("ew") Wrapper<MendianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MendianxinxiEntity> wrapper);
   	
}

