public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder studentOrder1 = new StudentOrder();
        studentOrder1.hFirstName = "Толик";
        studentOrder1.hLastName = "Александров";
        studentOrder1.wFirstName = "Елена";
        studentOrder1.wLastName = "Александрова";
        save(studentOrder1);
    }
    static long save(StudentOrder studentOrder){
        return  199;
    }
}
