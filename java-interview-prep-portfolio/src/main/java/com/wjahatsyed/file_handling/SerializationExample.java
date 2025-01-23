package com.wjahatsyed.file_handling;

import java.io.*;

public class SerializationExample {

    private static final String FILE_PATH = "person.ser";

    public static class Person implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public void serializePerson(Person person) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(person);
        }
    }

    public Person deserializePerson() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (Person) ois.readObject();
        }
    }
}
