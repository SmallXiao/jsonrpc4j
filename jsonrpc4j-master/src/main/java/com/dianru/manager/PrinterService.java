package com.dianru.manager;

import java.util.List;

import com.dianru.User;

/**
 * User: dzmitry.misiuk
 * Date: 11/14/12
 * Time: 3:47 PM
 */
public interface PrinterService {

    public String printWord(String word);

    public String printUser(User user);

    public StringBuilder printWordArray(List<String> words);
}
