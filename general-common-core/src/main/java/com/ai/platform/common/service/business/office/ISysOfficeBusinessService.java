package com.ai.platform.common.service.business.office;

import com.ai.opt.base.vo.PageInfo;
import com.ai.platform.common.api.office.param.OfficeAllQueryRequest;
import com.ai.platform.common.api.office.param.OfficeAllQueryResponse;
import com.ai.platform.common.api.office.param.OfficeChildrenListQueryRequest;
import com.ai.platform.common.api.office.param.OfficeChildrenListQueryResponse;
import com.ai.platform.common.api.office.param.OfficeDetailQueryRequest;
import com.ai.platform.common.api.office.param.OfficeDetailQueryResponse;
import com.ai.platform.common.api.office.param.OfficeParentListQueryRequest;
import com.ai.platform.common.api.office.param.OfficeParentListQueryResponse;
import com.ai.platform.common.api.office.param.OfficeVO;

public interface ISysOfficeBusinessService {
	/**
	 * 查询机构详情
	 * @param queryRequest
	 * @return
	 */
	OfficeDetailQueryResponse queryOfficeDetail(OfficeDetailQueryRequest queryRequest);
	
	/**
	 * 查询本身及上级组织机构
	 * @param queryRequest
	 * @return
	 */
	OfficeParentListQueryResponse queryParentOfficeList(OfficeParentListQueryRequest queryRequest);
	
	/**
	 * 查询下级组织机构
	 * @param queryRequest
	 * @return
	 */
	OfficeChildrenListQueryResponse queryChildrenOfficeList(OfficeChildrenListQueryRequest queryRequest);

	/**
	 * 查询租户id下所有组织机构
	 * @param queryRequest
	 * @return
	 */
	PageInfo<OfficeVO> queryOfficeAll(OfficeAllQueryRequest queryRequest);


}
