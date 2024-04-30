public class Student extends Admin {

    String matricNo;
    String AdmissionNo;

    String Registercourse() {
        return "CMP 202";
    }

    String CheckResult() {
        matricNo = "BHU/22/04/05/0009";
        AdmissionNo = "154096754";
        if (matricNo.contains("BHU/22/04/05/0009") || AdmissionNo.contains("154096754")) {
            return "Your result is:";
        } else {
            return "Incorrect username or password.";
        }
    }

    public static void main(String[] args) {
        Student CheckResult = new Student();
        System.out.println(CheckResult.CheckResult());
    }
}
