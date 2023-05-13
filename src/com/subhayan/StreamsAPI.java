package com.subhayan.employees;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class StreamsAPI {
    public static void main(String[] args) {
        String peopleText = """
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
                Flinstone, Fred, 1/1/1900, Programmerzzzz, {locpd=2000,yoe=10,iq=140}
                Flinstone2, Fred2, 1/1/1900, Programmer, {locpd=1300,yoe=10,iq=100}
                Flinstone3, Fred3, 1/1/1900, Programmer, {locpd=2300,yoe=10,iq=105}
                Flinstone4, Fred4, 1/1/1900, Programmer, {locpd=1630,yoe=10,iq=115}
                Flinstone5, Fred5, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
                Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
                Rubble2, Barney2, 2/2/1905, Manager, {orgSize=100,dr=4}
                Rubble3, Barney3, 2/2/1905, Manager, {orgSize=200,dr=2}
                Rubble4, Barney4, 2/2/1905, Manager, {orgSize=500,dr=8}
                Rubble5, Barney5, 2/2/1905, Manager, {orgSize=175,dr=20}
                Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}
                Flinstone2, Wilma2, 3/3/1910, Analyst, {projectCount=4}
                Flinstone3, Wilma3, 3/3/1910, Analyst, {projectCount=5}
                Flinstone4, Wilma4, 3/3/1910, Analyst, {projectCount=6}
                Flinstone5, Wilma5, 3/3/1910, Analyst, {projectCount=9}
                Rubble, Betty, 4/4/1915, CEO, {avgStockPrice=300}
                """;

        peopleText
                .lines()
//                .map((String s) -> Employee.createEmployee(s))
                .map(Employee::createEmployee)
                .forEach(System.out::println);  // method reference
                // Alternative --> lambda expression
                // .forEach((String s) -> System.out.println(s));
                // .forEach(s -> System.out.println(s));


        List<String> nums = List.of("one", "two", "three", "four");
        nums
            .stream()  // this is how to create a stream from a collection
            .map(s -> s.toUpperCase()) // .map(String::toUpperCase)
            .forEach(System.out::println);

        // Using Stream class to create a stream of strings
        Stream.of("one", "two", "three", "four")
                .map(String::hashCode)
                .map(Integer::toHexString)
                .forEach(System.out::println);


        try {
            Files.lines(Path.of("C:\\Users\\Subhayan\\Desktop\\NewMavenProj\\Employees\\src\\main\\java\\com\\subhayan\\employees\\employees.txt"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
