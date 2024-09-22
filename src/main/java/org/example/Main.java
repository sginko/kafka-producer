package org.example;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String something;
        String exit;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter something: ");
            something = scan.nextLine();

            Properties props = new Properties();
            props.put("bootstrap.servers", "localhost:9092");
            props.put("acks", "all");
            props.put("retries", 0);
            props.put("batch.size", 16384);
            props.put("linger.ms", 1);
            props.put("buffer.memory", 33554432);
            props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
            props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

            Producer<String, String> producer = new KafkaProducer<>(props);
            producer.send(new ProducerRecord<String, String>("my-topic", something));
            producer.close();

            System.out.print("Do you want continue? N / Y: ");
            exit = scan.nextLine().toLowerCase();
        } while (exit.equals("y"));
        scan.close();
    }
}
