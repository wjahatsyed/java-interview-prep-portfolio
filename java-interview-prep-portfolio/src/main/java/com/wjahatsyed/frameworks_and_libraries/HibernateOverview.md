# Hibernate Framework Overview

Hibernate is an Object-Relational Mapping (ORM) framework for Java, simplifying database operations by mapping Java classes to database tables.

## Key Features
1. **Annotations**: Use JPA annotations for configuration.
2. **HQL**: Hibernate Query Language for database operations.
3. **Caching**: First-level and second-level caching for performance.
4. **Lazy Loading**: Fetching data only when required.

## Advantages
- Reduces boilerplate SQL code.
- Supports various databases.
- Enhances performance with caching.

## Example
```java
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    // Getters and Setters
}
