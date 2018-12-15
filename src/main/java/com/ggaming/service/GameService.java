package com.ggaming.service;

import com.ggaming.domain.Game;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface GameService {
     List<Game> getList();

     PageInfo queryPage();

     Game fineByGameId(String s);
}
