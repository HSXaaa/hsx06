package hsx.com.test;

import hsx.com.service.JavaWork;
import hsx.com.service.Lisi;

public class Test {

	/**
	 * ����ִ������
	 * @param args
	 */
	public static void main(String[] args) {
		JavaWork javaWork=new JavaWork();
		// javaWork.setTester(new ZhangSan());
		javaWork.setTester(new Lisi());
		javaWork.doTest();
	}
}
