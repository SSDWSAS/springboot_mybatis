package org.gdupt.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.gdupt.bean.Pet;

import java.util.List;

/**
 * @author czy
 * @create 2021-08-09 14:22
 */
@Mapper//使用单个注解标志是mapper接口 , 或者使用MapperScan全部扫描,需要放在启动器里面
public interface PetMapper {

    public List<Pet> queryAllPet();

    /**
     * 纯注解的方式
     *
     * @param id
     * @return
     */
    @Select("select * from tb_pet where petid=#{id}")
    public Pet getPetById(Integer id);

}
