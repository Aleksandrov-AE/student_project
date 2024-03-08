package edu.studenorder.domain;

public class SaveStudentOrder {
    public static void main(String[] args) {
        Adult adult = new Adult();

    }
    public static StudentOrder buildStudentOrder(long id) {
        StudentOrder studentOrder = new StudentOrder();
        studentOrder.setStudentOrderId(id);
        return studentOrder;
    }
    static long save(StudentOrder studentOrder) {
        return  199;
    }
}
