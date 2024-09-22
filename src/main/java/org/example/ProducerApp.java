//package org.example;
//
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.Producer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//
//import java.util.Properties;
//import java.util.Scanner;
//
//public class ProducerApp {
//    public void run() {
//        boolean exit = false;
//        Scanner scanner = new Scanner(System.in);
//        try {
//            while (!exit) {
//                exit = createMessage(scanner);
//            }
//        } catch (Exception e) {
//            System.out.println("Wystąpił problem, przepraszamy: " + e);
//            run();
//        }
//    }
//
//    private boolean createMessage(Scanner scanner) {
//        System.out.println("Enter text: ");
//        String text = scanner.nextLine();
//
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "localhost:9092");
//        props.put("acks", "all");
//        props.put("retries", 0);
//        props.put("batch.size", 16384);
//        props.put("linger.ms", 1);
//        props.put("buffer.memory", 33554432);
//        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//
//        Producer<String, String> producer = new KafkaProducer<>(props);
//            producer.send(new ProducerRecord<String, String>("my-topic", text));
//        producer.close();
//        return
//    }
//
//    private void kafkaProducer(cre){
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "localhost:9092");
//        props.put("acks", "all");
//        props.put("retries", 0);
//        props.put("batch.size", 16384);
//        props.put("linger.ms", 1);
//        props.put("buffer.memory", 33554432);
//        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//
//        Producer<String, String> producer = new KafkaProducer<>(props);
//        producer.send(new ProducerRecord<String, String>("my-topic", text));
//        producer.close();
//
//    }
//}
