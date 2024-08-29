public class Student {
    
    // Properties
    String  firstName;
    String lastName;
    int age;
    String rollNumber;

    Student(String rollNumber){
        this.rollNumber = rollNumber;
    }

    Student(String firstName, String lastName,int age, String rollNumber){
        this(rollNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    //Builder
    public static class Builder{
        String  firstName;
        String lastName;
        int age;
        String rollNumber;

        public Builder withName(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(int age){
            this.age = age;
            return this;
        }
        public Builder withRollNumber(String rollNumber){
            this.rollNumber = rollNumber;
            return this;
        }
        public Student build(){
            return new Student(
                firstName,
                lastName,
                age,
                rollNumber
            );
        }


    }

    public String fullName(){
        return firstName + " " + lastName;
    }
}
