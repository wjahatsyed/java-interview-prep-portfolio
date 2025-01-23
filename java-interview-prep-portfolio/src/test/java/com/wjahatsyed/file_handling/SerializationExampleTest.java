package com.wjahatsyed.file_handling;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SerializationExampleTest {

    @Test
    void testSerializationAndDeserialization() throws IOException, ClassNotFoundException {
        SerializationExample example = new SerializationExample();
        SerializationExample.Person person = new SerializationExample.Person("Alice", 30);

        // Serialize the object
        example.serializePerson(person);

        // Deserialize and assert
        SerializationExample.Person deserializedPerson = example.deserializePerson();
        assertNotNull(deserializedPerson, "Deserialized object should not be null");
        assertEquals(person.getName(), deserializedPerson.getName(), "Name should match after deserialization");
        assertEquals(person.getAge(), deserializedPerson.getAge(), "Age should match after deserialization");
    }
}
