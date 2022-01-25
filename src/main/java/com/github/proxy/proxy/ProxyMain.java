package com.github.proxy.proxy;

public class ProxyMain {
  public static void main() {
    Reader reader = new ProxyReader();
    reader.read("hello");
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

class ProxyReader extends MyReader {
  @Override
  public String read(String str) {
    System.out.println("до");
    String str2 = super.read(str);
    System.out.println("после");
    return str2;
  }
}
