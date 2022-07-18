package com.nicky.springcloudrabbit.tasks;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class StreamBridgeTasks {
    private final StreamBridge streamBridge;

    List<String> destList = Arrays.asList("data-in", "data-out", "consume-in");
    private static int pos = 0;

    public void send(String bindingName, String payload) {
        streamBridge.send(bindingName, payload);
    }

    @Scheduled(fixedDelay = 5000L)
    public void sendMessage() {
        String dest = destList.get(pos++ % 3);
        String msg = "HelloWorld : " + System.currentTimeMillis();
        log.info("===========================================");
        log.info("DEST : {} , MSG {} ", dest, msg);
        send(dest, msg);
    }
}
