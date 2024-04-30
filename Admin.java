class Admin extends User2{


    String staffNo;
    String uploadResult(String course,float score){
        System.out.println(course + " " + score );
        return score;
    }

}