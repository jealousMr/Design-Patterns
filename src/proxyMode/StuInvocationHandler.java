package proxyMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StuInvocationHandler<T> implements InvocationHandler {

	T target;
	public StuInvocationHandler(T t) {
		target=t;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("´úÀí"+method.getName());
		Object obj=method.invoke(target, args);
		return obj;
	}
	
	public static void main(String[]args) {
		Person p=new Student("¿¦¿¦");
		InvocationHandler stu=new StuInvocationHandler<Person>(p);
		Person proxy=(Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[] {Person.class}, stu);
		proxy.giveMoney();
	}

}
