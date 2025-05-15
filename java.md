# Comprehensive Java Programming Notes

## 1. Java Basics

### Introduction to Java

Java is a high-level, class-based, object-oriented programming language designed to be platform-independent ("Write Once, Run Anywhere").

### Key Features of Java

- Platform Independence (WORA)
- Object-Oriented
- Simple and Easy to Learn
- Secure
- Robust
- Multithreaded
- High Performance
- Distributed

### Understanding JDK, JRE, and JVM

- **JDK (Java Development Kit)**: Development tools + JRE
- **JRE (Java Runtime Environment)**: Runtime environment + libraries
- **JVM (Java Virtual Machine)**: Executes bytecode

### Setting up Java Environment

1. Download JDK from Oracle website
2. Install JDK
3. Set JAVA_HOME environment variable
4. Add Java to PATH
5. Verify installation: `java -version`

### First Java Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Java Program Structure

- Package Declaration
- Import Statements
- Class Definition
- Main Method
- Methods and Fields

## 2. Data Types and Variables

### Primitive Data Types

- **byte**: 8-bit integer (-128 to 127)
- **short**: 16-bit integer (-32,768 to 32,767)
- **int**: 32-bit integer
- **long**: 64-bit integer
- **float**: 32-bit floating-point
- **double**: 64-bit floating-point
- **char**: 16-bit Unicode character
- **boolean**: true/false

### Non-primitive Data Types

- Arrays
- Classes
- Interfaces
- Strings
- Enums

### Type Casting

```java
// Implicit casting (Widening)
int x = 10;
long y = x;

// Explicit casting (Narrowing)
double d = 10.5;
int i = (int) d;
```

### Constants

```java
final double PI = 3.14159;
```

## 3. Operators

### Arithmetic Operators

- `+` (Addition)
- `-` (Subtraction)
- `*` (Multiplication)
- `/` (Division)
- `%` (Modulus)
- `++` (Increment)
- `--` (Decrement)

### Relational Operators

- `==` (Equal to)
- `!=` (Not equal to)
- `>` (Greater than)
- `<` (Less than)
- `>=` (Greater than or equal to)
- `<=` (Less than or equal to)

### Logical Operators

- `&&` (AND)
- `||` (OR)
- `!` (NOT)

### Bitwise Operators

- `&` (AND)
- `|` (OR)
- `^` (XOR)
- `~` (NOT)
- `<<` (Left shift)
- `>>` (Right shift)
- `>>>` (Unsigned right shift)

### Ternary Operator

```java
condition ? expression1 : expression2
```

## 4. Control Flow Statements

### Conditional Statements

```java
// if-else
if (condition) {
    // code
} else if (condition2) {
    // code
} else {
    // code
}

// switch
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}
```

### Loops

```java
// for loop
for (initialization; condition; update) {
    // code
}

// while loop
while (condition) {
    // code
}

// do-while loop
do {
    // code
} while (condition);

// Enhanced for loop (for-each)
for (Type item : collection) {
    // code
}
```

## 5. Methods

### Method Declaration

```java
accessModifier returnType methodName(parameters) {
    // method body
    return value;
}
```

### Method Overloading

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}
```

### Static Methods

```java
public class MathUtils {
    public static int square(int num) {
        return num * num;
    }
}
```

## 6. Arrays

### Array Declaration and Initialization

```java
// Single dimensional array
int[] numbers = new int[5];
int[] numbers = {1, 2, 3, 4, 5};

// Multi-dimensional array
int[][] matrix = new int[3][3];
int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
```

## 7. Object-Oriented Programming

### Classes and Objects

```java
public class Car {
    // Fields
    private String brand;
    private String model;
    
    // Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    // Methods
    public void start() {
        System.out.println("Car starting...");
    }
}
```

### Inheritance

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starting");
    }
}
```

### Polymorphism

```java
// Method Overriding (Runtime Polymorphism)
Vehicle vehicle = new Car();
vehicle.start(); // Calls Car's start method

// Method Overloading (Compile-time Polymorphism)
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}
```

### Encapsulation

```java
public class BankAccount {
    private double balance;
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

### Abstraction

```java
abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    private double radius;
    
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
```

## 8. Design Patterns

### Creational Patterns

```java
// Singleton Pattern
public class Singleton {
    private static volatile Singleton instance;
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

// Builder Pattern
public class Pizza {
    private final String dough;
    private final String sauce;
    private final String topping;

    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    public static class Builder {
        private String dough;
        private String sauce;
        private String topping;

        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

// Factory Pattern
interface Animal { void makeSound(); }
class Dog implements Animal {
    public void makeSound() { System.out.println("Woof!"); }
}
class Cat implements Animal {
    public void makeSound() { System.out.println("Meow!"); }
}

class AnimalFactory {
    public Animal createAnimal(String type) {
        return switch (type.toLowerCase()) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            default -> throw new IllegalArgumentException("Unknown animal type");
        };
    }
}
```

### Structural Patterns

```java
// Adapter Pattern
interface MediaPlayer {
    void play(String filename);
}

interface AdvancedMediaPlayer {
    void playMp4(String filename);
    void playMkv(String filename);
}

class Mp4Player implements AdvancedMediaPlayer {
    public void playMp4(String filename) {
        System.out.println("Playing MP4: " + filename);
    }
    public void playMkv(String filename) {}
}

class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer = new Mp4Player();
        }
    }

    public void play(String filename) {
        advancedPlayer.playMp4(filename);
    }
}

// Decorator Pattern
interface Coffee {
    double cost();
    String description();
}

class SimpleCoffee implements Coffee {
    public double cost() { return 1; }
    public String description() { return "Simple coffee"; }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;
    
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    
    public double cost() { return decoratedCoffee.cost(); }
    public String description() { return decoratedCoffee.description(); }
}

class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }
    
    public double cost() { return super.cost() + 0.5; }
    public String description() { return super.description() + " + milk"; }
}
```

## 9. Modern Java Features

### Optional Class

```java
// Optional usage
public class OptionalExample {
    public Optional<User> findUserById(String id) {
        // Might return empty Optional
        return Optional.ofNullable(database.query(id));
    }
    
    public void processUser(String id) {
        Optional<User> user = findUserById(id);
        
        // Different ways to handle Optional
        user.ifPresent(u -> System.out.println(u.getName()));
        
        String name = user.map(User::getName)
                         .orElse("Unknown");
                         
        User defaultUser = user.orElseGet(() -> new User("default"));
        
        user.filter(u -> u.getAge() > 18)
            .ifPresent(this::sendEmail);
    }
}
```

### Records (Java 16+)

```java
// Simple immutable data class
public record Person(String name, int age) {
    // Compact constructor
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
    
    // Additional methods
    public boolean isAdult() {
        return age >= 18;
    }
}

// Usage
Person person = new Person("John", 25);
String name = person.name();  // Getter
int age = person.age();      // Getter
```

### Sealed Classes (Java 17+)

```java
public sealed class Shape 
    permits Circle, Rectangle, Square {
    // Common shape properties
}

public final class Circle extends Shape {
    private double radius;
    // Circle specific implementation
}

public final class Rectangle extends Shape {
    private double width;
    private double height;
    // Rectangle specific implementation
}

public final class Square extends Shape {
    private double side;
    // Square specific implementation
}
```

### Pattern Matching (Java 16+)

```java
// Pattern Matching for instanceof
if (obj instanceof String s && s.length() > 5) {
    System.out.println(s.toUpperCase());
}

// Switch Expression with Pattern Matching (Preview)
Object obj = // ...
String formatted = switch (obj) {
    case Integer i -> String.format("int %d", i);
    case Long l    -> String.format("long %d", l);
    case Double d  -> String.format("double %f", d);
    case String s  -> String.format("String %s", s);
    default        -> obj.toString();
};
```

### Text Blocks (Java 15+)

```java
String json = """
    {
        "name": "John Doe",
        "age": 30,
        "address": {
            "street": "123 Main St",
            "city": "Boston"
        }
    }
    """;

String query = """
    SELECT u.id, u.name, u.email
    FROM users u
    WHERE u.active = true
    ORDER BY u.name
    """;
```

## 10. Java Concurrency

### Thread Management

```java
// Basic Thread Creation
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

// Using Runnable
Runnable task = () -> {
    System.out.println("Task running in: " + Thread.currentThread().getName());
};
Thread thread = new Thread(task);
thread.start();

// Thread Pool
ExecutorService executor = Executors.newFixedThreadPool(4);
executor.submit(() -> {
    System.out.println("Task executed by " + Thread.currentThread().getName());
});
```

### Synchronization

```java
// Synchronized Method
public class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
    }
}

// Synchronized Block
public void incrementBlock() {
    synchronized(this) {
        count++;
    }
}

// Lock Interface
class BankAccount {
    private final Lock lock = new ReentrantLock();
    private double balance;

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
        } finally {
            lock.unlock();
        }
    }
}
```

### Concurrent Collections

```java
// Thread-safe collections
ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
BlockingQueue<String> queue = new LinkedBlockingQueue<>();
CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

// Usage example
BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
// Producer
queue.put("message");
// Consumer
String message = queue.take();
```

### CompletableFuture

```java
// Async operations
CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
    // Long running task
    return "Result";
});

// Chaining operations
future.thenApply(String::toUpperCase)
      .thenAccept(System.out.println)
      .exceptionally(ex -> {
          System.err.println("Error: " + ex.getMessage());
          return null;
      });

// Combining futures
CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "World");

CompletableFuture.allOf(future1, future2)
                 .thenRun(() -> System.out.println("All completed"));
```

## 11. Java IO and NIO

### Traditional IO

```java
// File Reading
try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
}

// File Writing
try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
    writer.write("Hello, World!");
    writer.newLine();
}

// Binary File Operations
try (FileInputStream in = new FileInputStream("input.bin");
     FileOutputStream out = new FileOutputStream("output.bin")) {
    byte[] buffer = new byte[1024];
    int bytesRead;
    while ((bytesRead = in.read(buffer)) != -1) {
        out.write(buffer, 0, bytesRead);
    }
}
```

### NIO.2 (Modern IO)

```java
// Path operations
Path path = Paths.get("example.txt");
Files.createFile(path);
Files.write(path, "Hello".getBytes());
List<String> lines = Files.readAllLines(path);

// Directory operations
Path dir = Paths.get("mydir");
Files.createDirectory(dir);
try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
    for (Path entry : stream) {
        System.out.println(entry.getFileName());
    }
}

// File Channel
try (FileChannel channel = FileChannel.open(path, 
        StandardOpenOption.READ, StandardOpenOption.WRITE)) {
    ByteBuffer buffer = ByteBuffer.allocate(1024);
    int bytesRead = channel.read(buffer);
    buffer.flip();
    // Process buffer
}

// Async IO
AsynchronousFileChannel channel = AsynchronousFileChannel.open(
    path, StandardOpenOption.READ);
ByteBuffer buffer = ByteBuffer.allocate(1024);
Future<Integer> operation = channel.read(buffer, 0);

// Watch Service
WatchService watchService = FileSystems.getDefault().newWatchService();
Path directory = Paths.get(".");
directory.register(watchService, 
    StandardWatchEventKinds.ENTRY_CREATE,
    StandardWatchEventKinds.ENTRY_DELETE,
    StandardWatchEventKinds.ENTRY_MODIFY);

WatchKey key;
while ((key = watchService.take()) != null) {
    for (WatchEvent<?> event : key.pollEvents()) {
        System.out.println(event.kind() + ": " + event.context());
    }
    key.reset();
}
```

### Resource Management

```java
// Try-with-resources
public void copyFile(Path source, Path target) {
    try (InputStream in = Files.newInputStream(source);
         OutputStream out = Files.newOutputStream(target)) {
        byte[] buffer = new byte[1024];
        int read;
        while ((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
    }
}

// Memory-mapped Files
try (RandomAccessFile file = new RandomAccessFile("bigfile.dat", "rw");
     FileChannel channel = file.getChannel()) {
    MappedByteBuffer buffer = channel.map(
        FileChannel.MapMode.READ_WRITE, 0, channel.size());
    // Direct memory access operations
    buffer.putInt(0, 100);
    int value = buffer.getInt(0);
}
```

## 12. Spring Boot and Microservices

### Spring Boot Basics

```java
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}

// REST Controller
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return userService.save(user);
    }
}

// Service Layer
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }
}
```

### Spring Data JPA

```java
// Entity
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Email
    private String email;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders;
}

// Repository
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    
    @Query("SELECT u FROM User u WHERE u.email LIKE %:domain%")
    List<User> findByEmailDomain(@Param("domain") String domain);
}
```

### Spring Security

```java
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
                .antMatchers("/api/public/**").permitAll()
                .antMatchers("/api/admin/**").hasRole("ADMIN")
                .anyRequest().authenticated()
            .and()
            .oauth2ResourceServer()
                .jwt();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

// JWT Authentication
@RestController
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    private JwtTokenProvider tokenProvider;
    
    @PostMapping("/auth/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        Authentication auth = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                request.getUsername(),
                request.getPassword()
            )
        );
        
        String jwt = tokenProvider.generateToken(auth);
        return ResponseEntity.ok(new JwtAuthResponse(jwt));
    }
}
```

## 13. Testing

### Unit Testing with JUnit 5

```java
@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserService userService;
    
    @MockBean
    private UserRepository userRepository;
    
    @Test
    void whenValidUser_thenShouldSave() {
        // Given
        User user = new User("test@test.com");
        given(userRepository.save(any(User.class))).willReturn(user);
        
        // When
        User saved = userService.save(user);
        
        // Then
        assertThat(saved.getEmail()).isEqualTo("test@test.com");
        verify(userRepository).save(user);
    }
    
    @Test
    void whenInvalidEmail_thenThrowException() {
        User user = new User("invalid-email");
        
        assertThrows(ValidationException.class, () -> {
            userService.save(user);
        });
    }
}
```

### Integration Testing

```java
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UserControllerIT {
    @Autowired
    private TestRestTemplate restTemplate;
    
    @Test
    void whenGetUsers_thenStatus200() {
        ResponseEntity<List<User>> response = restTemplate.exchange(
            "/api/users",
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<User>>() {}
        );
        
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotEmpty();
    }
}

// WebTestClient for WebFlux
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ReactiveUserControllerIT {
    @Autowired
    private WebTestClient webClient;
    
    @Test
    void whenGetUsers_thenStatus200() {
        webClient.get().uri("/users")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(User.class)
                .hasSize(10);
    }
}
```

## 14. Best Practices and Design Guidelines

### Clean Code Principles

**Clean Code Principles Overview:**

1. Single Responsibility Principle

```java
// Bad
class UserService {
    public void saveUser(User user) { /* ... */ }
    public void sendEmail(String to) { /* ... */ }
}

// Good
class UserService {
    @Autowired
    private EmailService emailService;
    
    public void saveUser(User user) { /* ... */ }
}

class EmailService {
    public void sendEmail(String to) { /* ... */ }
}
```

1. Don't Repeat Yourself (DRY)

```java
// Bad
class ReportGenerator {
    public void generatePdfReport() {
        // Format data
        // Generate PDF
    }
    
    public void generateExcelReport() {
        // Format same data again
        // Generate Excel
    }
}

// Good
class ReportGenerator {
    private Data formatData() {
        // Format data once
        return data;
    }
    
    public void generatePdfReport() {
        Data data = formatData();
        // Generate PDF
    }
    
    public void generateExcelReport() {
        Data data = formatData();
        // Generate Excel
    }
}
```

1. SOLID Principles

```java
// Interface Segregation
interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
}

interface UserSearchRepository {
    List<User> searchByName(String name);
    List<User> searchByEmail(String email);
}

// Dependency Inversion
class UserService {
    private final UserRepository repository;
    
    UserService(UserRepository repository) {
        this.repository = repository;
    }
}
```

### Performance Best Practices

```java
// String operations
// Bad
String result = "";
for (String str : strings) {
    result += str;
}

// Good
StringBuilder result = new StringBuilder();
for (String str : strings) {
    result.append(str);
}

// Collections
// Bad
List<String> list = new ArrayList<>();
for (int i = 0; i < 10_000; i++) {
    list.add(0, element); // O(n) operation
}

// Good
LinkedList<String> list = new LinkedList<>();
for (int i = 0; i < 10_000; i++) {
    list.addFirst(element); // O(1) operation
}

// Stream API Best Practices
// Bad
list.stream()
    .filter(x -> x > 5)
    .collect(Collectors.toList())
    .stream()
    .map(x -> x * 2)
    .collect(Collectors.toList());

// Good
list.stream()
    .filter(x -> x > 5)
    .map(x -> x * 2)
    .collect(Collectors.toList());
```

### Security Best Practices

```java
// Password Handling
// Bad
String password = "plaintext";
database.save(password);

// Good
@Autowired
private PasswordEncoder passwordEncoder;

String hashedPassword = passwordEncoder.encode(password);
database.save(hashedPassword);

// SQL Injection Prevention
// Bad
String sql = "SELECT * FROM users WHERE username = '" + username + "'";

// Good
String sql = "SELECT * FROM users WHERE username = ?";
preparedStatement.setString(1, username);

// XSS Prevention
@GetMapping("/user")
public String displayUser(@RequestParam String name) {
    // Bad
    return "<div>" + name + "</div>";
    
    // Good
    return "<div>" + HtmlUtils.htmlEscape(name) + "</div>";
}
```
