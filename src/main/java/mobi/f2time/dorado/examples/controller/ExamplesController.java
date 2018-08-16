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
import mobi.f2time.dorado.examples.service.ExampleService;
import mobi.f2time.dorado.rest.annotation.Controller;
import mobi.f2time.dorado.rest.annotation.GET;
import mobi.f2time.dorado.rest.annotation.POST;
import mobi.f2time.dorado.rest.annotation.Path;
import mobi.f2time.dorado.rest.annotation.PathVariable;
import mobi.f2time.dorado.rest.annotation.RequestBody;
import mobi.f2time.dorado.rest.http.MultipartFile;

/**
 * 
 * @author wangwp
 */
@Controller
@Path("/examples")
public class ExamplesController {

	//@Autowired
	private ExampleService exampleService;
	
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
		example.setAddress("非凡互联北京科技开发有限公司(喀什)");
		
		exampleService.hello();
		System.out.println(exampleService+"////////");
		return example;
	}

	@GET
	@Path("/primitive/default")
	// 测试基础类型参数返回值, 如果请求：/primitive/default，a,b,c3个值分别有默认值,
	// 如果请求/primitive/default?a=100则a会输出100
	public String primitiveDefault(int a, double b, float c, boolean d) {
		return "int: " + a + "double: " + b + "float: " + c+", d: "+d+"google";
	}

	@GET
	@Path("/primitive/default/{a}")
	public String getValueFromPathVariable(int a) {
		return String.valueOf(a);
	}

	@POST
	@Path("/requestbody/echo")
	public String echoRequestBody(@RequestBody String body,String name) {
		System.out.println("xxxxxxx+//xxxxxxxx"
				+ ""
				+ "");
		return body+"xxxxxx"+name;
	}
	
	@Path("/delete/{id}")
	public String deleteExample(@PathVariable("id") int exampleId) {
		System.out.println("delete example, exampleId: "+exampleId);
		
		return String.format("delete example ok, exampleId: %d", exampleId);
	}
	
	@Path("/file/upload")
	@POST
	public String uploadFile(MultipartFile[] fs,String name) {
		for(MultipartFile f:fs) {
		System.out.println(f.getName());
		System.out.println(f.getContentType());
		System.out.println(f.getSize());
		}
		return "OK";
		//return String.format("name: %s, file info: %s", name,f.toString());
	}
}
