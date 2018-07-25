/*
 * Copyright 2017 The OpenDSP Project
 *
 * The OpenDSP Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package mobi.f2time.dorado.examples.controller;

import mobi.f2time.dorado.examples.model.Example;
import mobi.f2time.dorado.rest.annotation.Controller;
import mobi.f2time.dorado.rest.annotation.GET;
import mobi.f2time.dorado.rest.annotation.POST;
import mobi.f2time.dorado.rest.annotation.Path;
import mobi.f2time.dorado.rest.annotation.PathVariable;
import mobi.f2time.dorado.rest.annotation.RequestBody;

/**
 * 
 * @author wangwp
 */
@Controller
@Path("/examples")
public class ExamplesController {

	@POST
	@Path
	public Example newExample(@RequestBody Example example) {
		if (example.getId() == 0) {
			example.setId(500);
		}
		System.out.println(example);
		return example;
	}

	@GET
	@Path("/{id:[0-9]+}")
	public Example getExample(@PathVariable("id") int id) {
		Example example = new Example();

		example.setId(100);
		example.setName("300");
		return example;
	}

	@GET
	@Path("/primitive/default")
	// 测试基础类型参数返回值, 如果请求：/primitive/default，a,b,c3个值分别有默认值,
	// 如果请求/primitive/default?a=100则a会输出100
	public String primitiveDefault(int a, double b, float c) {
		return "int: " + a + "double: " + b + "float: " + c;
	}

	@GET
	@Path("/primitive/default/{a}")
	public String getValueFromPathVariable(int a) {
		return String.valueOf(a);
	}
	
	@POST
	@Path("/requestbody/echo")
	public String echoRequestBody(@RequestBody String body) {
		return body;
	}
}
