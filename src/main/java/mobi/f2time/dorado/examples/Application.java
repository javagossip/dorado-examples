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
package mobi.f2time.dorado.examples;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;

import mobi.f2time.dorado.rest.server.DoradoServer;
import mobi.f2time.dorado.rest.server.DoradoServerBuilder;

/**
 * 
 * @author wangwp
 */
@Configuration
@Import({MyBatisConfig.class})
public class Application {
	
	@Bean
    public PropertyPlaceholderConfigurer dataSourceConfig() {
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setLocations(new ClassPathResource("application.properties"));
        return ppc;
    }
	
	public static void main(String[] args) {
		// 启动server,更多参数请参考DoradoServerBuilder
		DoradoServer server = DoradoServerBuilder.forPort(19999).maxPacketLength(1024*1024*10)
				.springOn().build();
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		//SpringContainer.create(ctx);

		server.start();
	}
}
