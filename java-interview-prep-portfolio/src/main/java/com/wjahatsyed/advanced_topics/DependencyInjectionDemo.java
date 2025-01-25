package com.wjahatsyed.advanced_topics;

interface Service {
    void execute();
}

class EmailService implements Service {
    public void execute() {
        System.out.println("Executing Email Service...");
    }
}

class ServiceConsumer {
    private final Service service;

    public ServiceConsumer(Service service) {
        this.service = service;
    }

    public void process() {
        service.execute();
    }
}

public class DependencyInjectionDemo {
    public static void main(String[] args) {
        Service emailService = new EmailService();
        ServiceConsumer consumer = new ServiceConsumer(emailService);
        consumer.process();
    }
}
