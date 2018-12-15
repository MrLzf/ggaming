package com.ggaming.service.impl;

import com.ggaming.domain.Game;
import com.ggaming.mapper.GameMapper;
import com.ggaming.service.GameService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameMapper gameMapper;


    @Override
    public List<Game> getList() {
        return gameMapper.getList();
    }

    @Override
    public PageInfo queryPage() {
        List list=gameMapper.getGameList();
        return new PageInfo(list);
    }

    @Override
    public Game fineByGameId(String s) {
        return gameMapper.fineByGameId(s);
    }
}
