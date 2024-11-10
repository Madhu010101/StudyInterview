package za.co.fnb.cish.fid.zos.loader.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.fnb.cish.fid.repo.model.events.Event;
import za.co.fnb.cish.fid.repo.model.events.EventLogs;
import za.co.fnb.cish.fid.repo.model.events.RegulatoryLogs;
import za.co.fnb.cish.fid.repo.repository.events.EventLogsRepository;
import za.co.fnb.cish.fid.repo.repository.events.EventRepository;
import za.co.fnb.cish.fid.repo.repository.events.RegulatoryRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class EvenLogsImpl {

    private EventRepository eventRepository;
    private EventLogsRepository eventLogsRepository;

    private RegulatoryRepository regulatoryRepository;

    @Autowired
    public void setEventRepository(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Autowired
    public void setRegulatoryRepository(RegulatoryRepository regulatoryRepository) {
        this.regulatoryRepository = regulatoryRepository;
    }

    @Autowired
    public void setEventLogsRepository(EventLogsRepository eventLogsRepository) {
        this.eventLogsRepository = eventLogsRepository;
    }

    public void saveEventlogs(String details, String keyIdentifierNumber, Long eventID) {
        EventLogs eventLogs = new EventLogs();
        String errorMesg = null;
        eventLogs.setEvent_id(eventID);
        eventLogs.setKeyIdentifierNumber(keyIdentifierNumber);
        eventLogs.setError_description(details);
        eventLogs.setStatus(Boolean.FALSE);
        eventLogs.setDate(Timestamp.valueOf(LocalDateTime.now()));
        eventLogsRepository.save(eventLogs);
    }


    public void updateEvent(List<String> arrSerId, Event eve, long serviveId, List<Long> propServsList) {
        if (Objects.nonNull(arrSerId)) {
            String result = "";
            List<Long> lsid = arrSerId.stream().map(Long::parseLong).collect(Collectors.toList());

            if (serviveId == 0 && lsid.containsAll(propServsList)) {
                result = lsid.stream().sorted().map(n -> String.valueOf(n)).collect(Collectors.joining(","));
                eve.setEvent_status(Boolean.TRUE);
            } else if (!lsid.contains(serviveId) && serviveId != 0) {
                lsid.add(serviveId);
                // lsid.stream().sorted().collect(Collectors.toList());
                result = lsid.stream().sorted().map(n -> String.valueOf(n)).collect(Collectors.joining(","));
            }
            if (lsid.containsAll(propServsList)) {
                eve.setEvent_status(Boolean.TRUE);
            }
            eve.setService_ids(result);
            eventRepository.save(eve);
        }
    }

    public void saveReglogs(String details, String keyIdentifierNumber, Long eventID, String request) {
        RegulatoryLogs regulatoryLogs = new RegulatoryLogs();
        regulatoryLogs.setEvent_id(eventID);
        regulatoryLogs.setKeyIdentifierNumber(keyIdentifierNumber);
        regulatoryLogs.setRequest(request);
        regulatoryLogs.setResponse(details);
        regulatoryLogs.setStatus(Boolean.FALSE);
        regulatoryLogs.setDate(Timestamp.valueOf(LocalDateTime.now()));
        regulatoryRepository.save(regulatoryLogs);
    }
}
