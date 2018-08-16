/**
 * 
 */
package mobi.f2time.dorado.examples.service.impl;

import mobi.f2time.dorado.examples.service.ExampleService;

/**
 * @author marta
 *
 */
//@Service
public class ExampleServiceImpl implements ExampleService {

	public ExampleServiceImpl() {
		super();
		System.out.println("====init=== exampleServiceImpl");
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see mobi.f2time.dorado.examples.service.ExampleService#hello()
	 */
	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("xxxxxxxxxxx============, hello");
	}

}
