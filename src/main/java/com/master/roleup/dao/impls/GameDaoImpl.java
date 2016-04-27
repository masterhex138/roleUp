package com.master.roleup.dao.impls;

import com.master.roleup.dao.interfaces.GameDao;
import com.master.roleup.model.TGames;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GameDaoImpl implements GameDao {

    @Autowired
    private SessionFactory sessionFactory;

    public GameDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<TGames> getGames() {
        List<TGames> games = new ArrayList<TGames>();
        games = getSessionFactory().getCurrentSession()
                .createQuery("from TGames").list();
        if (games.size() > 0) {
            return games;
        } else {
            return null;
        }
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public TGames getGame(Integer gameId) {
        List<TGames> games = getSessionFactory().getCurrentSession()
                .createQuery("from TGames where id=?")
                .setParameter(0, gameId).list();

        if (games.size() > 0) {
            return games.get(0);
        } else {
            return null;
        }
    }


}
