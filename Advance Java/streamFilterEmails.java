//Given a list of emails, filter only valid emails (contain "@" and ".").

import java.util.*;

class streamFilterEmails{
    public static void main(String[] args) {

        List<String> emails = List.of(
                "test@gmail.com",
                "hello123",
                "user@yahoo.in",
                "abc@com",
                "name@domain.com"
        );

        emails.stream()
              .filter(e -> e.contains("@") && e.contains("."))
              .forEach(System.out::println);
    }
}
