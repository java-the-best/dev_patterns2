package com.github.proxy.proxy2;

import com.github.Main;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyMain2 {
  public static void main() {
    InvocationHandler invocationHandler = new ReaderInvocationHandler();
    Object proxyInstance = Proxy.newProxyInstance(
        Main.class.getClassLoader(),
        new Class[]{Reader.class},
        invocationHandler);
    ((Reader) proxyInstance).read("hello");
  }
}

interface Reader {
  String read(String str);
}

class MyReader implements Reader {
  @Override
  public String read(String str) {
    System.out.println(str);
    return str;
  }
}

class ReaderInvocationHandler implements InvocationHandler {
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("до");
    Object result = method.invoke(new MyReader(), args);
    System.out.println("после");
    return result;
  }
}
