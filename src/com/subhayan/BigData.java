package com.subhayan.employees;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Collectors;

public class BigData {
    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            Optional<Long> result = Files.lines(Path.of("C:\\Users\\Subhayan\\Downloads\\Hr5m\\Hr5m.csv"))
                    .skip(1)
//                    .limit(10)
                    .map(s -> s.split(","))
                    .map(arrOfStr -> Long.parseLong(arrOfStr[25]))
                    .reduce((a, b) -> a + b);
            long endTime = System.currentTimeMillis();
            System.out.println("Using reduce() it took " + (double) (endTime - startTime)/1000 + " seconds to process.");
            System.out.println(result.orElse(0L));

            long startTime2 = System.currentTimeMillis();
            Long result2 = Files.lines(Path.of("C:\\Users\\Subhayan\\Downloads\\Hr5m\\Hr5m.csv"))
                    .skip(1)
                    .map(s -> s.split(","))
                    .map(arrOfStr -> Long.parseLong(arrOfStr[25]))
                    .collect(Collectors.summingLong(sal -> sal));
            long endTime2 = System.currentTimeMillis();
            System.out.println("Using collect() it took " + (double) (endTime2 - startTime2)/1000 + " seconds to process.");
            System.out.println(result2);

            long startTime3 = System.currentTimeMillis();
            Long result3 = Files.lines(Path.of("C:\\Users\\Subhayan\\Downloads\\Hr5m\\Hr5m.csv"))
                    .parallel()
                    .skip(1)
                    .map(s -> s.split(","))
                    .map(arrOfStr -> Long.parseLong(arrOfStr[25]))
                    .mapToLong(sal -> sal)
                    .sum();
            long endTime3 = System.currentTimeMillis();
            System.out.println("Using parallel() it took " + (double) (endTime3 - startTime3)/1000 + " seconds to process.");
            System.out.println(result3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
