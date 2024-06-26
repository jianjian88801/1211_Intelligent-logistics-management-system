package com.dao;

import com.entity.MendianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MendianxinxiVO;
import com.entity.view.MendianxinxiView;


/**
 * 门店信息
 * 
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
public interface MendianxinxiDao extends BaseMapper<MendianxinxiEntity> {
	
	List<MendianxinxiVO> selectListVO(@Param("ew") Wrapper<MendianxinxiEntity> wrapper);
	
	MendianxinxiVO selectVO(@Param("ew") Wrapper<MendianxinxiEntity> wrapper);
	
	List<MendianxinxiView> selectListView(@Param("ew") Wrapper<MendianxinxiEntity> wrapper);

	List<MendianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<MendianxinxiEntity> wrapper);
	
	MendianxinxiView selectView(@Param("ew") Wrapper<MendianxinxiEntity> wrapper);
	
}
