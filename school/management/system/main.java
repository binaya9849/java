package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void  main(String[]args){
        teacher lizzy = new teacher(1,"Lizzy",500);
        teacher mellisa = new teacher(2,"Mellisa",700);
        teacher vanderhorn = new teacher(3,"Vanderhorn",600);

        List<teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);


        student tamasha = new student(1,"Tamasha",4);
        student rakshith = new student(2,"Rakshith Vasudev",12);
        student rabbi = new student(3,"Rabbi",5);
        List<student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);




        school ghs = new school(teacherList,studentList);

        teacher megan = new teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(rakshith);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);

    }
}
