package za.co.fnb.cish.fid.repo.repository.events;

import za.co.fnb.cish.fid.repo.model.events.Event;

public interface EventRepositoryCustom {


    void persist(Event event);
    void merge(Event event);

}
