package assignment1_spring;

import java.util.*;
import java.util.stream.*;

public class StudentProcessing 
{

    public static Map<String, Set<Student>> processStudents(Set<Student> students) 
    {

        Comparator<Student> comparator =
                Comparator.comparingDouble(Student::getGpa)
                        .thenComparing(Comparator.comparingInt(Student::getAge).reversed());

        return students.stream()
                .collect(Collectors.groupingBy(Student::getMajor))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 5)
                .filter(e -> e.getValue()
                        .stream()
                        .mapToDouble(Student::getGpa)
                        .average()
                        .orElse(0) > 3.0)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        e -> e.getValue()
                                .stream()
                                .sorted(comparator)
                                .collect(Collectors.toCollection(LinkedHashSet::new))
                ));
    }
}