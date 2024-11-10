package za.co.fnb.cish.fid.repo.repository.events;

import jakarta.transaction.Transactional;
import za.co.fnb.cish.fid.repo.model.events.Event;

/*
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
*/

import jakarta.persistence.*;
public class EventRepositoryImpl implements EventRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional
    public void persist(Event event) {
        entityManager.persist(event);
        entityManager.flush();
    }

    @Override
    @Transactional
    public void merge(Event event) {
        entityManager.merge(event);
        entityManager.flush();
    }
}
