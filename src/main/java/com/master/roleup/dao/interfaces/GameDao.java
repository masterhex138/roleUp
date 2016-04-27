
package com.master.roleup.dao.interfaces;

import com.master.roleup.model.TGames;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public interface GameDao {
    List<TGames> getGames();
    TGames getGame(Integer gameId);
}
