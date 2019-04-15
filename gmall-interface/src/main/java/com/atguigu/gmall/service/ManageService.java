package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.*;

import java.util.List;

public interface ManageService {

    /**
     * 查询所有的一级分类
     * @return
     */
    public List<BaseCatalog1> getBaseCatalog1();

    public List<BaseCatalog2> getBaseCatalog2(String catalog1Id);

    public List<BaseCatalog3> getBaseCatalog3(String catalog2Id);

    /**
     * 快速跳转  ctrl + alt + b
     * @param catalog3Id
     * @return
     */
    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 根据attrId查询BaseAttrInfo
     * @param attrId
     * @return
     */
    BaseAttrInfo getAttrInfo(String attrId);


    /**
     *
     * @param spuInfo
     * @return
     */
    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

}
