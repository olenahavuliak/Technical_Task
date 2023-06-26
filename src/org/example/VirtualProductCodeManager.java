package org.example;
//TODO 1). Create singleton class which will check the code is used already or not
// Singleton class should have the possibility to mark code as used and check if code used
// Example:
// singletonClass.useCode("xxx")
// boolean isCodeUsed = virtualProductCodeManager.isCodeUsed("xxx") --> true;
// boolean isCodeUsed = virtualProductCodeManager.isCodeUsed("yyy") --> false;


import java.util.HashSet;
import java.util.Set;

public class VirtualProductCodeManager {
  private static VirtualProductCodeManager virtualProductCodeManager;
  private static Set<String> codes;

  private VirtualProductCodeManager(){
    codes = new HashSet<>();
  }

  public static VirtualProductCodeManager getInstance(){
    if(virtualProductCodeManager == null){
      virtualProductCodeManager = new VirtualProductCodeManager();
    }
    return virtualProductCodeManager;
  }
  public static boolean isCodeUsed(String code){
    return codes.contains(code);
  }
  public void useCode(String code){
    codes.add(code);
  }

}
