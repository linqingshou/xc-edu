package com.xuecheng.manage_cms.service;

import com.xuecheng.framework.domain.cms.CmsConfig;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;

public interface PageService {

    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);

    public CmsPageResult add(CmsPage cmsPage);

    public CmsPage getById(String id);

    public CmsPageResult edit(String id ,CmsPage cmsPage);

    public ResponseResult delete(String id);

    public CmsConfig getConfigById(String id);
}
