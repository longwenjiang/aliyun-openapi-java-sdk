/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.RequestServiceOfCloudDBAResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestServiceOfCloudDBAResponseUnmarshaller {

	public static RequestServiceOfCloudDBAResponse unmarshall(RequestServiceOfCloudDBAResponse requestServiceOfCloudDBAResponse, UnmarshallerContext context) {
		
		requestServiceOfCloudDBAResponse.setRequestId(context.stringValue("RequestServiceOfCloudDBAResponse.RequestId"));
		requestServiceOfCloudDBAResponse.setListData(context.stringValue("RequestServiceOfCloudDBAResponse.ListData"));
		requestServiceOfCloudDBAResponse.setAttrData(context.stringValue("RequestServiceOfCloudDBAResponse.AttrData"));
	 
	 	return requestServiceOfCloudDBAResponse;
	}
}