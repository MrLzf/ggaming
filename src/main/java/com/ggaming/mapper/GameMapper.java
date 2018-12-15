package com.ggaming.mapper;

import com.ggaming.domain.Game;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GameMapper {
    int deleteByPrimaryKey(String gameid);

    int insert(Game record);

    int insertSelective(Game record);

    Game selectByPrimaryKey(String gameid);

    int updateByPrimaryKeySelective(Game record);

    int updateByPrimaryKey(Game record);
    
    /**获取有效的游戏,排除大厅和捕鱼2*/
    List<Game> getList();
    /**获取有效的游戏,排除大厅和捕鱼2*/
    List getGameList();
    
    /**根据类型获取有效的游戏*/
    List<Game> typeByList(String type);
    
    List<Game> getgameListBybak1(Integer bak1);

    Game fineByGameId(String gameId);
}