package day43Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        Course turkishDay = new Course("Turkish Daytime QA",213,"Spring",97);

        Course turkishNight = new Course("Turkish Nighttime QA",245,"Winter",98);

        Course englishDay = new Course("English Daytime Java Dev",121,"Spring",91);

        Course englishNight = new Course("English Daytime Java Dev",137,"Winter",95);

        List<Course> courseList = new ArrayList<>();

        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(isAvgScoreGreaterThanANumber(90,courseList));

        System.out.println(isAnyCourseNameContainsAWord(courseList,"QA"));

        System.out.println(getCourseNameWhoseAverageMax(courseList));

        System.out.println(getCourseBetterThanLastTwo(courseList));

        System.out.println(getHighestThird(courseList));

        System.out.println(getCourseWhoseRegisteredStdLessThanANumber(courseList,150));
    }

    //Example 1: Tüm average score'larin 90 dan buyuk olup olmadigini kontrol eden method'u olusturunuz

    public static boolean isAvgScoreGreaterThanANumber(int average,List<Course> course){
        return course.stream().allMatch(t -> t.getAverageScore() > average);
    }

    //Example 2: En az bir kurs isminin QA icerip icermedigini kontrol eden method'u olusturunuz
    public static boolean isAnyCourseNameContainsAWord(List<Course> courseList,String word){
        return courseList.stream().anyMatch(t -> t.getCourseName().contains(word));
    }
    //Example 3: En yuksek average score'a sahip course ismini yazdiran method'u olusturunuz

    public static String getCourseNameWhoseAverageMax(List<Course> courseList){
        Course course = courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                findFirst().
                get();
        //bu course veriable'ini daha fazla kullanicaksak olusturabiliriz,fakat kullanmicaksak get() den sonra getCourseName koyabiliriz.
        return course.getCourseName();
    }

    //Example 4: Average score'u en dusuk olan ilk 2 course disindaki tum course'lari return eden method'u olusturunuz

    public static List<Course> getCourseBetterThanLastTwo(List<Course> courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                collect(Collectors.toList());
    }

    //Example 5: Average score'u ustten 3. olan kursu veren method'u olusturunuz
    public static Course getHighestThird(List<Course> courseList){
       return courseList.
               stream().
               sorted(Comparator.comparing(Course::getAverageScore).reversed()).
               skip(2).
               limit(1).//Geri kalanlardan kac tanesi alacagimizi belirler
               collect(Collectors.toList()).
               get(0);
    }

    //Example 6: Ogrenci sayisi 150 den az olan course'lari return eden method'u olusturunuz
    public static List<Course> getCourseWhoseRegisteredStdLessThanANumber(List<Course> courseList,int numOfStd){
        return courseList.stream().filter(t -> t.getNumOfStudent() < numOfStd).collect(Collectors.toList());
    }

}
