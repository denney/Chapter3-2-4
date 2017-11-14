package com.didispace.entityAndDao.ES_STORAGE;


import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;


/**
 * @author 程序猿DD
 * @version 1.0.0
 * @date 16/3/23 下午2:34.
 * @blog http://blog.didispace.com
 */
public interface H2_esStorange_TablesRepository extends CrudRepository<com.didispace.entityAndDao.ES_STORAGE.Tables,Serializable> {


}
