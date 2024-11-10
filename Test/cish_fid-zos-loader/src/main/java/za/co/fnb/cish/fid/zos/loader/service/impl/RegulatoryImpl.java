package za.co.fnb.cish.fid.zos.loader.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.repo.model.events.Event;
import za.co.fnb.cish.fid.repo.model.events.RegulatoryLogs;
import za.co.fnb.cish.fid.repo.repository.events.EventRepository;
import za.co.fnb.cish.fid.repo.repository.events.RegulatoryRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class RegulatoryImpl {

    private EventRepository eventRepository;
    private RegulatoryRepository regulatoryRepository;

    @Autowired
    public void setRegulatoryRepository(RegulatoryRepository regulatoryRepository) {
        this.regulatoryRepository = regulatoryRepository;
    }

    @Autowired
    public void setEventLogsRepository(EventRepository eventRepo) {
        this.eventRepository = eventRepo;
    }

    public void updateEven(List<String> arrSerId, Event eve, long serviveId, List<Integer> propServsList) {
        if (Objects.nonNull(arrSerId)) {
            String result = "";
            List<Integer> lsid = arrSerId.stream().map(Integer::parseInt).sorted().collect(Collectors.toList());
            if (!lsid.contains(serviveId)) {
                lsid.add((int) serviveId);
                result = lsid.stream().map(n -> String.valueOf(n)).collect(Collectors.joining(","));

            }
            if (lsid.containsAll(propServsList)) {
                eve.setEvent_status(Boolean.TRUE);
            }
            eve.setService_ids(result);
            eventRepository.save(eve);
        }
    }

    public void saveReglogs(String details, String keyIdentifierNumber, Long eventID) {
        RegulatoryLogs regulatoryLogs = new RegulatoryLogs();
        String errorMesg = null;
        regulatoryLogs.setEvent_id(eventID);
        regulatoryLogs.setKeyIdentifierNumber(keyIdentifierNumber);
        regulatoryLogs.setRequest("");
        regulatoryLogs.setResponse(details);
        regulatoryLogs.setStatus(Boolean.FALSE);
        regulatoryLogs.setDate(Timestamp.valueOf(LocalDateTime.now()));
        regulatoryRepository.save(regulatoryLogs);
    }
}
