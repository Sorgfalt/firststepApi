package com.firstStepApi.common.response;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DataResponseService{
	public<T> SingleDataResponse<T> getSingleDataResponse(T data){
		SingleDataResponse<T> singleDataResponse = new SingleDataResponse<>();
		singleDataResponse.data = data;

		return  singleDataResponse;
	}

	public<T> ListDataResponse<T> getListDataResponse(List<T> dataList){
		ListDataResponse<T> listDataResponse = new ListDataResponse<>();
		listDataResponse.dataList = dataList;

		return listDataResponse;
	}

	void setSuccessResponse(CommonResponse response){
		response.success= true;
		response.code = 0;
		response.message = "success";
	}


}
