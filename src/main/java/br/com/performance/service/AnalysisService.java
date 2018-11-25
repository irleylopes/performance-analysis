package br.com.performance.service;

import org.springframework.stereotype.Service;

@Service
public class AnalysisService implements AnalysisServiceI {

    @Override
    public void home() {
        try {
            new Thread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
